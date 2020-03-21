package com.xingyun.productcommentservice.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

@Slf4j
public class AesUtils {

    /**
     * 可配置到Constant中，并读取配置文件注入,16位,自己定义
     */
    private static final String KEY = "Kb641D48d70b7f20";

    /**
     * 参数分别代表 算法名称/加密模式/数据填充方式
     */
    private static final String ALGORITHMSTR = "AES/ECB/PKCS5Padding";

    public static String encrypt(String content) throws Exception {
        return encrypt(content, KEY);
    }
    public static String decrypt(String encryptStr) throws Exception {
        return decrypt(encryptStr, KEY);
    }
    /**
     * 加密
     * @param content 加密的字符串
     * @param encryptKey key值
     * @return
     * @throws Exception
     */
    private static String encrypt(String content, String encryptKey) throws Exception {
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        kgen.init(128);
        Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(encryptKey.getBytes(), "AES"));
        byte[] b = cipher.doFinal(content.getBytes("utf-8"));
        // 采用base64算法进行转码,避免出现中文乱码
        return Base64.encodeBase64String(b);

    }

    /**
     * 解密
     * @param encryptStr 解密的字符串
     * @param decryptKey 解密的key值
     * @return
     * @throws Exception
     */
    private static String decrypt(String encryptStr, String decryptKey) throws Exception {
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        kgen.init(128);
        Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(decryptKey.getBytes(), "AES"));
        // 采用base64算法进行转码,避免出现中文乱码
        byte[] encryptBytes = Base64.decodeBase64(encryptStr);
        byte[] decryptBytes = cipher.doFinal(encryptBytes);
        return new String(decryptBytes);
    }
}

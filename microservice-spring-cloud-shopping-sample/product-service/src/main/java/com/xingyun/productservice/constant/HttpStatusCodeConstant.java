package com.xingyun.productservice.constant;

/**
 /**
 * @see [https://tool.lu/httpcode/]([https://tool.lu/httpcode/]),
 *      [https://httpstatuses.com/](https://httpstatuses.com/)
 * @author qing-feng.zhao
 * @description Http Status Code Constant
 * @date 2020/2/5 13:40
 */
public final class HttpStatusCodeConstant {
    /**
     * OK
     * (成功)
     * 请求成功.成功的意义根据请求所使用的方法不同而不同.
     * GET: 资源已被提取,并作为响应体传回客户端.
     * HEAD: 实体头已作为响应头传回客户端
     * POST: 经过服务器处理客户端传来的数据,适合的资源作为响应体传回客户端.
     * TRACE: 服务器收到请求消息作为响应体传回客户端.
     */
    public static final Integer OK_CODE=200;
    /**
     * Bad Request
     * (错误请求)
     * 因发送的请求语法错误,服务器无法正常读取.
     */
    public static final Integer BAD_REQUEST_CODE=400;
    /**
     * Internal Server Error
     * (内部服务器错误)
     * 服务器遇到未知的无法解决的问题.
     */
    public static final Integer INTERNAL_SERVER_ERROR_CODE=500;
}

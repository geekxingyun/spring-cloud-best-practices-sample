package com.xingyun.customerservice.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author qing-feng.zhao
 * @description
 * @date 2020/2/5 7:46
 */
@Data
public class CustomerVO implements Serializable {
	/**
	 * 序列化Id
	 */
	private static final long serialVersionUID = -7079021938925671262L;
	/**
	 * 用户数据库主键
	 */
	@ApiModelProperty(value="用户数据库主键")
	private Long id;
	/**
	 * 用户昵称
	 */
	@ApiModelProperty(value="用户昵称")
	private String nikeName;
	/**
	 * 用户头像
	 */
	@ApiModelProperty(value="用户头像")
	private String avatar;
}

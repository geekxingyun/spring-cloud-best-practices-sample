package com.xingyun.singlearchitecturespringbootshoppingsample.business.user.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author qing-feng.zhao
 * @description User 数据传输对象,Data Transfer Object,简称DTO
 * @date 2020/2/5 7:50
 */
@Data
public class UserDTO implements Serializable {
	/**
	 * 序列化Id
	 */
	private static final long serialVersionUID = -8575488180000985633L;
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

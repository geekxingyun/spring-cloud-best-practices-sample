package com.xingyun.singlearchitecturespringbootshoppingsample.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author qing-feng.zhao
 * @description User 数据传输对象,Data Transfer Object,简称DTO
 * @date 2020/2/5 7:50
 */
@Data
public class UserDTO implements Serializable {
	private Long id;
	private String nikeName;
	private String avatar;
}

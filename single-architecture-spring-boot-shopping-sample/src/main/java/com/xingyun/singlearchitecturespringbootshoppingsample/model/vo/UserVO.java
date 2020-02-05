package com.xingyun.singlearchitecturespringbootshoppingsample.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author qing-feng.zhao
 * @description
 * @date 2020/2/5 7:46
 */
@Data
public class UserVO implements Serializable {
	private Long id;
	private String nikeName;
	private String avatar;
}

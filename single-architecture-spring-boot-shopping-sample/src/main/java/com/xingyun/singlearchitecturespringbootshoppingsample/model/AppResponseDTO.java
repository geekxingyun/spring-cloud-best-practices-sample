package com.xingyun.singlearchitecturespringbootshoppingsample.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author qing-feng.zhao
 * @description
 * @date 2020/2/4 17:41
 */
@Component
@Data
public class AppResponseDTO implements Serializable {
	/**
	 * 序列化Id
	 */
	private static final long serialVersionUID = 7020204650750610804L;
	/**
	 * 响应码
	 */
	@ApiModelProperty(value="HTTP响应码")
	private Integer responseCode;
	/**
	 * 响应消息
	 */
	private String responseMessage;
	/**
	 * 响应数据
	 */
	private Object responseData;
}

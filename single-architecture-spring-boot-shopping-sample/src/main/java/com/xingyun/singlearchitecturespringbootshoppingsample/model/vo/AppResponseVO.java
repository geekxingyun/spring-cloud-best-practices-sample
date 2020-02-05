package com.xingyun.singlearchitecturespringbootshoppingsample.model.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author qing-feng.zhao
 * @description
 * @date 2020/2/4 17:41
 */
@Component
@Data
public class AppResponseVO {
	private Integer responseCode;
	private String responseMessage;
	private Object responseData;
}

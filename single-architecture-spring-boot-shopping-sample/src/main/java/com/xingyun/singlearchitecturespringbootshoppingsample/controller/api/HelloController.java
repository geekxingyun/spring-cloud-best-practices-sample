package com.xingyun.singlearchitecturespringbootshoppingsample.controller.api;

import com.xingyun.singlearchitecturespringbootshoppingsample.constant.HttpStatusCodeConstant;
import com.xingyun.singlearchitecturespringbootshoppingsample.model.vo.AppResponseVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qing-feng.zhao
 * @description
 * @date 2020/2/4 17:41
 */
@RequestMapping(value = "/api/v1")
@RestController
public class HelloController {

	private final AppResponseVO appResponseVO;

	public HelloController(AppResponseVO appResponseVO) {
		this.appResponseVO = appResponseVO;
	}

	@GetMapping(value = "/hello.do")
	public AppResponseVO hello(){
		appResponseVO.setResponseCode(HttpStatusCodeConstant.OK_CODE);
		appResponseVO.setResponseMessage("Response Success");
		appResponseVO.setResponseData("this is hello message");
		return appResponseVO;
	}
}

package com.xingyun.singlearchitecturespringbootshoppingsample.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author qing-feng.zhao
 * @description
 * @date 2020/2/4 17:18
 */
@Controller
public class HomePageController {
	@GetMapping(value = {"/","/home","/home.do","/index","/index.do"})
	public String home(){
		return "index";
	}
}

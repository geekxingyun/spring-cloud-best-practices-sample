package com.xingyun.singlearchitecturespringbootshoppingsample.business.product.api;

import com.xingyun.singlearchitecturespringbootshoppingsample.business.product.service.ProductService;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.user.service.UserService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qing-feng.zhao
 */
@RestController
public class ProductEndPoint {

	private final ProductService productService;
	private final UserService userService;

	public ProductEndPoint(ProductService productService, UserService userService) {
		this.productService = productService;
		this.userService = userService;
	}


}

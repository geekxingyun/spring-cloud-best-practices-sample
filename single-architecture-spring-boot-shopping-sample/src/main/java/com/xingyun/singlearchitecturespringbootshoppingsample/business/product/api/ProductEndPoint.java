package com.xingyun.singlearchitecturespringbootshoppingsample.business.product.api;

import com.xingyun.singlearchitecturespringbootshoppingsample.business.product.model.ProductVO;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.product.service.ProductService;
import com.xingyun.singlearchitecturespringbootshoppingsample.constant.HttpStatusCodeConstant;
import com.xingyun.singlearchitecturespringbootshoppingsample.model.AppResponseVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @author qing-feng.zhao
 */
@Api(value = "ProductEndPoint",tags = "产品管理相关API")
@Slf4j
@RestController
public class ProductEndPoint {

	private final AppResponseVO appResponseVO;
	private final ProductService productService;

	public ProductEndPoint(AppResponseVO appResponseVO, ProductService productService) {
		this.appResponseVO = appResponseVO;
		this.productService = productService;
	}


	@ApiOperation(value = "获取产品分页数据",notes ="获取产品分页数据",httpMethod = "GET",tags = "产品管理相关API")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "page",value = "第几页,从0开始,默认为第0页",example = "0",dataType = "int",paramType = "query"),
			@ApiImplicitParam(name = "size",value = "每一页记录数的大小,默认为20",example = "20",dataType = "int",paramType = "query"),
			@ApiImplicitParam(name = "sort",value = "排序,格式为:property,property(,ASC|DESC)的方式组织",example = "ASC",dataType = "String",paramType = "query"),
	})
	@GetMapping(value = "/products")
	public AppResponseVO showProductList(Pageable pageable){
		Page<ProductVO> productVOPageList=productService.getProductListPage(pageable);
		appResponseVO.setResponseCode(HttpStatusCodeConstant.OK_CODE);
		appResponseVO.setResponseMessage("获取产品分页数据成功");
		if(null!=productVOPageList){
			List<ProductVO> productVOList=productVOPageList.getContent();
			appResponseVO.setResponseData(productVOList);
		}else{
			appResponseVO.setResponseData(Collections.EMPTY_LIST);
		}
		return appResponseVO;
	}

	/**
	 * 加载指定的商品配置
	 * @param productId 商品配置Id
	 * @return
	 */
	@ApiOperation(value = "获取产品详情数据",notes = "获取产品详情数据",httpMethod = "GET",tags = "产品管理相关API")
	@ApiImplicitParam(name = "productId",value = "产品表的主键",example = "1",dataType = "int",paramType = "path")
	@GetMapping(value = "/products/{productId}")
	public AppResponseVO loadProduct(@PathVariable(value = "productId")Long productId){
		try {
			ProductVO productVO = productService.loadProduct(productId);
			appResponseVO.setResponseCode(HttpStatusCodeConstant.OK_CODE);
			appResponseVO.setResponseMessage("加载指定的商品配置成功");
			appResponseVO.setResponseData(productVO);
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			appResponseVO.setResponseCode(HttpStatusCodeConstant.INTERNAL_SERVER_ERROR_CODE);
			appResponseVO.setResponseMessage("加载指定的商品配置出错");
			appResponseVO.setResponseData(null);

		}
		return appResponseVO;
	}
}

package com.xingyun.singlearchitecturespringbootshoppingsample.business.productcomment.api;

import com.xingyun.singlearchitecturespringbootshoppingsample.business.productcomment.model.vo.ProductCommentVO;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.productcomment.service.ProductCommentService;
import com.xingyun.singlearchitecturespringbootshoppingsample.constant.HttpStatusCodeConstant;
import com.xingyun.singlearchitecturespringbootshoppingsample.model.AppResponseDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author qing-feng.zhao
 */
@Api(value = "ProductEndPoint",tags = "产品评论管理相关API")
@Slf4j
@RestController
public class ProductCommentEndPoint {
	private final AppResponseDTO appResponseDTO;
	private final ProductCommentService productCommentService;

	public ProductCommentEndPoint(AppResponseDTO appResponseDTO, ProductCommentService productCommentService) {
		this.appResponseDTO = appResponseDTO;
		this.productCommentService = productCommentService;
	}
	@GetMapping(value = "/productComments/{productId}")
	@ApiOperation(value = "获取产品评论列表数据",notes = "获取产品评论列表数据",httpMethod = "GET",tags = "产品评论管理相关API")
	@ApiImplicitParam(name = "productId",value = "产品评论表中产品的ID",example = "1",dataType = "int",paramType = "path")
	public AppResponseDTO listProductComment(@PathVariable(value = "productId")Long productId){
		try {
			List<ProductCommentVO> productCommentVOPageList = this.productCommentService.findByProductIdOrderByCreated(productId);
			appResponseDTO.setResponseCode(HttpStatusCodeConstant.OK_CODE);
			appResponseDTO.setResponseMessage("获取产品评论列表数据成功");
			appResponseDTO.setResponseData(productCommentVOPageList);
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			appResponseDTO.setResponseCode(HttpStatusCodeConstant.INTERNAL_SERVER_ERROR_CODE);
			appResponseDTO.setResponseMessage("获取产品评论列表数据失败");
			appResponseDTO.setResponseData(null);
		}
		return appResponseDTO;
	}
}

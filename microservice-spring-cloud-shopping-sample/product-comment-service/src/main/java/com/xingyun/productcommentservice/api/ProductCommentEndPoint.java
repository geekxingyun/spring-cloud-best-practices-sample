package com.xingyun.productcommentservice.api;

import com.xingyun.productcommentservice.model.ProductCommentVO;
import com.xingyun.productcommentservice.service.ProductCommentService;
import com.xingyun.productcommentservice.constant.HttpStatusCodeConstant;
import com.xingyun.productcommentservice.model.AppResponseVO;
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
	private final AppResponseVO appResponseVO;
	private final ProductCommentService productCommentService;

	public ProductCommentEndPoint(AppResponseVO appResponseVO, ProductCommentService productCommentService) {
		this.appResponseVO = appResponseVO;
		this.productCommentService = productCommentService;
	}
	@GetMapping(value = "/productComments/{productId}")
	@ApiOperation(value = "获取产品评论列表数据",notes = "获取产品评论列表数据",httpMethod = "GET",tags = "产品评论管理相关API")
	@ApiImplicitParam(name = "productId",value = "产品评论表中产品的ID",example = "1",dataType = "int",paramType = "path")
	public AppResponseVO listProductComment(@PathVariable(value = "productId")Long productId){
		try {
			List<ProductCommentVO> productCommentVOPageList = this.productCommentService.findProductCommentByProductId(productId);
			appResponseVO.setResponseCode(HttpStatusCodeConstant.OK_CODE);
			appResponseVO.setResponseMessage("获取产品评论列表数据成功");
			appResponseVO.setResponseData(productCommentVOPageList);
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			appResponseVO.setResponseCode(HttpStatusCodeConstant.INTERNAL_SERVER_ERROR_CODE);
			appResponseVO.setResponseMessage("获取产品评论列表数据失败");
			appResponseVO.setResponseData(null);
		}
		return appResponseVO;
	}
}

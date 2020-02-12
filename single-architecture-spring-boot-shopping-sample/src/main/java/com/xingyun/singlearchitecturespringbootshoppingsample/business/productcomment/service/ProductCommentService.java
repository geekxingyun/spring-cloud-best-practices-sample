package com.xingyun.singlearchitecturespringbootshoppingsample.business.productcomment.service;

import com.xingyun.singlearchitecturespringbootshoppingsample.business.productcomment.vo.ProductCommentVO;

import java.util.List;

/**
 * 商品评论管理repository
 * @author qing-feng.zhao
 */
public interface ProductCommentService{
	/**
	 *
	 * @param productId
	 * @return
	 */
	List<ProductCommentVO> findByProductIdOrderByCreated(Long productId);
}

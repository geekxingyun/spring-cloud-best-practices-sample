package com.xingyun.productcommentservice.service;

import com.xingyun.productcommentservice.model.ProductCommentVO;

import java.util.List;

/**
 * 商品评论管理repository
 * @author qing-feng.zhao
 */
public interface ProductCommentService{
	/**
	 * 根据产品Id 返回所有相关评论
	 * @param productId
	 * @return
	 */
	List<ProductCommentVO> findProductCommentByProductId(Long productId);

	/**
	 * 根据发布者Id 获取评论列表
	 * @param authorId
	 * @return
	 */
	List<ProductCommentVO> findProductCommentByAuthorId(Long authorId);
}

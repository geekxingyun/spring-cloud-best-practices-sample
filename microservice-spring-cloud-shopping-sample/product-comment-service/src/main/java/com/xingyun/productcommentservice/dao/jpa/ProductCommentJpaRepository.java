package com.xingyun.productcommentservice.dao.jpa;

import com.xingyun.productcommentservice.model.ProductCommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author qing-feng.zhao
 */
public interface ProductCommentJpaRepository extends JpaRepository<ProductCommentEntity,Long> {
	/**
	 * 根据产品Id获取评论列表
	 * @param productId 所示产品Id
	 * @return 返回评论列表
	 */
	List<ProductCommentEntity> findAllByProductId(Long productId);

	/**
	 * 根据发布者用户id 查找相关评论列表
	 * @param authorId
	 * @return
	 */
	List<ProductCommentEntity> findAllByAuthorId(Long authorId);
}

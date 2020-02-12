package com.xingyun.singlearchitecturespringbootshoppingsample.business.productcomment.dao.jpa;

import com.xingyun.singlearchitecturespringbootshoppingsample.business.productcomment.entity.ProductCommentEntity;
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
	List<ProductCommentEntity> findByProductIdOrderByCreated(Long productId);
}

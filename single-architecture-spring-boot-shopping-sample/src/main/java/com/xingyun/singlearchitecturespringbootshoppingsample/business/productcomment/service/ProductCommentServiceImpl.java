package com.xingyun.singlearchitecturespringbootshoppingsample.business.productcomment.service;

import com.xingyun.singlearchitecturespringbootshoppingsample.business.productcomment.dao.jpa.ProductCommentJpaRepository;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.productcomment.entity.ProductCommentEntity;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.productcomment.vo.ProductCommentVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qing-feng.zhao
 */
public class ProductCommentServiceImpl implements ProductCommentService{

	@Autowired
	protected ProductCommentJpaRepository productCommentJpaRepository;

	@Override
	public List<ProductCommentVO> findByProductIdOrderByCreated(Long productId) {
		List<ProductCommentVO> productCommentVOList=new ArrayList<>();
		List<ProductCommentEntity> productCommentEntityList=productCommentJpaRepository.findByProductIdOrderByCreated(productId);
		for (ProductCommentEntity productCommentEntity:productCommentEntityList
			 ) {
			ProductCommentVO productCommentVO=new ProductCommentVO();
			BeanUtils.copyProperties(productCommentEntity,productCommentVO);
			productCommentVOList.add(productCommentVO);
		}
		return productCommentVOList;
	}
}

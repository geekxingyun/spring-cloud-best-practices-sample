package com.xingyun.singlearchitecturespringbootshoppingsample.business.productcomment.service;

import com.xingyun.singlearchitecturespringbootshoppingsample.business.productcomment.dao.jpa.ProductCommentJpaRepository;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.productcomment.model.ProductCommentEntity;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.productcomment.model.ProductCommentVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qing-feng.zhao
 */
@Service
public class ProductCommentServiceImpl implements ProductCommentService{

	protected final ProductCommentJpaRepository productCommentJpaRepository;

	public ProductCommentServiceImpl(ProductCommentJpaRepository productCommentJpaRepository) {
		this.productCommentJpaRepository = productCommentJpaRepository;
	}


	@Override
	public List<ProductCommentVO> findProductCommentByProductId(Long productId) {

		List<ProductCommentVO> productCommentVOList=new ArrayList<>();

		List<ProductCommentEntity> productCommentEntityList=productCommentJpaRepository.findAllByProductId(productId);
		for (ProductCommentEntity productCommentEntity:productCommentEntityList
		) {
			ProductCommentVO productCommentVO=new ProductCommentVO();
			BeanUtils.copyProperties(productCommentEntity,productCommentVO);
			productCommentVOList.add(productCommentVO);
		}
		return productCommentVOList;
	}

	@Override
	public List<ProductCommentVO> findProductCommentByAuthorId(Long authorId) {
		List<ProductCommentVO> productCommentVOList=new ArrayList<>();
		List<ProductCommentEntity> productCommentEntityList=productCommentJpaRepository.findAllByAuthorId(authorId);
		for (ProductCommentEntity productCommentEntity:productCommentEntityList
		) {
			ProductCommentVO productCommentVO=new ProductCommentVO();
			BeanUtils.copyProperties(productCommentEntity,productCommentVO);
			productCommentVOList.add(productCommentVO);
		}
		return productCommentVOList;
	}
}

package com.xingyun.singlearchitecturespringbootshoppingsample.business.product.service;

import com.xingyun.singlearchitecturespringbootshoppingsample.business.product.dao.jpa.ProductJpaRepository;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.product.model.entity.ProductEntity;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.product.model.vo.ProductVO;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.productcomment.service.ProductCommentService;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.productcomment.model.vo.ProductCommentVO;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author qing-feng.zhao
 */
@Service
public class ProductServiceImpl implements ProductService {

	/**
	 * 尽量使用构造方法注入
	 */
	protected final ProductJpaRepository productJpaRepository;

	protected final ProductCommentService productCommentService;

	public ProductServiceImpl(ProductJpaRepository productJpaRepository,ProductCommentService productCommentService) {
		this.productJpaRepository = productJpaRepository;
		this.productCommentService=productCommentService;
	}

	@Override
	public Page<ProductVO> getProductListPage(Pageable pageable) {

		Page<ProductEntity> productEntityPage=this.productJpaRepository.findAll(pageable);
		//userPageEntity.getContent() return List<object>
		List<ProductEntity> productEntityList= productEntityPage.getContent();
		// total record count
		long totalCount=productEntityPage.getTotalElements();
		//
		List<ProductVO> productVOList=new ArrayList<>();

		for (ProductEntity productEntity:productEntityList
		) {
			ProductVO productVO=new ProductVO();
			BeanUtils.copyProperties(productEntity,productVO);
			productVOList.add(productVO);
		}
		return new PageImpl(productVOList,pageable,totalCount);
	}

	/**
	 * 根据商品Id
	 * @param id 商品配置ID
	 * @return
	 */
	@Override
	public ProductVO loadProduct(Long id) {
		ProductVO productVO=new ProductVO();
		Optional<ProductEntity> productEntityOptional=this.productJpaRepository.findById(id);
		if(productEntityOptional.isPresent()){
			ProductEntity productEntity=productEntityOptional.get();
			BeanUtils.copyProperties(productEntity,productVO);
		}
		return productVO;
	}

	/**
	 * 加载评论列表
	 * @param productId
	 * @return
	 */
	@Override
	public List<ProductCommentVO> findAllByProductId(Long productId) {
		return this.productCommentService.findByProductIdOrderByCreated(productId);
	}
}

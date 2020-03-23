package com.xingyun.productcommentservice.service;

import com.xingyun.productcommentservice.dao.jpa.ProductCommentJpaRepository;
import com.xingyun.productcommentservice.model.ProductCommentEntity;
import com.xingyun.productcommentservice.model.ProductCommentVO;
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

//	@Qualifier("eurekaClient")
//	@Autowired
//	private EurekaClient eurekaClient;
//
////	@Autowired
//	private DiscoveryClient discoveryClient;

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
		//try to check the authorId whether is valid from customer service
//		eurekaClient.getNextServerFromEureka("",false);
////
//		List<ServiceInstance> serviceInstanceList=discoveryClient.getInstances("STORES");


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

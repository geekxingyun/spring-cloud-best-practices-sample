package com.xingyun.singlearchitecturespringbootshoppingsample.business.product.service;

import com.xingyun.singlearchitecturespringbootshoppingsample.business.product.model.vo.ProductVO;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.productcomment.model.vo.ProductCommentVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 *
 * @author qing-feng.zhao
 */
public interface ProductService {
	/**
	 * 获取商品配置的分页数据
	 * @param pageable 分页参数
	 * @return 分页数据
	 */
	Page<ProductVO> getProductListPage(Pageable pageable);

	/**
	 * 加载指定的商品配置
	 * @param id 商品配置ID
	 * @return
	 */
	ProductVO loadProduct(Long id);

	/**
	 * 加载指定商品的评论列表
	 * @param productId
	 * @return
	 */
	List<ProductCommentVO> findAllByProductId(Long productId);
}

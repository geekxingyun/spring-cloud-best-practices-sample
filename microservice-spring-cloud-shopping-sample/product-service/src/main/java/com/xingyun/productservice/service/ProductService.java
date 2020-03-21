package com.xingyun.productservice.service;

import com.xingyun.productservice.model.ProductVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

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
}

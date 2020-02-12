package com.xingyun.singlearchitecturespringbootshoppingsample.business.product.dao.jpa;

import com.xingyun.singlearchitecturespringbootshoppingsample.business.product.model.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author qing-feng.zhao
 */
public interface ProductJpaRepository extends JpaRepository<ProductEntity,Long> {
}

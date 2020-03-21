package com.xingyun.productservice.dao.jpa;

import com.xingyun.productservice.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author qing-feng.zhao
 */
public interface ProductJpaRepository extends JpaRepository<ProductEntity,Long> {
}

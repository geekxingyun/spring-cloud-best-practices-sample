package com.xingyun.singlearchitecturespringbootshoppingsample.business.customer.dao.jpa;

import com.xingyun.singlearchitecturespringbootshoppingsample.business.customer.model.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author qing-feng.zhao
 * @description JpaRepository extends PagingAndSortingRepository extends CrudRepository extends Repository
 * @date 2020/2/1 8:38
 */
public interface CustomerJpaRepository extends JpaRepository<CustomerEntity,Long>{
}

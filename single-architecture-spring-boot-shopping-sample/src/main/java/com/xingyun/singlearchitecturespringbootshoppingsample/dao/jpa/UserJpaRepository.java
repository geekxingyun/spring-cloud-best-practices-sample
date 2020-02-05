package com.xingyun.singlearchitecturespringbootshoppingsample.dao.jpa;

import com.xingyun.singlearchitecturespringbootshoppingsample.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author qing-feng.zhao
 * @description JpaRepository extends PagingAndSortingRepository extends CrudRepository extends Repository
 * @date 2020/2/1 8:38
 */
public interface UserJpaRepository extends JpaRepository<UserEntity,Long>{
}

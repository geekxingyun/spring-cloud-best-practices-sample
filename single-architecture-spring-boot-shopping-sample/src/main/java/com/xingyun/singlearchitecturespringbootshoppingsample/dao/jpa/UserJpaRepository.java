package com.xingyun.singlearchitecturespringbootshoppingsample.dao.jpa;

import com.xingyun.singlearchitecturespringbootshoppingsample.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author qing-feng.zhao
 * @description
 * @date 2020/2/1 8:38
 */
@Repository
public interface UserJpaRepository extends JpaRepository<Long, User> {
}

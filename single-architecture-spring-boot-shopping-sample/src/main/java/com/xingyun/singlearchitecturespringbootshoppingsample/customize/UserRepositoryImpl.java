package com.xingyun.singlearchitecturespringbootshoppingsample.customize;

import com.xingyun.singlearchitecturespringbootshoppingsample.model.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * @author qing-feng.zhao
 * @description the class file must be end with impl
 * @date 2020/2/4 13:53
 */
@Slf4j
public class UserRepositoryImpl implements UserRepositoryEx {

	@PersistenceContext
	protected EntityManager entityManager;

	@Override
	public List<UserEntity> findTopUser(int maxResult) {
		Query query= null;
		try {
			query = this.entityManager.createQuery("from USER");
		} catch (Exception e) {
			log.error(e.getMessage(),e);
		}
		query.setMaxResults(maxResult);
		return query.getResultList();
	}
}

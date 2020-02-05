package com.xingyun.singlearchitecturespringbootshoppingsample.customize;

import com.xingyun.singlearchitecturespringbootshoppingsample.model.entity.UserEntity;

import java.util.List;

/**
 * @author qing-feng.zhao
 * @description
 * @date 2020/2/4 13:51
 */
public interface UserRepositoryEx {
	/**
	 * 查找前maxResult条记录
	 * @param maxResult 查询前maxResult条记录参数
	 * @return 返回查询的前maxResult条记录对象集合
	 */
	List<UserEntity> findTopUser(int maxResult);
}

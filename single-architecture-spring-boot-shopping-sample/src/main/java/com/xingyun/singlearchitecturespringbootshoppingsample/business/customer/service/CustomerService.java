package com.xingyun.singlearchitecturespringbootshoppingsample.business.customer.service;

import com.xingyun.singlearchitecturespringbootshoppingsample.business.customer.model.CustomerQuery;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.customer.model.CustomerVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author qing-feng.zhao
 * @description
 * @date 2020/2/5 7:45
 */
public interface CustomerService {
	/**
	 * 获取用户分页数据
	 * @param pageable 分页参数
	 * @return 分页数据
	 */
	Page<CustomerVO> getPageUser(Pageable pageable);
	/**
	 * 加载指定的用户信息
	 * @param id 用户主键
	 * @return 加载指定的用户信息
	 */
	CustomerVO loadUser(Long id);
	/**
	 * 保存/更新用户
	 * @param customerQuery
	 * @return
	 */
	CustomerVO saveUser(CustomerQuery customerQuery);

	/**
	 * 删除指定用户
	 * @param id 所要删除的用户主键
	 */
	void removedUserById(Long id);
}

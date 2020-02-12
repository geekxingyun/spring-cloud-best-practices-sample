package com.xingyun.singlearchitecturespringbootshoppingsample.business.user.service;

import com.xingyun.singlearchitecturespringbootshoppingsample.business.user.model.dto.UserDTO;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.user.model.vo.UserVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author qing-feng.zhao
 * @description
 * @date 2020/2/5 7:45
 */
public interface UserService {
	/**
	 * 获取用户分页数据
	 * @param pageable 分页参数
	 * @return 分页数据
	 */
	Page<UserVO> getPageUser(Pageable pageable);
	/**
	 * 加载指定的用户信息
	 * @param id 用户主键
	 * @return 加载指定的用户信息
	 */
	UserVO loadUser(Long id);
	/**
	 * 保存/更新用户
	 * @param userDTO
	 * @return
	 */
	UserVO saveUser(UserDTO userDTO);

	/**
	 * 删除指定用户
	 * @param id 所要删除的用户主键
	 */
	void removedUserById(Long id);
}

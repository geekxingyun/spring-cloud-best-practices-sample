package com.xingyun.singlearchitecturespringbootshoppingsample.business.user.service;

import com.xingyun.singlearchitecturespringbootshoppingsample.business.user.dao.jpa.UserJpaRepository;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.user.model.dto.UserDTO;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.user.model.entity.UserEntity;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.user.model.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author qing-feng.zhao
 * @description
 * @date 2020/2/5 7:55
 */
@Service
public class UserServiceImpl implements UserService {

	protected final UserJpaRepository userJpaRepository;

	public UserServiceImpl(UserJpaRepository userJpaRepository) {
		this.userJpaRepository = userJpaRepository;
	}

	@Override
	public Page<UserVO> getPageUser(Pageable pageable) {
		Page<UserEntity> userPageEntity=this.userJpaRepository.findAll(pageable);
		//userPageEntity.getContent() return List<object>
		List<UserEntity> userPageList= userPageEntity.getContent();
		// total record count
		long totalCount=userPageEntity.getTotalElements();
		//
		List<UserVO> userVOList=new ArrayList<>();

		for (UserEntity userEntity:userPageList
			 ) {
			UserVO userVO=new UserVO();
			BeanUtils.copyProperties(userEntity,userVO);
			userVOList.add(userVO);
		}
		return new PageImpl(userVOList,pageable,totalCount);
	}

	@Override
	public UserVO loadUser(Long id) {
		UserVO userVO=new UserVO();
		Optional<UserEntity> userOptionalEntity=this.userJpaRepository.findById(id);
		if(userOptionalEntity.isPresent()){
			UserEntity userEntity=userOptionalEntity.get();
			BeanUtils.copyProperties(userEntity,userVO);
		}
		return userVO;
	}

	@Override
	public UserVO saveUser(UserDTO userDTO) {
		UserVO userVO=new UserVO();
		Optional<UserEntity> userEntityOptional=this.userJpaRepository.findById(userDTO.getId());
		if(userEntityOptional.isPresent()){
			UserEntity userEntity=userEntityOptional.get();
			BeanUtils.copyProperties(userEntity,userVO);
		}else{
			BeanUtils.copyProperties(userDTO,userVO);
		}
		return userVO;
	}

	@Override
	public void removedUserById(Long id) {
		this.userJpaRepository.deleteById(id);
	}
}

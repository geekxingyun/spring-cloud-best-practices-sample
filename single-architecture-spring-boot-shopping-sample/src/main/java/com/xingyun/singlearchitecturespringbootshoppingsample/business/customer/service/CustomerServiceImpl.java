package com.xingyun.singlearchitecturespringbootshoppingsample.business.customer.service;

import com.xingyun.singlearchitecturespringbootshoppingsample.business.customer.dao.jpa.CustomerJpaRepository;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.customer.model.CustomerQuery;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.customer.model.CustomerEntity;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.customer.model.CustomerVO;
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
public class CustomerServiceImpl implements CustomerService {

	protected final CustomerJpaRepository customerJpaRepository;

	public CustomerServiceImpl(CustomerJpaRepository customerJpaRepository) {
		this.customerJpaRepository = customerJpaRepository;
	}

	@Override
	public Page<CustomerVO> getPageUser(Pageable pageable) {
		Page<CustomerEntity> userPageEntity=this.customerJpaRepository.findAll(pageable);
		//userPageEntity.getContent() return List<object>
		List<CustomerEntity> userPageList= userPageEntity.getContent();
		// total record count
		long totalCount=userPageEntity.getTotalElements();
		//
		List<CustomerVO> customerVOList =new ArrayList<>();

		for (CustomerEntity customerEntity :userPageList
			 ) {
			CustomerVO customerVO =new CustomerVO();
			BeanUtils.copyProperties(customerEntity, customerVO);
			customerVOList.add(customerVO);
		}
		return new PageImpl(customerVOList,pageable,totalCount);
	}

	@Override
	public CustomerVO loadUser(Long id) {
		CustomerVO customerVO =new CustomerVO();
		Optional<CustomerEntity> userOptionalEntity=this.customerJpaRepository.findById(id);
		if(userOptionalEntity.isPresent()){
			CustomerEntity customerEntity =userOptionalEntity.get();
			BeanUtils.copyProperties(customerEntity, customerVO);
		}
		return customerVO;
	}

	@Override
	public CustomerVO saveUser(CustomerQuery customerQuery) {
		CustomerVO customerVO =new CustomerVO();
		Optional<CustomerEntity> userEntityOptional=this.customerJpaRepository.findById(customerQuery.getId());
		if(userEntityOptional.isPresent()){
			CustomerEntity customerEntity =userEntityOptional.get();
			BeanUtils.copyProperties(customerEntity, customerVO);
		}else{
			BeanUtils.copyProperties(customerQuery, customerVO);
		}
		return customerVO;
	}

	@Override
	public void removedUserById(Long id) {
		this.customerJpaRepository.deleteById(id);
	}
}

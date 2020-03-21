package com.xingyun.customerservice.api;

import com.xingyun.customerservice.model.CustomerQuery;
import com.xingyun.customerservice.model.CustomerVO;
import com.xingyun.customerservice.constant.HttpStatusCodeConstant;
import com.xingyun.customerservice.model.AppResponseVO;
import com.xingyun.customerservice.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * @author qing-feng.zhao
 * @description
 * @date 2020/2/5 8:32
 */
@RestController
@Api(value = "CustomerEndPoint",tags = "用户管理相关API")
public class CustomerEndPoint {
	/**
	 * 构造方法注入
	 */
	private final CustomerService customerService;
	private final AppResponseVO appResponseVO;

	public CustomerEndPoint(CustomerService customerService, AppResponseVO appResponseVO) {
		this.customerService = customerService;
		this.appResponseVO = appResponseVO;
	}
	/**
	 *
	 * @param pageable
	 * @return
	 */
	@GetMapping(value = "/users")
	@ApiOperation(value = "获取用户分页数据",notes ="获取用户分页数据",httpMethod = "GET",tags = "用户管理相关API")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "page",value = "第几页,从0开始,默认为第0页",example = "0",dataType = "int",paramType = "query"),
			@ApiImplicitParam(name = "size",value = "每一页记录数的大小,默认为20",example = "20",dataType = "int",paramType = "query"),
			@ApiImplicitParam(name = "sort",value = "排序,格式为:property,property(,ASC|DESC)的方式组织",example = "ASC",dataType = "String",paramType = "query"),
	})
	public AppResponseVO findAll(Pageable pageable){
		Page<CustomerVO> userVOPage= this.customerService.getPageUser(pageable);
		appResponseVO.setResponseCode(HttpStatusCodeConstant.OK_CODE);
		appResponseVO.setResponseMessage("获取用户分页数据成功");
		if(null!=userVOPage){
			List<CustomerVO> customerVOList =userVOPage.getContent();
			appResponseVO.setResponseData(customerVOList);
		}else{
			appResponseVO.setResponseData(Collections.EMPTY_LIST);
		}
		return appResponseVO;
	}

	@GetMapping(value = "/users/{id}")
	@ApiOperation(value = "获取用户详情数据",notes = "获取用户详情数据",httpMethod = "GET",tags = "用户管理相关API")
	@ApiImplicitParam(name = "id",value = "用户的主键",example = "1",dataType = "int",paramType = "path")
	public AppResponseVO detail(@PathVariable Long id){
		CustomerVO customerVO =this.customerService.loadUser(id);
		appResponseVO.setResponseCode(HttpStatusCodeConstant.OK_CODE);
		appResponseVO.setResponseMessage("获取用户详情数据成功");
		appResponseVO.setResponseData(customerVO);
		return appResponseVO;
	}

	@PostMapping(value = "/users/{id}")
	@ApiOperation(value = "更新用户详情数据",notes = "更新用户详情数据",httpMethod = "POST",tags = "用户管理相关API")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "用户的主键",example = "1", dataType = "int",paramType = "path"),
			@ApiImplicitParam(name = "userDTO", value = "用户详情数据", dataType = "UserDTO", paramType = "body"),
	})
	public AppResponseVO update(@PathVariable Long id, @RequestBody CustomerQuery customerQuery){
		customerQuery.setId(id);
		CustomerVO customerVO =this.customerService.saveUser(customerQuery);
		appResponseVO.setResponseCode(HttpStatusCodeConstant.OK_CODE);
		appResponseVO.setResponseMessage("更新用户详情数据成功");
		appResponseVO.setResponseData(customerVO);
		return appResponseVO;
	}

	@DeleteMapping(value = "/users/{id}")
	@ApiOperation(value = "删除指定用户",notes = "删除指定用户",httpMethod = "DELETE",tags = "用户管理相关API")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id",value = "所要删除用户的主键",example = "1",dataType = "int",paramType = "path")
	})
	public AppResponseVO delete(@PathVariable Long id){
		this.customerService.removedUserById(id);
		appResponseVO.setResponseCode(HttpStatusCodeConstant.OK_CODE);
		appResponseVO.setResponseMessage("删除指定用户成功");
		appResponseVO.setResponseData(true);
		return appResponseVO;
	}
}

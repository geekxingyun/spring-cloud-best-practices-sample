package com.xingyun.singlearchitecturespringbootshoppingsample.business.user.api;

import com.xingyun.singlearchitecturespringbootshoppingsample.business.user.model.dto.UserDTO;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.user.model.vo.UserVO;
import com.xingyun.singlearchitecturespringbootshoppingsample.constant.HttpStatusCodeConstant;
import com.xingyun.singlearchitecturespringbootshoppingsample.model.AppResponseDTO;
import com.xingyun.singlearchitecturespringbootshoppingsample.business.user.service.UserService;
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
@Api(value = "UserEndPoint",tags = "用户管理相关API")
public class UserEndPoint {
	/**
	 * 构造方法注入
	 */
	private final UserService userService;
	private final AppResponseDTO appResponseDTO;

	public UserEndPoint(UserService userService, AppResponseDTO appResponseDTO) {
		this.userService = userService;
		this.appResponseDTO = appResponseDTO;
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
	public AppResponseDTO findAll(Pageable pageable){
		Page<UserVO> userVOPage= this.userService.getPageUser(pageable);
		appResponseDTO.setResponseCode(HttpStatusCodeConstant.OK_CODE);
		appResponseDTO.setResponseMessage("获取用户分页数据成功");
		if(null!=userVOPage){
			List<UserVO> userVOList=userVOPage.getContent();
			appResponseDTO.setResponseData(userVOList);
		}else{
			appResponseDTO.setResponseData(Collections.EMPTY_LIST);
		}
		return appResponseDTO;
	}

	@GetMapping(value = "/users/{id}")
	@ApiOperation(value = "获取用户详情数据",notes = "获取用户详情数据",httpMethod = "GET",tags = "用户管理相关API")
	@ApiImplicitParam(name = "id",value = "用户的主键",example = "1",dataType = "int",paramType = "path")
	public AppResponseDTO detail(@PathVariable Long id){
		UserVO userVO=this.userService.loadUser(id);
		appResponseDTO.setResponseCode(HttpStatusCodeConstant.OK_CODE);
		appResponseDTO.setResponseMessage("获取用户详情数据成功");
		appResponseDTO.setResponseData(userVO);
		return appResponseDTO;
	}

	@PostMapping(value = "/users/{id}")
	@ApiOperation(value = "更新用户详情数据",notes = "更新用户详情数据",httpMethod = "POST",tags = "用户管理相关API")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "用户的主键",example = "1", dataType = "int",paramType = "path"),
			@ApiImplicitParam(name = "userDTO", value = "用户详情数据", dataType = "UserDTO", paramType = "body"),
	})
	public AppResponseDTO update(@PathVariable Long id, @RequestBody UserDTO userDTO){
		userDTO.setId(id);
		UserVO userVO=this.userService.saveUser(userDTO);
		appResponseDTO.setResponseCode(HttpStatusCodeConstant.OK_CODE);
		appResponseDTO.setResponseMessage("更新用户详情数据成功");
		appResponseDTO.setResponseData(userVO);
		return appResponseDTO;
	}

	@DeleteMapping(value = "/users/{id}")
	@ApiOperation(value = "删除指定用户",notes = "删除指定用户",httpMethod = "DELETE",tags = "用户管理相关API")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id",value = "所要删除用户的主键",example = "1",dataType = "int",paramType = "path")
	})
	public AppResponseDTO delete(@PathVariable Long id){
		this.userService.removedUserById(id);
		appResponseDTO.setResponseCode(HttpStatusCodeConstant.OK_CODE);
		appResponseDTO.setResponseMessage("删除指定用户成功");
		appResponseDTO.setResponseData(true);
		return appResponseDTO;
	}
}

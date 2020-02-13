package com.xingyun.singlearchitecturespringbootshoppingsample.business.productcomment.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author xingyun
 */
@Data
public class ProductCommentDTO implements Serializable {
	/**
	 * 序列化Id
	 */
	private static final long serialVersionUID = -3538433833974095137L;
	/**
	 * 商品评论数据库主键
	 */
	@ApiModelProperty(value = "商品评论数据库主键")
	private Long id;
	/**
	 * 所示商品的ID
	 */
	@ApiModelProperty(value = "所示商品的ID")
	private Long productId;
	/**
	 * 评论作者的Id
	 */
	@ApiModelProperty(value = "评论作者的Id")
	private Long authorId;
	/**
	 * 评论的具体内容
	 */
	@ApiModelProperty(value = "评论的具体内容")
	private String content;
	/**
	 * 评论创建时间
	 */
	@ApiModelProperty(value = "评论创建时间")
	private Long created;
}

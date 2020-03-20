package com.xingyun.singlearchitecturespringbootshoppingsample.business.product.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author qing-feng.zhao
 *
 */
@Data
public class ProductDTO implements Serializable {
	/**
	 * 序列化Id
	 */
	private static final long serialVersionUID = 4952782178652885655L;
	/**
	 * 商品数据库主键
	 */
	@ApiModelProperty(value="商品数据库主键")
	private Long id;
	/**
	 * 商品名称
	 */
	@ApiModelProperty(value="商品名称")
	private String name;
	/**
	 * 商品封面图片
	 */
	@ApiModelProperty(value="商品封面图片")
	private String coverImage;
	/**
	 * 商品价格(单位:分)
	 */
	@ApiModelProperty(value="商品价格(单位:分)")
	private Double price;
}

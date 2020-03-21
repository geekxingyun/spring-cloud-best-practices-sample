package com.xingyun.singlearchitecturespringbootshoppingsample.business.product.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * @author qing-feng.zhao
 */
@Data
public class ProductVO implements Serializable {
	/**
	 * 序列化Id
	 */
	private static final long serialVersionUID = -4481553529553540746L;
	/**
	 * 商品数据库主键
	 */
	@ApiModelProperty(value="商品数据库主键")
	private Long uuid;
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
	/**
	 * 创建时间
	 */
	private Long createTime;

	/**
	 * 更新时间
	 */
	private Long updateTime;
}

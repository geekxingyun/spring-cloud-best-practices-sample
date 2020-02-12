package com.xingyun.singlearchitecturespringbootshoppingsample.business.product.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author qing-feng.zhao
 */
@Data
@Entity
@Table(name = "tb_product")
public class ProductEntity implements Serializable {
	/**
	 * 序列化Id
	 */
	private static final long serialVersionUID = -7290713691909197522L;
	/**
	 * 商品数据库主键
	 */
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	/**
	 * 商品名称
	 */
	@Basic
	@Column(name = "NAME")
	private String name;
	/**
	 * 商品封面图片
	 */
	@Basic
	@Column(name = "COVER_IMAGE")
	private String coverImage;
	/**
	 * 商品价格
	 */
	@Basic
	@Column(name = "PRICE")
	private Double price;
}

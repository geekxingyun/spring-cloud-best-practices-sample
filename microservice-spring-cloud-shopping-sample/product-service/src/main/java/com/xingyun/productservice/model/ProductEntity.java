package com.xingyun.productservice.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

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
	@GeneratedValue(generator = "SnowFlakeId")
	@GenericGenerator(name = "SnowFlakeId", strategy ="com.xingyun.productservice.customize.SnowFlakeIdGenerator")
	@Column(name = "pk_uuid")
	private Long uuid;
	/**
	 * 商品名称
	 */
	@Column(name = "product_name")
	private String productName;
	/**
	 * 商品封面图片
	 */
	@Column(name = "cover_image")
	private String coverImage;
	/**
	 * 商品价格
	 */
	@Column(name = "price")
	private Double price;

	/**
	 * 创建时间
	 */
	@Column(name = "create_time")
	private Long createTime;

	/**
	 * 更新时间
	 */
	@Column(name = "update_time")
	private Long updateTime;
}

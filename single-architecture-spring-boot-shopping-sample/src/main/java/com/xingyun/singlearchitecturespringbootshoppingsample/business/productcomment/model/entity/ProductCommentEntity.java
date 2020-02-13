package com.xingyun.singlearchitecturespringbootshoppingsample.business.productcomment.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author qing-feng.zhao
 */
@Data
@Entity
@Table(name = "tb_product_comment")
public class ProductCommentEntity implements Serializable {
	/**
	 * 序列化Id
	 */
	private static final long serialVersionUID = 3335736243004941851L;
	/**
	 * 商品评论数据库主键
	 */
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	/**
	 * 所示商品的ID
	 */
	@Basic
	@Column(name = "PRODUCT_ID")
	private Long productId;
	/**
	 * 评论作者的Id
	 */
	@Basic
	@Column(name = "AUTHOR_ID")
	private Long authorId;
	/**
	 * 评论的具体内容
	 */
	@Basic
	@Column(name = "CONTENT")
	private String content;
	/**
	 * 评论创建时间
	 */
	@Basic
	@Column(name = "CREATED")
	private Long created;
}

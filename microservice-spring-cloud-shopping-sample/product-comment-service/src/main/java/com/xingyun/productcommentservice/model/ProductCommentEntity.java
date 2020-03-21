package com.xingyun.productcommentservice.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

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
	@GeneratedValue(generator = "SnowFlakeId")
	@GenericGenerator(name = "SnowFlakeId", strategy ="com.xingyun.productcommentservice.customize.SnowFlakeIdGenerator")
	@Column(name = "pk_uuid")
	private Long uuid;
	/**
	 * 所示商品的ID
	 */
	@Basic
	@Column(name = "product_id")
	private Long productId;
	/**
	 * 评论作者的Id
	 */
	@Basic
	@Column(name = "author_id")
	private Long authorId;
	/**
	 * 评论的具体内容
	 */
	@Basic
	@Column(name = "content")
	private String content;
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

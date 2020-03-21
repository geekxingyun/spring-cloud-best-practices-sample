package com.xingyun.customerservice.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author qing-feng.zhao
 */
@Data
@Entity
@Table(name = "tb_customer")
public class CustomerEntity implements Serializable {
	/**
	 * 序列化Id
	 */
	private static final long serialVersionUID = -4408179126050937963L;
	/**
	 * 用户数据库主键
	 */
	@Id
	@GeneratedValue(generator = "SnowFlakeId")
	@GenericGenerator(name = "SnowFlakeId", strategy ="com.xingyun.customerservice.customize.SnowFlakeIdGenerator")
	@Column(name = "pk_uuid")
	private Long uuid;
	/**
	 * 用户昵称
	 */
	@Basic
	@Column(name = "nike_name")
	private String nikeName;
	/**
	 * 用户头像
	 */
	@Basic
	@Column(name = "avatar")
	private String avatar;

	@Column(name = "create_time")
	private Long createTime;

	@Column(name = "update_time")
	private Long updateTime;
}

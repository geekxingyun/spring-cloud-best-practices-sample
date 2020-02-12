package com.xingyun.singlearchitecturespringbootshoppingsample.business.user.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author qing-feng.zhao
 */
@Data
@Entity
@Table(name = "tb_user")
public class UserEntity implements Serializable {
	/**
	 * 序列化Id
	 */
	private static final long serialVersionUID = -4408179126050937963L;
	/**
	 * 用户数据库主键
	 */
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	/**
	 * 用户昵称
	 */
	@Basic
	@Column(name = "NIKE_NAME")
	private String nikeName;
	/**
	 * 用户头像
	 */
	@Basic
	@Column(name = "AVATAR")
	private String avatar;
}

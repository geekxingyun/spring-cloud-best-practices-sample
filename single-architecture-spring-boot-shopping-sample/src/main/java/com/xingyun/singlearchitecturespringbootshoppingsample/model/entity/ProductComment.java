package com.xingyun.singlearchitecturespringbootshoppingsample.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author qing-feng.zhao
 * @description
 * @date 2020/2/1 7:53
 */
//@Table(name = "TB_PRODUCT_COMMENT")
@Entity
@Data
public class ProductComment implements Serializable {
    /**
     * 商品评论数据库主键
     */
    @Id
    @GeneratedValue
    private Long id;
    /**
     * 评论商品的Id
     */
    private Long productId;
    /**
     * 评论作者的Id
     */
    private Long authorId;
    /**
     * 评论的具体内容
     */
    private String content;
    /**
     * 评论创建时间
     */
    private Date created;
}

package com.xingyun.singlearchitecturespringbootshoppingsample.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author qing-feng.zhao
 * @description
 * @date 2020/1/31 15:24
 */
@Entity
//@Table(name = "TB_Product")
@Data
public class Product implements Serializable {
    /**
     * 商品数据库主键
     */
    @Id
    @GeneratedValue
    private Long id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品封面图片
     */
    private String coverImage;
    /**
     * 商品价格
     */
    private Double price;
}

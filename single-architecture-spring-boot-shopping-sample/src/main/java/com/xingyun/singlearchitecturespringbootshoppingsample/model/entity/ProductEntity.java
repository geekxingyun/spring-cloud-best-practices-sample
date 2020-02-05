package com.xingyun.singlearchitecturespringbootshoppingsample.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author qing-feng.zhao
 * @description
 * @date 2020/1/31 15:24
 */

@Data
@Table(name = "TB_PRODUCT")
@Entity
public class ProductEntity implements Serializable {
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

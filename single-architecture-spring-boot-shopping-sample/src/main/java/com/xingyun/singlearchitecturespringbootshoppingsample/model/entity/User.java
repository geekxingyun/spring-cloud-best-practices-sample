package com.xingyun.singlearchitecturespringbootshoppingsample.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 *
 * @author qing-feng.zhao
 * @description Customer who will use the app
 * @date 2020/1/31 15:12
 */
@Entity
@Data
//@Table(name = "TB_USER")
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String nikeName;
    private String avatar;
}

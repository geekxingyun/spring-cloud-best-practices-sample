package com.xingyun.singlearchitecturespringbootshoppingsample.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author qing-feng.zhao
 * @description Customer who will use the app
 * @date 2020/1/31 15:12
 */

@Data
@Table(name = "TB_USER")
@Entity
public class UserEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "userSeq")
    @SequenceGenerator(initialValue = 1,name = "userSeq",sequenceName = "USER_SEQUENCE")
    private Long id;
    private String nikeName;
    private String avatar;
}

package com.xingyun.singlearchitecturespringbootshoppingsample.customize;

import com.xingyun.singlearchitecturespringbootshoppingsample.util.SnowFlakeUtils;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

/**
 * 自定义主键生成策略
 * @author qing-feng.zhao
 */
public class SnowFlakeIdGenerator implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        return SnowFlakeUtils.nextId();
    }
}
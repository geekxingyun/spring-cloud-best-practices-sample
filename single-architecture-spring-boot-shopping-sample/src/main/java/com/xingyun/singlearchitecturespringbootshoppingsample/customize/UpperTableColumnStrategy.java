package com.xingyun.singlearchitecturespringbootshoppingsample.customize;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy;

import java.util.Locale;

/**
 * @author qing-feng.zhao
 * @description SpringPhysicalNamingStrategy:default is nikeName mapping to nike_name
 * use the class will make nikeName mapping to NIKE_NAME
 * @date 2020/2/4 11:28
 */
public class UpperTableColumnStrategy extends SpringPhysicalNamingStrategy {
	/**
	 * 父类中映射规则是nikeName映射为nick_name
	 * 重写父类方法将nikeName映射为NIKE_NAME
	 * @param name
	 * @param quoted
	 * @param jdbcEnvironment
	 * @return
	 */
	@Override
	protected Identifier getIdentifier(String name, boolean quoted, JdbcEnvironment jdbcEnvironment) {
		if (super.isCaseInsensitive(jdbcEnvironment)) {
			name = name.toUpperCase(Locale.ROOT);
		}
		return new Identifier(name, quoted);
	}
}

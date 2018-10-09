package com.ivy.github.jseplus.introspector;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConstructorUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;

import com.ivy.github.jseplus.domain.Person;

public class JavaBean2MapApache {

	public static void main(String[] args) throws Exception {

		// 使用apache的beanutils和lang组件

		Person p1 = new Person();
		Map map1 = new HashMap<>();
		map1.put("name", "zz");
		map1.put("age", 23);
		map1.put("password", "888");
		//		map1.put("hireDate", "2018-10-01");//DateConverter does not support default String to 'Date' conversion.
		map1.put("hireDate", "2018/10/01");//DateConverter does not support default String to 'Date' conversion.

		// 解决办法

		DateConverter dateConverter = new DateConverter();
		dateConverter.setPatterns(new String[] { "yyyy-MM-dd", "yyyy/MM/dd" });
		ConvertUtils.register(dateConverter, java.util.Date.class);

		BeanUtils.copyProperties(p1, map1);
		System.out.println("map2bean p1:" + p1);
		
		
		
		

	}

}

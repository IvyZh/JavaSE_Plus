package com.ivy.github.jseplus.utils;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class BeanUtils {
	public static Map<String, Object> bean2map(Object bean)
			throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Map<String, Object> map = new HashMap<>();
		Class clz = bean.getClass();
		System.out.println(clz);

		//		BeanInfo beanInfo = Introspector.getBeanInfo(clz);
		BeanInfo beanInfo = Introspector.getBeanInfo(clz, Object.class);//去掉com.ivy.github.jseplus.domain.User
		PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor pd : pds) {

			String key = pd.getName();
			Object value = pd.getReadMethod().invoke(bean);
			System.out.println(key + "-" + value);
			map.put(key, value);

		}

		return map;
	}

	public static Object map2bean(Map<String, Object> beanMap, Class clz) throws InstantiationException,
			IllegalAccessException, IntrospectionException, IllegalArgumentException, InvocationTargetException {

		Object obj = clz.newInstance();
		BeanInfo beanInfo = Introspector.getBeanInfo(clz, Object.class);
		PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor pd : pds) {
			String key = pd.getName();
			Object value = beanMap.get(key);

			System.out.println(key + "----" + value);

			pd.getWriteMethod().invoke(obj, value);
		}
		return obj;
	}

	public static <T> T map2beanPlus(Map<String, Object> beanMap, Class<T> clz) throws InstantiationException,
			IllegalAccessException, IntrospectionException, IllegalArgumentException, InvocationTargetException {

		T obj = clz.newInstance();
		BeanInfo beanInfo = Introspector.getBeanInfo(clz, Object.class);
		PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor pd : pds) {
			String key = pd.getName();
			Object value = beanMap.get(key);

			System.out.println(key + "----" + value);

			pd.getWriteMethod().invoke(obj, value);
		}
		return obj;
	}
}

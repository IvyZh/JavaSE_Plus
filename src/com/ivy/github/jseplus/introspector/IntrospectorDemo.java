package com.ivy.github.jseplus.introspector;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import com.ivy.github.jseplus.domain.User;

public class IntrospectorDemo {

	public static void main(String[] args) throws IntrospectionException {
		BeanInfo beanInfo = Introspector.getBeanInfo(User.class);
		PropertyDescriptor[] PropertyDescriptors = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor pd : PropertyDescriptors) {
			//			System.out.println(propertyDescriptor);
			System.out.println(pd.getName() + " - " + pd.getPropertyType());
			Method getter = pd.getReadMethod();
			Method setter = pd.getWriteMethod();
			System.out.println(setter);
			System.out.println(getter);
			
			System.out.println("-------");
		}
	}

}

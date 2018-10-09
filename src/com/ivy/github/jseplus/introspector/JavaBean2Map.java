package com.ivy.github.jseplus.introspector;

import java.util.HashMap;
import java.util.Map;

import com.ivy.github.jseplus.domain.Person;
import com.ivy.github.jseplus.domain.User;
import com.ivy.github.jseplus.utils.BeanUtils;

public class JavaBean2Map {

	public static void main(String[] args) throws Exception {

		User u1 = new User("mike", "123456", 18);
		Map map = BeanUtils.bean2map(u1);
		System.out.println("map:" + map);

		User u2 = (User) BeanUtils.map2bean(map, User.class);
		System.out.println("u2:" + u2);

		User u3 = BeanUtils.map2beanPlus(map, User.class);
		System.out.println("u3:" + u3);

	}

}

package com.ivy.github.jseplus.annotation;

import java.lang.annotation.Annotation;

public class VIPTestDemo {

	public static void main(String[] args) {
		Annotation[] as = Employee.class.getAnnotations();
		System.out.println(as.length);
		boolean b = Employee.class.isAnnotationPresent(VIP.class);
		System.out.println(b);

		if (b) {
			VIP vip = Employee.class.getAnnotation(VIP.class);
			String level = vip.level();
			System.out.println(level);
			int age = vip.age();
			System.out.println("age:" + age);
		}

	}

}

@VIP(level = "A", age = 22)
class Employee {

}
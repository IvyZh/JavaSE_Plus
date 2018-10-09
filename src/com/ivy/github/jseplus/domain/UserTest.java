package com.ivy.github.jseplus.domain;

public class UserTest {

	public static void main(String[] args) {
		User u1 = new User("zk", "123456", 18);
		System.out.println(u1);
		u1.setAge(22);
		System.out.println(u1);
		System.out.println("-------");

		User2 u2 = new User2();
		u2.setAge(16);
		u2.setPassword("123");
		u2.setUsername("kk");
		System.out.println(u2);
	}

}

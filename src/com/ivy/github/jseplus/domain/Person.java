package com.ivy.github.jseplus.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	private String username;
	private String password;
	private int age;
	private Date hireDate;

}

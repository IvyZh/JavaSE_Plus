package com.ivy.github.jseplus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
public class User2 {
	private String username;
	private String password;
	private int age;

}

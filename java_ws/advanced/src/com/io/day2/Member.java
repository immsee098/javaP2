package com.io.day2;

import java.io.Serializable;

public class Member implements Serializable{

	private String userid;
	transient private String pwd;  //직렬화대상에서 제외
	private int age;
	
	public Member() {
		super();
	}

	public Member(String userid, String pwd, int age) {
		super();
		this.userid = userid;
		this.pwd = pwd;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("아이디:"+ userid);
		System.out.println("비밀번호:"+ pwd);
		System.out.println("나이:"+ age+"\n");
	}
	
	
}

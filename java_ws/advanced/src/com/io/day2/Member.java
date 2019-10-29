package com.io.day2;

import java.io.Serializable;

public class Member implements Serializable{

	private String userid;
	transient private String pwd;  //����ȭ��󿡼� ����
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
		System.out.println("���̵�:"+ userid);
		System.out.println("��й�ȣ:"+ pwd);
		System.out.println("����:"+ age+"\n");
	}
	
	
}

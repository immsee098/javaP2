package com.day14;

public class Student {
	private String name;
	private int idNo;
	
	Student(String name, int idNo) {
		this.name = name;
		this.idNo = idNo;
	}
	
	public void display() {
		System.out.println("�̸�:"+name);
		System.out.println("�й�"+idNo);
	}

}

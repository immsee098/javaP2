package com.day16;

import java.util.Scanner;

class Person {
	protected String name;
	protected int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
	}
	
}

class Student extends Person {
	protected String stNo;
	Student(String name, int age, String stNo){
		super(name, age);
		this.stNo = stNo;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("�й�:"+stNo);
	}
	
	public void study() {
		System.out.println("�����մϴ�");
	}
	
}

class Graduate extends Student{
	private String major;
	
	Graduate(String name, int age, String stNo, String major) {
		super(name, age,stNo);
		this.major = major;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("����:"+major);
	}
	
	public void writeThe() {
		System.out.println("�����մϴ�");
	}
	
}

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���л� 2���п��� �����ϼ���");
		
		int type = sc.nextInt();
		
		switch(type) {
			case 1:
				System.out.println("�̸�, ����, �й� �Է�");
				String name = sc.next();
				int age = sc.nextInt();
				String stNo = sc.next();
				
				Student st = new Student(name, age, stNo);
				st.showInfo();
				st.study();
				
				break;
			case 2:
				System.out.println("�̸�, ����, �й�, ���� �Է�");
				name = sc.next();
				age = sc.nextInt();
				stNo = sc.next();
				String major = sc.next();
				
				Graduate gr = new Graduate(name, age, stNo, major);
				gr.showInfo();
				gr.writeThe();
				break;
			default:
				System.out.println("�߸� �Է�");
				
		}

	}

}

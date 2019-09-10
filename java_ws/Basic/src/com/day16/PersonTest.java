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
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
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
		System.out.println("학번:"+stNo);
	}
	
	public void study() {
		System.out.println("공부합니다");
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
		System.out.println("전공:"+major);
	}
	
	public void writeThe() {
		System.out.println("공부합니다");
	}
	
}

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1대학생 2대학원생 선택하세요");
		
		int type = sc.nextInt();
		
		switch(type) {
			case 1:
				System.out.println("이름, 나이, 학번 입력");
				String name = sc.next();
				int age = sc.nextInt();
				String stNo = sc.next();
				
				Student st = new Student(name, age, stNo);
				st.showInfo();
				st.study();
				
				break;
			case 2:
				System.out.println("이름, 나이, 학번, 전공 입력");
				name = sc.next();
				age = sc.nextInt();
				stNo = sc.next();
				String major = sc.next();
				
				Graduate gr = new Graduate(name, age, stNo, major);
				gr.showInfo();
				gr.writeThe();
				break;
			default:
				System.out.println("잘못 입력");
				
		}

	}

}

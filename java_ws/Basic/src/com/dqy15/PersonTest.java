package com.dqy15;

import java.util.Scanner;

class Person{
	protected String name;
	protected int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void showInfo() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}
	
	
	
}

class Student extends Person{
	private String stNo;
	
	Student(String name, int age, String stNo){
		super(name, age);
		this.stNo = stNo;
	}
	
	public String getNo() {
		return stNo;
	}
	
	public void setNO(String stNo) {
		this.stNo = stNo;
	}
	
	public void showInfo() {
		//System.out.println("이름:"+name);
		//System.out.println("나이:"+age);
		super.showInfo();
		System.out.println("학번:"+stNo);
	}
	
}

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 나이, 학번 입력!");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String stNo = sc.nextLine();
		
		Student st = new Student(name, age, stNo);
		st.showInfo();

	}

}

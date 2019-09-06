package com.day14;

import java.util.Scanner;

class Person {
	protected String name;
	protected int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}

class Student2 extends Person {
	protected String major;
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major=major;
	}
	
}



public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 나이 전공");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String major = sc.nextLine();
		
		
		Student2 st = new Student2();
		st.setAge(age);
		st.setMajor(major);
		st.setName(name);
		
		System.out.println(st.getAge());
		System.out.println(st.getMajor());
		System.out.println(st.getName());
	}
	

}

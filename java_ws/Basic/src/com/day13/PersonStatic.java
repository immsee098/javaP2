package com.day13;

class Person {
	private String name;
	private int age;
	private static int count; //static을 써서 한게 나눠씀
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
		
		System.out.println(++count+"번째객체생성!"); //객체마다 따로 할당
	}
	
	public void display() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
}


public class PersonStatic {
	

	public static void main(String[] args) {
		System.out.println("변수연습");
		Person hong = new Person("홍길동", 20);
		hong.display();
		
		Person kim = new Person("김길동", 30);
		kim.display();

	}

}

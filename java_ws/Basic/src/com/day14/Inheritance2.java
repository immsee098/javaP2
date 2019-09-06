package com.day14;



class Parent2 {
	protected String name;
	protected int age;
	
}//class


class Son extends Parent2 {
	Son() {
		name="아들"; //부모멤버를 자기거처럼 사용가능
		age=30;
	}
	public void showInfo() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
	}
}

class Daughter extends Parent2{
	Daughter() {
		name="딸";
		age = 25;
	}
	
	public void showInfo() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
	}
	
}//class

class GrandChild extends Son {
	GrandChild() {
		name="손자";	
		age=2;
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		Son ch = new Son();
		ch.showInfo();
		
		Daughter ch2 = new Daughter();
		ch2.showInfo();
		
		GrandChild gc = new GrandChild();
		gc.showInfo();
	}

}

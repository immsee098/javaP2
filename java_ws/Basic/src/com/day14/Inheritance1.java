package com.day14;

/*
 상속 - 부모의 멤버를 그대로 물려받아 사용하고, 자신만의 특성과 행위를 추가해서 사용
 		공통적인 것은 부모에서 관리하고, 자식 클래스는 자신에 정의된 멤버들만 관리
 		재사용이 용이, 중복 제거
 		생산성, 유지보수에 좋다
 		
 		class 자식클래스 extends 부모클래스 {
 		}
 */

class Parent {
	protected String name;
	protected int age;
	protected int money=10000;
}//class

class Child extends Parent{
	Child() {
		name="자식";
		age = 20;
	}
	
	public void showInfo() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("물려받은 자산" + money);
	}
	
}//class

public class Inheritance1 {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.showInfo();

	}

}

package com.day16.polymo;

class Parent {
	public void showInfo() {
		System.out.println("Parent의 ShowInfo()메서드");
	}
	
	public void parentFunc() {
		System.out.println("Parent-func()");
	}
}

class Child extends Parent{
	public void showInfo() {
		System.out.println("Child의 showInfo()-overriding");
	}
	
	public void childFunc() {
		System.out.println("Child 자식만의 메서드");
	}
}

public class Polymorphism1 {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.showInfo();
		p.parentFunc();
		
		Child ch = new Child();
		ch.showInfo();
		ch.parentFunc();
		ch.childFunc();
		
		//다형성 - 부모의 참조변수로 자식의 인스턴스를 참조하도록 함으로써 다형성을 구현할 수 있다.
		//부모의 참조변수로는 부모의 멤버만 접근 가능
		//단, 자식의 오버라이딩 메서드가 있다면 부모의 참조변수로 자식의 오버라이딩 메서드 호출
		Parent p2 = new Child(); //부모에 자식 인스턴스 대입
		p2.showInfo(); //자식의 오버라이딩 메서드 호출
		p2.parentFunc(); // 부모의 멤버 접근 가능
		//p2.childFunc() //error, 자식만의 메서드는 접근 불가
	}

}

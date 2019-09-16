package com.day18;

interface IAnimal{
	public abstract void sound();
	void display();
}

class Cat3 implements IAnimal{
	public void sound() {
		System.out.println("야옹");
	}
	
	public void display() {
		System.out.println("Cat클래스!");
	}
}

abstract class Dog implements IAnimal { 
	//부모 인터페이스인 IAnimal의 추상메서드 중 display()는 구현하지 않았으므로 //추상 클래스가 된다 
	public void sound() { 
		System.out.println("멍멍!!"); 
		} 
	}

public class InterfaceTest1 {

	public static void main(String[] args) {
		Cat3 ca = new Cat3();
		ca.display();
		ca.sound();

	}

}

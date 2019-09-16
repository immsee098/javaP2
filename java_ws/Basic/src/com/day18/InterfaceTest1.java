package com.day18;

interface IAnimal{
	public abstract void sound();
	void display();
}

class Cat3 implements IAnimal{
	public void sound() {
		System.out.println("�߿�");
	}
	
	public void display() {
		System.out.println("CatŬ����!");
	}
}

abstract class Dog implements IAnimal { 
	//�θ� �������̽��� IAnimal�� �߻�޼��� �� display()�� �������� �ʾ����Ƿ� //�߻� Ŭ������ �ȴ� 
	public void sound() { 
		System.out.println("�۸�!!"); 
		} 
	}

public class InterfaceTest1 {

	public static void main(String[] args) {
		Cat3 ca = new Cat3();
		ca.display();
		ca.sound();

	}

}

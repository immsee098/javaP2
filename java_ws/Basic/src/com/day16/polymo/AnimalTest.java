package com.day16.polymo;

import java.util.Scanner;

class Animal{
	public void bark(){
		System.out.println("���");
	}
	
	public void parent(){
		System.out.println("�� �θ�-����");
	}
}

class Cat extends Animal{
	public void bark()	{
		System.out.println("�߿˾߿�");
	}
	
	public void child()	{
		System.out.println("�� �ڽ�-�����");
	}
}

class Cow extends Animal{
	public void bark()	{
		System.out.println("��������");
	}
}

class Dog extends Animal{
	public void bark()	{
		System.out.println("�۸�");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.�����  2.�۾���  3.������");
		
		int ani = sc.nextInt();
		
		Animal mal = null;
		if(ani==1) {
			mal = new Cat();
		} else if (ani==2) {
			mal = new Cow();
		} else if(ani==3) {
			mal = new Dog();
		} else {
			System.out.println("�߸��Է�");
		}
		
		mal.bark();
		mal.parent();
		
	}

}

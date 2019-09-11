package com.day17;

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

public class PolymoTest2 {
	
	static Animal animalTest(int type){
		Animal ani = null;
		if(type == 1) {
			ani = new Cat();
		} else if (type==2) {
			ani = new Cow();
		} else if(type==3) {
			ani = new Dog();
		}
		return ani;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int type = sc.nextInt();
		
		animalTest(type).bark();
		
	}

}
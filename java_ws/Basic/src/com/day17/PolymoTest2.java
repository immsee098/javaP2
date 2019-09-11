package com.day17;

import java.util.Scanner;

class Animal{
	public void bark(){
		System.out.println("울다");
	}
	
	public void parent(){
		System.out.println("난 부모-동물");
	}
}

class Cat extends Animal{
	public void bark()	{
		System.out.println("야옹야옹");
	}
	
	public void child()	{
		System.out.println("난 자식-고양이");
	}
}

class Cow extends Animal{
	public void bark()	{
		System.out.println("음메음메");
	}
}

class Dog extends Animal{
	public void bark()	{
		System.out.println("멍멍");
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
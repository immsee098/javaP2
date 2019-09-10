package com.day16.polymo;

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

public class AnimalTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.고양이  2.송아지  3.강아지");
		
		int ani = sc.nextInt();
		
		Animal mal = null;
		if(ani==1) {
			mal = new Cat();
		} else if (ani==2) {
			mal = new Cow();
		} else if(ani==3) {
			mal = new Dog();
		} else {
			System.out.println("잘못입력");
		}
		
		mal.bark();
		mal.parent();
		
	}

}

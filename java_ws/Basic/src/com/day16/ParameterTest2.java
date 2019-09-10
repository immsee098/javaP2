package com.day16;

import java.util.Scanner;

class Rectangle {
	private int width;
	private int height;
	
	Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}
	
	public int RectArea() {
		return width*height;
	}
}

class Car {
	private String color;	// 색상
	private String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	private int door;		// 문의 개수

	Car() {
		color = "gray";
		gearType = "수동";
		door = 2;

	}
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	public void showInfo(){
		System.out.println("color:" + color + ", gearType:" + gearType+ ", door:"+door);
	}
}

class Test{
	int age;
	Test(int age) {
		this.age=age;
	}

}

//class AAA extends Test{
//	int num;
//	AAA(int age, int num) {
//		super(age);
//		this.num = num;
//	}
//
//}
//
//class BBB extends Test{
//	String name;
//
//	BBB(int age, String name){	
//		super(age);
//		name="홍길동";
//	}
//}


class ParameterTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Car c = new Car();
		c.showInfo();
		
		int[] Rect = new int[4];
		
		for(int i=0; i<Rect.length; i++) {
			System.out.println("두 수 입력");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			Rectangle re = new Rectangle(a, b);
			System.out.println("넓이"+re.RectArea());
		}
	}
}


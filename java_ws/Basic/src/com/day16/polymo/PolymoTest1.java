package com.day16.polymo;

import java.util.Scanner;

class Shape{
	public void draw() {
		System.out.println("그린다");
	}
	
	public void delete() {
		System.out.println("지운다");
	}
	
	public void showInfo() {
		System.out.println("Shape-showInfo()");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("원을 그린다");
	}
	
	public void delete() {
		System.out.println("원을 지운다");
	}
	
	public void sayCircle() {
		System.out.println("Circle만의 메서드");
	}
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("삼각형을 그린다");
	}
	
	public void delete() {
		System.out.println("삼각형을 지운다");
	}
	
	public void sayTriangle( ) {
		System.out.println("Triangle만의 매서드");
	}
}

public class PolymoTest1 {

	public static void main(String[] args) {
		Shape sh = new Circle();
		sh.draw(); //자식의 오버라이딩 메서드 호출
		sh.delete();
		sh.showInfo();
		//sh.sayCircle() //error
		
		System.out.println("=============================");
		
		sh = new Triangle();
		sh.draw();
		sh.delete();
		//sh.sayTriangle(); //error
		
		System.out.println("=========기존방식==========");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n1.원 2.삼각형 선택");
		
		int type = sc.nextInt();
		if(type==1) {
			Circle c = new Circle();
			c.draw();
			c.delete();
		} else if (type==2) {
			Triangle tr = new Triangle();
			tr.draw();
			tr.delete();
		} else {
			System.out.println("잘못입력");
		}
		
		Shape sh3 = null;
		System.out.println("\n\n======다형성을 이용========");
		if(type==1) {
			sh3 = new Circle();
		} else if(type==2) {
			sh3 = new Triangle();
		} else {
			System.out.println("잘못 입력");
			return;
		}
		
		sh3.draw();
		sh3.delete();
	}

}

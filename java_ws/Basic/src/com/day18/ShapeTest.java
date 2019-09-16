package com.day18;

import java.util.Scanner;

abstract class Shape {
	public abstract void draw();
}

class Circle extends Shape {
	public void draw() {
		System.out.println("원을 그린다");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("사각형을 그린다");
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 골라주세요. 원(1) 사각형(2)");
		int choose = sc.nextInt();
		
		Shape sh;
		
		if(choose==1) {
			sh = new Circle();
			sh.draw();
		} else if(choose==2) {
			sh = new Rect();
			sh.draw();
		}
	}

}

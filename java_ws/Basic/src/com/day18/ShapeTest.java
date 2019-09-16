package com.day18;

import java.util.Scanner;

abstract class Shape {
	public abstract void draw();
}

class Circle extends Shape {
	public void draw() {
		System.out.println("���� �׸���");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("�簢���� �׸���");
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����ּ���. ��(1) �簢��(2)");
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

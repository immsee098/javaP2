package com.day11.object;

import java.util.Scanner;

class Circle {
	//1. 멤버변수
	int radius; 
	
	
	//2. 생성자
	Circle(int r) {
		radius = r;
	}
	
	//메서드
	//원의 면적 구하기
	public double findArea() {
		double area = radius*radius*Math.PI;
		return area;
	}
	
	
	public double findGirth() {
		double grith = 2*Math.PI*radius;
		return grith;
	}
	
}

public class CircleTest {

	public static void main(String[] args) {
		
		//생성자에 의해 멤버변수 초기화하기
		Circle c = new Circle(10);
		System.out.println(c.findArea());
		c.radius = 10;
		double area = c.findArea();
		System.out.println("원의 면적 : " + area);
		
		
		Circle c2 = new Circle(20);
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 입력");
		int r = sc.nextInt();
		
		c2.radius = r;
		area = c2.findArea();
		double grith = c2.findGirth();
		System.out.println(area+", "+grith);
		

	}

}

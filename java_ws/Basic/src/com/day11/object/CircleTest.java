package com.day11.object;

import java.util.Scanner;

class Circle {
	//1. �������
	int radius; 
	
	
	//2. ������
	Circle(int r) {
		radius = r;
	}
	
	//�޼���
	//���� ���� ���ϱ�
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
		
		//�����ڿ� ���� ������� �ʱ�ȭ�ϱ�
		Circle c = new Circle(10);
		System.out.println(c.findArea());
		c.radius = 10;
		double area = c.findArea();
		System.out.println("���� ���� : " + area);
		
		
		Circle c2 = new Circle(20);
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է�");
		int r = sc.nextInt();
		
		c2.radius = r;
		area = c2.findArea();
		double grith = c2.findGirth();
		System.out.println(area+", "+grith);
		

	}

}

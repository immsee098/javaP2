package com.day16.polymo;

import java.util.Scanner;

class Shape{
	public void draw() {
		System.out.println("�׸���");
	}
	
	public void delete() {
		System.out.println("�����");
	}
	
	public void showInfo() {
		System.out.println("Shape-showInfo()");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("���� �׸���");
	}
	
	public void delete() {
		System.out.println("���� �����");
	}
	
	public void sayCircle() {
		System.out.println("Circle���� �޼���");
	}
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("�ﰢ���� �׸���");
	}
	
	public void delete() {
		System.out.println("�ﰢ���� �����");
	}
	
	public void sayTriangle( ) {
		System.out.println("Triangle���� �ż���");
	}
}

public class PolymoTest1 {

	public static void main(String[] args) {
		Shape sh = new Circle();
		sh.draw(); //�ڽ��� �������̵� �޼��� ȣ��
		sh.delete();
		sh.showInfo();
		//sh.sayCircle() //error
		
		System.out.println("=============================");
		
		sh = new Triangle();
		sh.draw();
		sh.delete();
		//sh.sayTriangle(); //error
		
		System.out.println("=========�������==========");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n1.�� 2.�ﰢ�� ����");
		
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
			System.out.println("�߸��Է�");
		}
		
		Shape sh3 = null;
		System.out.println("\n\n======�������� �̿�========");
		if(type==1) {
			sh3 = new Circle();
		} else if(type==2) {
			sh3 = new Triangle();
		} else {
			System.out.println("�߸� �Է�");
			return;
		}
		
		sh3.draw();
		sh3.delete();
	}

}

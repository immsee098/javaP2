package com.javatest1;

class Shape {
	public double findArea() {
		return 0.0;
	}
}//

class Circle1 extends Shape {
	final double PI = 3.14;
	private int r;

	public Circle1(int r){
		this.r = r;
	}

	public double findArea() {
		return  PI*r*r;
	}

	public void showCircle(){
		System.out.println("Circle1�� �޼���!");
	}
}//

class Rect1 extends Shape {
	private int w;
	private int h;

	public Rect1(int w, int h){
		this.w =w;
		this.h = h;
	}
	public double findArea() {
		return w*h;
	}
	public void showRect(){
		System.out.println("Rect1�� �޼���!");
	}
}//

class javaExam1 {
	public static void main(String[] args) {
		//(1) Shape�迭�� �����, ��� 4���� ������ ��, �� ����� �������̵� �޼��� ȣ��
		Shape[] sh = new Shape[4];
		sh[0] = new Circle1(10);
		sh[1] = new Circle1(20);
		sh[2] = new Rect1(10, 20);
		sh[3] = new Rect1(30, 40);
				

		//(2) �� ����� �ڽ�Ŭ�������� �޼��� ȣ��
		Circle1 ci = (Circle1)sh[0];
		Rect1 re = (Rect1)sh[2];
		
		ci.showCircle();
		re.showRect();
		


	}

	private static Circle1 Circle1(Shape shape) {
		// TODO Auto-generated method stub
		return null;
	}
}

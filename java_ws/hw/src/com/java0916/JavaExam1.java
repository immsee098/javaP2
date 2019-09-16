package com.java0916;



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
		System.out.println("Circle1의 메서드!");
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
		System.out.println("Rect1의 메서드!");
	}
}//

class JavaExam1 {
	public static void main(String[] args) {
		//1) Shape배열을 만들고, 요소 4개를 저장한 후, 각 요소의 오버라이딩 메서드 호출
		Shape[] sh = new Shape[4];
		sh[0] = new Circle1(10);
		sh[1] = new Rect1(10, 20);
		sh[2] = new Circle1(20);
		sh[3] = new Rect1(20,40);
		
		for(Shape n : sh) {
			System.out.println(n.findArea());
		}



		//2) 각 요소의 자식클래스만의 메서드 호출
		for(Shape n : sh) {
			if(n instanceof Rect1) {
				Rect1 re = (Rect1)n;
				re.showRect();
			} else if(n instanceof Circle1) {
				Circle1 ci = (Circle1)n;
				ci.showCircle();
			}
		}

	}
}

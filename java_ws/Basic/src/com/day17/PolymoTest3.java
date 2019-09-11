package com.day17;


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

public class PolymoTest3 {
	
	static Shape shapeMethod(int type) {
		Shape pe = null;
		if(type==1) {
			pe = new Circle();
		} else if(type==2) {
			pe = new Triangle();
		}	
		return pe;
	}

	public static void main(String[] args) {
		Shape[] sh = new Shape[3];
		
		sh[0] = new Triangle();
		sh[1] = new Circle();
		sh[2] = new Triangle();
		
		for(int i =0; i<sh.length; i++) {
			sh[i].draw();
		}
		
		for(Shape n : sh) {
			n.delete();
		}
		
		shapeMethod(1).draw();
		
		
	}

}

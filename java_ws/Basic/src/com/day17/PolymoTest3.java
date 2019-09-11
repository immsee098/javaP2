package com.day17;


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

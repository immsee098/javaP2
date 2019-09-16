package com.day18;

interface Shape2 {
	public abstract void findArea();
}

class Circle2 implements Shape2{
	private int radius;
	Circle2(int radius){
		this.radius = radius;
	}
	
	public void findArea() {
		System.out.println(3.14*radius*radius);
	}
}

class Rectangle implements Shape2{
	private int width;
	private int height;
	Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}
	
	public void findArea() {
		System.out.println(width*height);
	}
}

public class ShapeTest2 {

	public static void main(String[] args) {
		Circle2 ci = new Circle2(10);
		Rectangle re = new Rectangle(10, 20);
		
		ci.findArea();
		re.findArea();

	}

}

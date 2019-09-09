package com.dqy15;

class Shape2 {
	public int findArea() {
		return 0;
	}
	
}

class Circle extends Shape2 {
	private int radius;
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public int findArea() {
		return (int)(3.14*radius*radius);
	}
	
}

class Recatangle extends Shape2{
	private int wi;
	private int he;
	
	public void setWidth(int wi) {
		this.wi= wi;
	}
	
	public void setHeight(int he) {
		this.he=he;
	}
	
	public int findArea() {
		return wi*he;
	}
}

public class Prac1 {

	public static void main(String[] args) {
		Circle ci = new Circle();
		
		ci.setRadius(10);
		System.out.println(ci.findArea());
		
		Recatangle re = new Recatangle();
		re.setHeight(20);
		re.setWidth(40);
		System.out.println(re.findArea());

	}

}

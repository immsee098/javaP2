package com.dqy15;

class Shape { 
	public void draw() 
	{ 
		System.out.println("도형을 그린다"); 
	} 
} 

class Triangle extends Shape { public void draw() { System.out.println("삼각형를 그린다"); } } class  OverridingTest3 { public static void main(String[] args) { Shape s = new Shape(); s.draw(); Triangle t = new Triangle(); t.draw(); } }
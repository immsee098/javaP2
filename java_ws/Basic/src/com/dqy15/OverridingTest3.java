package com.dqy15;

class Shape { 
	public void draw() 
	{ 
		System.out.println("������ �׸���"); 
	} 
} 

class Triangle extends Shape { public void draw() { System.out.println("�ﰢ���� �׸���"); } } class  OverridingTest3 { public static void main(String[] args) { Shape s = new Shape(); s.draw(); Triangle t = new Triangle(); t.draw(); } }
package com.day11.object;

class Rectangle {
	int width;
	int height;
	
	public int recArea() {
		return width*height;
	}
	
	public int recGi() {
		return (width+height)*2;
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		
		r1.width =20;
		r1.height= 30;
		System.out.println(r1.recArea());

	}

}

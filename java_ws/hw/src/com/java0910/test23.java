package com.java0910;

class Point{	
	int x;
	int y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
}//class

class Circle{	
	private Point p;
	private int r;

	//(1) 생성자
	Circle(Point p, int r){
		this.p = p;
		this.r = r;
	}


	//출력 메서드
	public void printInfo(){
		//(2) x, y 출력
		System.out.println(p.x);
		System.out.println(p.y);

		System.out.println("r=" + r+"\n");
	}
}//class

public class test23 {

	public static void main(String[] args) {
		Point p = new Point(10,20);
		Circle ci = new Circle(p, 5);
		ci.printInfo();

	}

}

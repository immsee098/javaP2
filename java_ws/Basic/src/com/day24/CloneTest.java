package com.day24;

class Point implements Cloneable{
	int x, y;
	
	//clonable 인터페이스틀 구현한 클래스에서만 clone()을 호출할 수 잇다. 이거 구현 안하고 부르면 예외발생
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "Point[x="+x+" , y="+y+"]";
	}
	
	public Point copy() {
		Object obj = null;
		try {
			obj=clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return (Point)obj;
	}
}

public class CloneTest {
	public static void main(String[] args) {
		Point p = new Point(10, 25);
		Point p2 = p.copy(); //복제본임 다른 객체가됨
		
		//복제본의 x y를 바꿈
		p2.x=300;
		p2.y=500;
		
		System.out.println("p="+p);
		System.out.println("p2="+p2);
	}

}

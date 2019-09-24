package com.day24;

class Point implements Cloneable{
	int x, y;
	
	//clonable �������̽�Ʋ ������ Ŭ���������� clone()�� ȣ���� �� �մ�. �̰� ���� ���ϰ� �θ��� ���ܹ߻�
	
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
		Point p2 = p.copy(); //�������� �ٸ� ��ü����
		
		//�������� x y�� �ٲ�
		p2.x=300;
		p2.y=500;
		
		System.out.println("p="+p);
		System.out.println("p2="+p2);
	}

}

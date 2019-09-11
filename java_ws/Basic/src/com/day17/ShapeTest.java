package com.day17;

import java.util.Scanner;

class Shape2{
	public double findArea() {
		return 0;
	}

	public String findKind() {
		return null;
	}

	
}

class Circle2 extends Shape2 {
	private int r;
	
	Circle2(int r){
		this.r = r;
	}
	
	public double findArea() {
		return Math.PI*r*r;
	}
	public String findKind() {
		return "��";
	}
}


class Rect2 extends Shape2 {
	private int x, y;
	
	Rect2(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public double findArea() {
		return x*y;
	}
	
	public String findKind() {
		return "�簢��";
	}
	
}

public class ShapeTest {

	public static void main(String[] args) {
		final int MAX_LENGTH = 3;
		Shape2[] shArr = new Shape2[MAX_LENGTH];
		Scanner sc = new Scanner(System.in);
		int index = 0;
		
		while(true) {
			//if((type==1 || type==2) && index==MAX_LENGTH)
			if(shArr[MAX_LENGTH-1] != null) {
				System.out.println("�� ���� �� ����");
				break;
			}
			System.out.println("1.�� 2.�簢�� 3.���� 4.���� �� ����");
			int type = sc.nextInt();
			
			switch(type) {
				case 1:
					System.out.println("������ �Է�");
					int radius = sc.nextInt();
					Circle2 c = new Circle2(radius);
					shArr[index++] = c;
					break;
				case 2:
					System.out.println("���� ���� �Է�");
					int width = sc.nextInt();
					int height = sc.nextInt();
					shArr[index++] = new Rect2(width, height);
					break;
				case 3:
					if(index==0) {
						System.out.println("�Է°� ����");
					}
					for(int i =0; i<index;i++) {
							double area = shArr[i].findArea();
							System.out.println(shArr[i].findKind()+ "���� : "+area);
						}
					break;
				case 4:
					System.out.println("�ý����� �����մϴ�");
					System.exit(0);
					
				default:
					System.out.println("�ٽ��Է�");
					continue;
			}
			
		}

	}

}

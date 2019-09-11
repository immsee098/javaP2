package com.day17;

import java.util.Scanner;

class ShapeManager {
	private final static int MAX_LENGTH = 3;
	private static Shape2[] shArr = new Shape2[MAX_LENGTH];
	static Scanner sc = new Scanner(System.in);
	private static int index = 0;
	
	public static void showMenu() {
		System.out.println("1.�� 2.�簢�� 3.���� 4.���� �� ����");
	}
	
	public static void inputCircle() {
		if(index==MAX_LENGTH) {
			System.out.println("�� ���� �� ����");
			return;
		}
		System.out.println("������ �Է�");
		int radius = sc.nextInt();
		
		Circle2 c = new Circle2(radius);
		shArr[index++] = c;
	}
	
	public static void inputRect() {
		if(index==MAX_LENGTH) {
			System.out.println("�� ���� �� ����");
			return;
		}
		System.out.println("���� ���� �Է�");
		int width = sc.nextInt();
		int height = sc.nextInt();
		shArr[index++] = new Rect2(width, height);
	}
	
	public static void showAllData() {
		if(index==0) {
			System.out.println("�Է°� ����");
		}
		for(int i =0; i<index;i++) {
				double area = shArr[i].findArea();
				System.out.println(shArr[i].findKind()+ "���� : "+area);
			}
	}
}



public class ShapeTest3 {

	public static void main(String[] args) {
		ShapeManager sm =new ShapeManager();
		Scanner sc = new Scanner(System.in);
		sm.showMenu();
		int type = sc.nextInt();
		
		
		while(true) {
			
			
			switch(type) {
				case 1:
					sm.inputCircle();
					break;
				case 2:
					sm.inputRect();
					break;
				case 3:
					sm.showAllData();
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

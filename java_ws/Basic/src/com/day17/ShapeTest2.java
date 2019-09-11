package com.day17;

import java.util.Scanner;



public class ShapeTest2 {
	private static final int MAX_LENGTH = 3;
	private static Shape2[] shArr = new Shape2[MAX_LENGTH];
	private static Scanner sc = new Scanner(System.in);
	private static int index = 0;
	
	public static void showMenu() {
		System.out.println("1.�� 2.�簢�� 3.���� 4.���� �� ����");
	}
	
	public static void inputCircle() {
		System.out.println("������ �Է�");
		int radius = sc.nextInt();
		Circle2 c = new Circle2(radius);
		shArr[index++] = c;
	}
	
	public static void inputRect() {
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

	public static void main(String[] args) {
		showMenu();
		int type = sc.nextInt();
		
		
		while(true) {
			//if((type==1 || type==2) && index==MAX_LENGTH)
			//if(shArr[MAX_LENGTH-1] != null) 
			if((type==1 || type==2) && index==MAX_LENGTH) {
				System.out.println("�� ���� �� ����");
				showAllData();
				break;
			}
			
			
			switch(type) {
				case 1:
					inputCircle();
					break;
				case 2:
					inputRect();
					break;
				case 3:
					showAllData();
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

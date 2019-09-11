package com.day17;

import java.util.Scanner;

class ShapeManager {
	private final static int MAX_LENGTH = 3;
	private static Shape2[] shArr = new Shape2[MAX_LENGTH];
	static Scanner sc = new Scanner(System.in);
	private static int index = 0;
	
	public static void showMenu() {
		System.out.println("1.원 2.사각형 3.보기 4.종료 중 선택");
	}
	
	public static void inputCircle() {
		if(index==MAX_LENGTH) {
			System.out.println("더 넣을 수 없음");
			return;
		}
		System.out.println("반지름 입력");
		int radius = sc.nextInt();
		
		Circle2 c = new Circle2(radius);
		shArr[index++] = c;
	}
	
	public static void inputRect() {
		if(index==MAX_LENGTH) {
			System.out.println("더 넣을 수 없음");
			return;
		}
		System.out.println("가로 세로 입력");
		int width = sc.nextInt();
		int height = sc.nextInt();
		shArr[index++] = new Rect2(width, height);
	}
	
	public static void showAllData() {
		if(index==0) {
			System.out.println("입력값 없음");
		}
		for(int i =0; i<index;i++) {
				double area = shArr[i].findArea();
				System.out.println(shArr[i].findKind()+ "면적 : "+area);
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
					System.out.println("시스템을 종료합니다");
					System.exit(0);
					
				default:
					System.out.println("다시입력");
					continue;
			}
			
		}

	}

}

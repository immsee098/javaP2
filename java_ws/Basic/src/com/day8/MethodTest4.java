package com.day8;

import java.util.Scanner;

public class MethodTest4 {
	public static int plus(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public static float minus(float a, int b) {
		float c = a-b;
		return c;
	}
	public static void main(String[] args) {
		int res = plus(10, 20);
		System.out.println("�� ���� ��: " +res);
		System.out.println("�� ���� ��: " + minus(3.14f, 4));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ǽ�, ������ �Է��ϼ���");
		float x = sc.nextFloat();
		int y = sc.nextInt();
		System.out.println(minus(x, y));


	}

}

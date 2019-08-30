package com.day9;

import java.util.Scanner;

public class OverloadingPrac1 {

	public static int Area(int a, int b) {
		int recarea = a*b;
		return recarea;
	}
	
	public static float Area(int c) {
		float cirarea = (float)(c*c*3.14);
		return cirarea;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가로, 세로, 반지름");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(Area(a,b));
		System.out.println(Area(c));
	}

}

package com.day8;

import java.util.Scanner;

public class MethodPrac2_3_25 {

	public static float numCalc(float a, float b) {
		float result = 0;
		if(a>=b) {
			result = a%b;
		} else {
			result = b%a;
		}
		return result;
		
	}
	
	public static int compare(int a, int b) {
		int result = 0;
		if(a>=b ) {
			result = a;
		} else {
			result = b;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("������ �Է��ϼ���");
			float x = sc.nextFloat();
			float y = sc.nextFloat();
			
			System.out.println(compare((int)x, (int)y));
			
			float n1 = x;
			float n2 = y;
			if(x==0 || y==0) {
				break;
			} else {
				System.out.println(numCalc(n1, n2));
			}
		}

	}

}
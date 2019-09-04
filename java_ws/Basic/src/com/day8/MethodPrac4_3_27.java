package com.day8;

import java.util.Scanner;

public class MethodPrac4_3_27 {
	
	public static boolean yearVer(int year) {
		boolean call = false;
		if(year %400==0 || (year%4 == 0 && year%100 != 0)){
			call = true;
		}
		return call;
	}
	
	public static String oddeven(int num) {
		String result = "";
		if(num%2 ==0) {
			result = "¦��";
		} else {
			result = "Ȧ��";
		}
		
		return result;
		
	}
	
	public static int genderVer(int num) {
		int gender = 0;
		if(num==1 || num==3) {
			gender = 1;
		} else if (num==2||num==4) {
			gender = 2;
		} else {
			gender = 3;
		}
		return gender;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�");
		int year = sc.nextInt();
		boolean k = yearVer(year);
		
		if(k) {
			System.out.println("�����Դϴ�");
		} else {
			System.out.println("����Դϴ�.");
		}
		
		System.out.println("=====");
		
		System.out.println("���ڸ� �Է��ϼ���");
		int num = sc.nextInt();
		String l = oddeven(num);
		
		if(l.equals("¦��")) {
			System.out.println("¦���Դϴ�");
		} else {
			System.out.println("Ȧ���Դϴ�");
		}
		
		System.out.println("=====");
		
		System.out.println("�ֹι�ȣ ���� �ڸ��� �Է��ϼ���");
		int num2 = sc.nextInt();
		int gender = genderVer(num2);
		
		if(gender==1) {
			System.out.println("�����Դϴ�");
		} else if (gender==2) {
			System.out.println("�����Դϴ�");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}
		
	}

}
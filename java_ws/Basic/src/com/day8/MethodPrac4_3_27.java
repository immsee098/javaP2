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
			result = "짝수";
		} else {
			result = "홀수";
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
		System.out.println("연도 입력");
		int year = sc.nextInt();
		boolean k = yearVer(year);
		
		if(k) {
			System.out.println("윤년입니다");
		} else {
			System.out.println("평년입니다.");
		}
		
		System.out.println("=====");
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		String l = oddeven(num);
		
		if(l.equals("짝수")) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
		
		System.out.println("=====");
		
		System.out.println("주민번호 성별 자리를 입력하세요");
		int num2 = sc.nextInt();
		int gender = genderVer(num2);
		
		if(gender==1) {
			System.out.println("남자입니다");
		} else if (gender==2) {
			System.out.println("여자입니다");
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
		
	}

}

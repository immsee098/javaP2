package com.day6;

import java.util.Scanner;

public class ForPrac6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연도 입력");
		int year = sc.nextInt();
		
		if(year %400==0 || (year%4 == 0 && year%100 != 0)){
			System.out.println("짝수 해, 윤년입니다");
		} else {
			if(year%2 == 0) {
				System.out.println("짝수 해, 평년입니다");
			} else {
				System.out.println("홀수 해, 평년입니다");
			}
		}

	}

}

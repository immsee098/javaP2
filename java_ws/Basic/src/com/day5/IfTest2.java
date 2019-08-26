package com.day5;

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		if(age >=20) {
			System.out.println("취미를 입력하세요 : 1.영화  2.축구  3.야구  4.등산");
			int hobby = sc.nextInt();
			
			if(hobby == 1) {
				result = "영화";
			} else if (hobby ==2) {
				result = "축구";
			} else if (hobby == 3) {
				result = "야구";
			} else {
				result = "등산";
			}
			System.out.println(result+"를 선택하셨습니다");
			
		} else {
			result = "20세 이상만 본 설문에 응할 수 있습니다.";
			System.out.println(result);
		}
		

	}

}

package com.day5;

import java.util.Scanner;

public class SwitchPrac1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("취미를 입력하세요 1. 영화 2. 축구 3. 야구 4. 등산 ");
		int hobby = sc.nextInt();
		String result = "";
		
		switch(hobby) {
			case 1:
				result = "영화를 선택하였습니다";
				break;
			case 2:
				result = "축구를 선택하였습니다";
				break;
			case 3: 
				result = "야구를 선택하였습니다";
				break;
			case 4:
				result = "등산를 선택하였습니다";
				break;
			default:
				result = "잘못선택했습니다";
		}
		
		System.out.println(result);
	
		
	}

}

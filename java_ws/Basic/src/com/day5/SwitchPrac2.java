package com.day5;

import java.util.Scanner;

public class SwitchPrac2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요 ");
		int month = sc.nextInt();
		String result = "";
		
		switch(month) {
			case 1:
			case 2:
			case 3:
				result = month+"월은 1사분기입니다";
				break;
			case 4:
			case 5:
			case 6:
				result = month+"월은 2사분기입니다";
				break;
			case 7:
			case 8:
			case 9:
				result = month+"월은 3사분기입니다";
				break;
			case 10:
			case 11:
			case 12:
				result = month+"월은 4사분기입니다";
				break;
			default:
				result = "잘못 선택했어요";	
		}
		System.out.println(result);
	}

}

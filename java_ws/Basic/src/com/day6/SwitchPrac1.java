package com.day6;

import java.util.Scanner;

public class SwitchPrac1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호 뒷자리의 성별에 해당하는 숫자를 입력하세요(1,2,3,4)");
		int age = sc.nextInt();
		switch(age) {
			case 1:
				System.out.println("남자");
				break;
			case 2:
				System.out.println("여자");
				break;
			case 3:
				System.out.println("2000이후 출생한 남자");
				break;
			case 4: 
				System.out.println("2000이후 출생한 여자");
				break;
			default:
				System.out.println("잘못입력");
		}
		
	}

}

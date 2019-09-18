package com.day20;

import java.util.Scanner;

public class ThrowTest {

	public static void main(String[] args) {
		/*
		 * throw - 개발자가 강제로 예외를 발생시킬 때 사용
		 * throw new Exception("ㅇㅖ외 메시지:);
		 * 
		 * 자바 가상머신이 인식할 수 없는 예외상황이지만,
		 * 개발자가 정의한 예외인 경우
		 * throw를 사용ㅎㅐ 강제로 예외를 발생시킴
		 */
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("나이 입력");
			int age = sc.nextInt();
			
			if(age<0) {
				throw new Exception("나이는 양수여야 합니다");
			}
			
			System.out.println("나이:"+age);
		} catch(Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}

	}

}

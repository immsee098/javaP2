package com.day20;

import java.util.Scanner;

public class TryTest {

	public static void main(String[] args) {
		/*
		 *에러
		 *[1] 컴파일 에러(Compile Error) - 소스코드 컴파일 중 발생한 에러
		 *[2] 실행 에러(Runtime Error) - 실행 중 팔생한 에러
		 *	1) 에러(error) - 메모리 부족이나 스택오버플로우 등, 일단 발생하면 복구될 수 없는 심각한 에러
		 *	2) 예외(Exception) - 수습될 수 있는 덜 심각한 에러
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개 입력!");
		
		try {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			int res = n1/n2;
			
			System.out.println("나눗셈 결과:"+res);
			System.out.println("\n다음문장!!");

			
		} catch(Exception e) {
			 System.out.println("예외 발생!:"+e.getMessage());
		}
		
		System.out.println("==0다음준장==");

	}

}

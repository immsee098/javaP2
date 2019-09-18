package com.day20;

import java.util.Scanner;

public class NonException {

	public static void main(String[] args) {
		// 예외처리를 하지 않은 경우
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개 입력!");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int res = n1/n2;
		
		System.out.println("나눗셈 결과:"+res);
		System.out.println("\n다음문장!!");

	}

}

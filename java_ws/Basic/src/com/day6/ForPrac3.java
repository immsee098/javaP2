package com.day6;

import java.util.Scanner;

public class ForPrac3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3배수의 개수를 입력하세요");
		int num = sc.nextInt();
		
		for(int i=1; i<num+1; i++) {
			System.out.print(i*3 + "  ");
		}
		System.out.println();
		System.out.println("n의 계승 구하기 : n을 입력하세요");
		int num2 = sc.nextInt();
		int fac = 1;
		for(int i=1; i<num2+1; i++) {
			fac *= i;
		}
		System.out.println("1~"+num2+"까지의 곱 :"+fac);

	}

}

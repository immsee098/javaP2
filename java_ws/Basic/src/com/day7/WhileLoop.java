package com.day7;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// 무한루프
		
		/*
		 while(true) {
		 	반복할 내용
		 	
		 	if(조건식) break;
		 }
		 */
		
		//양수, 음수 출력, 0을 임력하면 무한루트 탈출
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("정수를 입력하세요");
			int n = sc.nextInt();
			
			if(n==0) {
				break;
			} else if(n>0) {
				System.out.println("양수\n");
			} else {
				System.out.println("음수\n");
			}
		}//while

	}

}

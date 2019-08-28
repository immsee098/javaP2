package com.day7;

public class WhileTest2 {

	public static void main(String[] args) {
		/*
		 while문도 for처럼 사용 가능
		 
		 조건식
		 while(조건식) {
		 	반복할 내용
		 	
		 	증감식
		 }
		 */
		
		for(int i=0; i<3; i++) {
			System.out.println("i="+i);
		}
		System.out.println("\nwhile문 이용");
		
		int k = 0;
		while(k<3) {
			System.out.println("k="+k);
			k++;
		}
		
		//1~20까지 짝수만 출력
		int even = 0;
		while(even<21) {
			System.out.print(even + "\t");
			even +=2;
		}
		
		System.out.println();
		
		//1~20까지 홀수의 합 구하기
		int odd = 1;
		while(odd<20) {
			System.out.print(odd + "\t");
			odd += 2;
		}
		

	}

}

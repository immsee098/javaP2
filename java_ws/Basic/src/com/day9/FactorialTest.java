package com.day9;

public class FactorialTest {

	public static void main(String[] args) {
		//재귀 호출 - 메서드 내에서 자신의 매서드를 호출하는 것
		//- 반복문 대신 사용가능
		//- 효율성이 떨어진다는 단점
		//대표적인 재귀호출의 예 - factorial
		System.out.println(factorial(5));

	}
	
	public static long factorial(int n) {
		/*
		 4! = 4*3*2*1
		 	= 4*3,,,
		 */
		
		long result = 0;
		if(n==1) {
			result = 1;
		} else {
			result=n*factorial(n-1);
		}
		
		return result;
	}

}

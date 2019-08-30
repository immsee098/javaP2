package com.day9;

public class Fibo {
	
	public static int fib(int a) {
		int result = 0;
		if(a == 0) {
			result = 0;
		} else if (a == 1) {
			result = 1;
		} else {
			result = fib(a-2) + fib(a-1);
		}
		
		return result;
	}

	public static void main(String[] args) {
		for(int i=0; i<9; i++) {
			System.out.print(fib(i)+"\t");
		}

	}

}

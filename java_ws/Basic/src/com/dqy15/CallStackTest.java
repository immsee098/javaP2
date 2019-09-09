package com.dqy15;

public class CallStackTest {

	public static void main(String[] args) {
		/*
		 자바 가상머신 문여체로부터 프로그램에 필요한 메모리를 할당받음
		 할당받은메모리를 이용하여 자신도 진행되고
		 자바 프로그램도 실형시킴
		 
		 아래와 같이 묶어서 명령
		 */
		
		int a = 10, b=20;
		int c=a+b;
		
		firstMethod();

	}
	
	private static void firstMethod() {
		int n1 = 50;
		int result2 = secondMethod(n1);
	}
	
	public static int secondMethod(int num) {
		System.out.println(num);
		int res = num*100;
		return res;
	}

}

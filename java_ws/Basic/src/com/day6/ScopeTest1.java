package com.day6;

public class ScopeTest1 {

	public static void main(String[] args) {
		int a =10; //지역변수 - main이 종료되면 소멸됨
		
		//for(int a =0; a<3; a++) {}  ~>에러남
		
		for(int i=0;i<3;i++) {
			System.out.println("i="+i);
			System.out.println("a="+a);
		}
		
		for(int i=0; i<2; i++) {
			int n=20;
			System.out.println(i);
			System.out.println("n="+n);
		}
		//System.out.println("n="+n);
		//System.out.println("i="+i);
		System.out.println("a="+a);		
		

	}

}

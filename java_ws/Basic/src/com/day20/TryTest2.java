package com.day20;

import java.util.Scanner;

public class TryTest2 {

	public static void main(String[] args) {
		// for문 안에 try~catch구문이 있는 경우
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			try {System.out.println("정수2개입력");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			int res = n1/n2;
			
			System.out.println("나눗셈 결과:"+res);}
			catch(Exception e ) {
				e.printStackTrace();
				i--;
			}
		}
		System.out.println("\nnext");

	}

}

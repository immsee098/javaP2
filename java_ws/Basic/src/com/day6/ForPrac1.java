package com.day6;

import java.util.Scanner;

public class ForPrac1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += i;
			System.out.println("����ִ� java!"+ "\t"+ "i="+i);
			System.out.println();
		}
		
		for(int i=0; i<n; i++) {
			sum += i;
			System.out.println("i="+i+", sum="+sum);
			System.out.println();
		}
		
		System.out.println("0���� "+n+"������ ��="+sum);

	}

}
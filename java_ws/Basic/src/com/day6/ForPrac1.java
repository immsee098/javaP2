package com.day6;

import java.util.Scanner;

public class ForPrac1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += i;
			System.out.println("재미있는 java!"+ "\t"+ "i="+i);
			System.out.println();
		}
		
		for(int i=0; i<n; i++) {
			sum += i;
			System.out.println("i="+i+", sum="+sum);
			System.out.println();
		}
		
		System.out.println("0부터 "+n+"까지의 합="+sum);

	}

}

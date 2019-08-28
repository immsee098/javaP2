package com.day7;

import java.util.Scanner;

public class Prac2p121 {

	public static void main(String[] args) {
		for (int i =2; i<9; i+=2) {
			for(int j = 1; j< i+1; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		
		System.out.println("======");
		
		for(int i=0; i<5; i++) {
			for(int j=(5*i)+1; j <(5*(i+1))+1; j++) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
		
		System.out.println("=========");
		
		System.out.println("정수 2개 입력");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x=0;
		int y=0;
		
		
		int sum = 0;
		if(a>=b) {
			x = b;
			y = a;
		}else {
			x = a;
			y = b;
			
		}
		
		for(int i =x; i<y+1; i++) {
			if(i%2 !=0) {
				sum += i;
		}

		}
		System.out.println("정수 사이의 홀수 합 : " + sum);
	}
}
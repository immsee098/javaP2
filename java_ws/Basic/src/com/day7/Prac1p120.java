package com.day7;

import java.util.Scanner;

public class Prac1p120 {

	public static void main(String[] args) {
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
		sum += i;
		}
		System.out.println("정수 사이의 합 : " + sum);
		
		
		System.out.println();
		int sum2 = 0;
		for(int i =1; i<101; i++) {
			if(i%3==0 && i%5==0) {
				sum2 += i;
			} else if (i%3 == 0) {
				sum2 += i;
			} else if(i%5==0) {
				sum2 += i;
			}
		}//for
		
		System.out.println("3과 5의 배수의 합 : " + sum2);
	}

}

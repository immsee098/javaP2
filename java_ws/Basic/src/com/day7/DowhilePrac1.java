package com.day7;

import java.util.Scanner;

public class DowhilePrac1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("정수를 입력하세요");
			num = sc.nextInt();
			
			if(num>0) {
				System.out.println("양수 : "+num);
			} else if(num<0) {
				System.out.println("음수 : "+num);
			}
				
		} while(num!=0);
		

	}

}

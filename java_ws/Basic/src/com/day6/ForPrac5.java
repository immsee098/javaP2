package com.day6;

import java.util.Scanner;

public class ForPrac5 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i =0; i<101; i+=2) {
			sum += i;
		}
		
		System.out.println(sum);
		
		
		Scanner sc = new Scanner(System.in);
		int qq = sc.nextInt();
		
		for(int i=9; i>0; i--) {
			System.out.println(qq +"*"+ i + "="+qq*i);
		}

	}

}

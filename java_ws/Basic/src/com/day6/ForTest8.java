package com.day6;

import java.util.Scanner;

public class ForTest8 {

	public static void main(String[] args) {
		for (int i=1; i<7; i++) {
			for(int j=1; j<7; j++) {
				System.out.println(i+", "+j);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<amount+1; i++) {
			System.out.println("������ �Է��ϼ���");
			int a = sc.nextInt();
			sum += a;
		}
		
		float b = (float)sum / (amount);
		System.out.println(Math.round(b*100)/100.0);
	}

}
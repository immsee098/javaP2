package com.day6;

import java.util.Scanner;

public class forLoopPrac1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(;;) {
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			sum += num;
			
			if (num ==0) {
				System.out.println("숫자의 합은" + sum);
				break;
			}
			
		}

	}

}

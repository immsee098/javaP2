package com.day6;

import java.util.Scanner;

public class forLoopPrac1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(;;) {
			System.out.println("���ڸ� �Է��ϼ���");
			int num = sc.nextInt();
			sum += num;
			
			if (num ==0) {
				System.out.println("������ ����" + sum);
				break;
			}
			
		}

	}

}
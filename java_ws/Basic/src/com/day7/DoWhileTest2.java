package com.day7;

import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(;;) {
			System.out.println("������ �Է��ϼ���");
			int n = sc.nextInt();
			if(n==0) break;
			
			sum += n;
		}//for
		
		System.out.println("�Է��� ���ڵ��� ��"+sum);

		int sum2 = 0;
		int num =0;
		do {
			System.out.println("���� �Է�!");
			num = sc.nextInt();
			sum2 += num;
		} while (num !=0);
		System.out.println("\n�հ� : "+sum2);
	}
	

}
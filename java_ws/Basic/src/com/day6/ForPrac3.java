package com.day6;

import java.util.Scanner;

public class ForPrac3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3����� ������ �Է��ϼ���");
		int num = sc.nextInt();
		
		for(int i=1; i<num+1; i++) {
			System.out.print(i*3 + "  ");
		}
		System.out.println();
		System.out.println("n�� ��� ���ϱ� : n�� �Է��ϼ���");
		int num2 = sc.nextInt();
		int fac = 1;
		for(int i=1; i<num2+1; i++) {
			fac *= i;
		}
		System.out.println("1~"+num2+"������ �� :"+fac);

	}

}
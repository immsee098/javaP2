package com.day20;

import java.util.Scanner;

public class NonException {

	public static void main(String[] args) {
		// ����ó���� ���� ���� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 2�� �Է�!");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int res = n1/n2;
		
		System.out.println("������ ���:"+res);
		System.out.println("\n��������!!");

	}

}

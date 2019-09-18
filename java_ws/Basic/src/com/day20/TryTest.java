package com.day20;

import java.util.Scanner;

public class TryTest {

	public static void main(String[] args) {
		/*
		 *����
		 *[1] ������ ����(Compile Error) - �ҽ��ڵ� ������ �� �߻��� ����
		 *[2] ���� ����(Runtime Error) - ���� �� �Ȼ��� ����
		 *	1) ����(error) - �޸� �����̳� ���ÿ����÷ο� ��, �ϴ� �߻��ϸ� ������ �� ���� �ɰ��� ����
		 *	2) ����(Exception) - ������ �� �ִ� �� �ɰ��� ����
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 2�� �Է�!");
		
		try {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			int res = n1/n2;
			
			System.out.println("������ ���:"+res);
			System.out.println("\n��������!!");

			
		} catch(Exception e) {
			 System.out.println("���� �߻�!:"+e.getMessage());
		}
		
		System.out.println("==0��������==");

	}

}

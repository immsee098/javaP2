package com.day20;

import java.util.Scanner;

public class TryTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			for(int i=0; i<3; i++) {
				System.out.println("�� ���� �Է�");
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				int res = n1/n2;
				System.out.println("res:"+res);
			}
		} catch(Exception e) {
			System.out.println("���ܹ߻�:"+e); //���� Ŭ�������� ����
		}
		System.out.println("\n======next!!======");
	}

}

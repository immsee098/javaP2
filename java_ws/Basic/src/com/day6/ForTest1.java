package com.day6;

import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {
		// ����ڷκ��� �ݺ�Ƚ�� �Է¹޾� �� ����ŭ hello java ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݺ� Ƚ���� �Է��ϼ���");
		int count = sc.nextInt();
		
		for (int i=0; i<(count+1); i++) {
			System.out.println(i+" Hello Java");
		}

	}

}
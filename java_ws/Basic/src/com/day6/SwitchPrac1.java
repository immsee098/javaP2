package com.day6;

import java.util.Scanner;

public class SwitchPrac1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹι�ȣ ���ڸ��� ������ �ش��ϴ� ���ڸ� �Է��ϼ���(1,2,3,4)");
		int age = sc.nextInt();
		switch(age) {
			case 1:
				System.out.println("����");
				break;
			case 2:
				System.out.println("����");
				break;
			case 3:
				System.out.println("2000���� ����� ����");
				break;
			case 4: 
				System.out.println("2000���� ����� ����");
				break;
			default:
				System.out.println("�߸��Է�");
		}
		
	}

}
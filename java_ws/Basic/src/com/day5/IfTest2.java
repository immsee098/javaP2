package com.day5;

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		System.out.println("���̸� �Է��ϼ���");
		int age = sc.nextInt();
		
		if(age >=20) {
			System.out.println("��̸� �Է��ϼ��� : 1.��ȭ  2.�౸  3.�߱�  4.���");
			int hobby = sc.nextInt();
			
			if(hobby == 1) {
				result = "��ȭ";
			} else if (hobby ==2) {
				result = "�౸";
			} else if (hobby == 3) {
				result = "�߱�";
			} else {
				result = "���";
			}
			System.out.println(result+"�� �����ϼ̽��ϴ�");
			
		} else {
			result = "20�� �̻� �� ������ ���� �� �ֽ��ϴ�.";
			System.out.println(result);
		}
		

	}

}

package com.day22;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		String file = "test.txt";
		int f = file.lastIndexOf(".");
		String s1 = file.substring(0,f);
		String s2 = file.substring(f+1);
		System.out.println("���ϸ�:"+s1+", Ȯ����:"+s2);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ּ��Է�");
		String input = sc.nextLine();
		String n = "http://www.mall.com";
		
		if(input.indexOf(n) == -1) {
			System.out.println("Url�ּҰ� �������� ����");
		} else {
			System.out.println("�ش� Url�ּ�:"+input);
		}

	}

}

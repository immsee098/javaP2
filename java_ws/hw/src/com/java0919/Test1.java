package com.java0919;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("�ֹι�ȣ �Է�");
			String num = sc.nextLine();
			
			if(num.length()!=14) {
				throw new Exception("�ֹι�ȣ�� 14�ڸ���");
			}
			System.out.println("�ֹι�ȣ :"+num);
		} catch(Exception e) {
			System.out.println("���� �߻�:"+e.getMessage());
		}
		

	}

}

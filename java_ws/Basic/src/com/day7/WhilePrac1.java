package com.day7;

import java.util.Scanner;

public class WhilePrac1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�� ���� ������ �Է��ϼ���(������ ���� ������ �Է�)");
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0 && b==0) {
				break;
			} else if (a == 0 || b == 0) {
				sc.nextLine();
				continue;
			} else {
				int share = a/b;
				int left = a%b;
				System.out.println("�� : "+share + ", ������:"+left);
				System.out.println();
				sc.nextLine();
			}
		}

	}

}
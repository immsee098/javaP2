package com.day6;

import java.util.Scanner;

public class ForPrac6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�");
		int year = sc.nextInt();
		
		if(year %400==0 || (year%4 == 0 && year%100 != 0)){
			System.out.println("¦�� ��, �����Դϴ�");
		} else {
			if(year%2 == 0) {
				System.out.println("¦�� ��, ����Դϴ�");
			} else {
				System.out.println("Ȧ�� ��, ����Դϴ�");
			}
		}

	}

}
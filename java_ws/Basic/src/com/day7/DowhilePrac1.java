package com.day7;

import java.util.Scanner;

public class DowhilePrac1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("������ �Է��ϼ���");
			num = sc.nextInt();
			
			if(num>0) {
				System.out.println("��� : "+num);
			} else if(num<0) {
				System.out.println("���� : "+num);
			}
				
		} while(num!=0);
		

	}

}
package com.day7;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// ���ѷ���
		
		/*
		 while(true) {
		 	�ݺ��� ����
		 	
		 	if(���ǽ�) break;
		 }
		 */
		
		//���, ���� ���, 0�� �ӷ��ϸ� ���ѷ�Ʈ Ż��
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("������ �Է��ϼ���");
			int n = sc.nextInt();
			
			if(n==0) {
				break;
			} else if(n>0) {
				System.out.println("���\n");
			} else {
				System.out.println("����\n");
			}
		}//while

	}

}
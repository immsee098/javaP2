package com.day7;

public class WhileTest2 {

	public static void main(String[] args) {
		/*
		 while���� foró�� ��� ����
		 
		 ���ǽ�
		 while(���ǽ�) {
		 	�ݺ��� ����
		 	
		 	������
		 }
		 */
		
		for(int i=0; i<3; i++) {
			System.out.println("i="+i);
		}
		System.out.println("\nwhile�� �̿�");
		
		int k = 0;
		while(k<3) {
			System.out.println("k="+k);
			k++;
		}
		
		//1~20���� ¦���� ���
		int even = 0;
		while(even<21) {
			System.out.print(even + "\t");
			even +=2;
		}
		
		System.out.println();
		
		//1~20���� Ȧ���� �� ���ϱ�
		int odd = 1;
		while(odd<20) {
			System.out.print(odd + "\t");
			odd += 2;
		}
		

	}

}

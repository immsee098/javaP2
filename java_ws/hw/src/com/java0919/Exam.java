package com.java0919;

import java.util.Scanner;

class  Exam{
	public static void main(String[] args) 	{
		//1) arr �迭 ����	
		int[] arr = new int[10];
		

		int count=arr.length;  //���� ������ ����

		//2) 2�� ����� �ʱ�ȭ - for�� �̿�
		for(int i=1; i<11; i++) {
			arr[i-1] = i*2;
		}


		//���� �� �迭 ��� ���
		for(int n : arr){
			System.out.println(n);
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("\n�����Ϸ��� �ε����� �Է��ϼ���");
		int delIdx=sc.nextInt();
		
		//3) ���� ó��
		for(int i=delIdx; i<count-1; i++) {
			arr[i] = arr[i+1];
		}
		count = count-1;
		
		
		//4) ���� �� �迭 ��� ���
		
		for(int n: arr) {
			System.out.println(n);
		}
	}
}
		
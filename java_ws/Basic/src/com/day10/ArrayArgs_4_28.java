package com.day10;

import java.util.Scanner;

public class ArrayArgs_4_28 {
	
	public static void pringAvg(int[] score) {
		int sum=0; 
		for (int i=0;i<score.length ;i++ ) 
		{
			sum+=score[i]; 
		}
		
		int avg = sum/score.length;
		System.out.println("����:"+sum +", ���:"+avg);
		score[0]+=5; //1. ������ ��������
		
	}
	
	public static int add(int a, int b) {
		int c =a+b; //a�� a���� b���� �� c�� �����. c�� ������� �� a�� �ٽ� ���Ե�!! a500�� ���� �ö󰡸� �������
		a=500;
		
		return c;
	}

	public static void main(String[] args) {
		//call by reference
		//=>�Ű������� �ּҸ� �ѱ�� ��(�Ű������� ������)
		//=>�ż��忡�� �Ű������� ���� �����ϸ� ȣ���� �������� ���� �޴´� ~> �ּҸ� �ѱ��.... ���� ���� ����ų ���ɼ� ����
		Scanner sc = new Scanner(System.in); 
		System.out.println("����, ����, ���� ������ �Է��ϼ���"); 
		int[] subject = new int[3]; 
		for (int i=0;i<subject.length ;i++ ) 
		{ subject[i]=sc.nextInt(); 
		}
		
		pringAvg(subject); 
		
		System.out.println("subject[0] : " + subject[0]); //2.�̺κ��� subject[0]���� ���� ���� �ͺ��� +5�� ����.. ���� ���� �迭�� �ٲ���⶧��
		
		
		//call by value
		//=>�Ű������� ���� �Ѱ��ִ� ��
		int n1=10, n2=20;
		int res = add(n1, n2);
		System.out.println("�� ���� �� : "+res);
		//�ż��忡�� �Ű������� ���� �����ص� main���� ���� �ȹ���(a�� 500���� �����ص� add(n1, n2)���� 30��)
	}

}

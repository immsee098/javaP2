package com.day9.array;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		// for�� �ȿ��� �迭 �ʱ�ȭ
		// 5, 10, 15, 20, 25
		int[] arr = new int[5];
		
		//�ʱ�ȭ
		for(int i=0; i<arr.length; i++) {
			arr[i]=5*(i+1);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//����ڷκ��� �Է¹��� �Ǽ��� �迭�� �ֱ�
		
		double[] darr = new double[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ǽ� 4���� �Է��ϼ���");
		
		for(int i=0; i<darr.length; i++) {
			darr[i]=sc.nextDouble();
		}
		
		//���
		for(int i =0; i<darr.length; i++) {
			System.out.println(darr[i]+'\t');
		}

	}

}

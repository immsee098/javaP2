package com.day10;

import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		//�迭�� ���� ���� - �迭���� ��ü�� �����
		//�迭�� �ν��Ͻ��� ������� ����
		//=>�迭�� �������̹Ƿ� �迭��ִ� �ּҰ� ����,
		//�迭�ּҸ� �����ϸ� ���� �޸� ������ �����Ե�(���� �ּҰ� �Ǿ)
		
		int[] arr = new int[4];
		int[] num = arr; //num�� arr�� ������ �ּ�
		//���� �޸� ���� �����ɵ�
		
		arr[0]++;
		System.out.println("arr[0]=" + arr[0]); //1
		System.out.println("num0[0]=" + num[0]); //1
		
		int[] arr2 = {15,90,78};
		int[] copy =arr2;
		arr2[1]++;
		
		System.out.println("\n\n====arr2�迭�� ���===");
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]+"\t");
		}
			
			
			System.out.println("\n\n====copy�迭�� ���===");
			
			for(int i=0; i<copy.length; i++) {
				System.out.println(copy[i]+"\t");
			}
	}

}

package com.day9.array;

import java.util.Scanner;

public class ArrayPrac2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� �迭�� ������ �Է��ϼ���: ");
		int insert = sc.nextInt();
		
		int[] arr = new int[insert];
		
		for(int i=0; i<insert; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		
		System.out.println("=============");
		
		int[] arr2 = new int[5];
		
		for(int i =0; i<arr2.length; i++) {
			arr2[i] = (i+1)*2-1;
			System.out.println(arr2[i]);
		}

	}

}

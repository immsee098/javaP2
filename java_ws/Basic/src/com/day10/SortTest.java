package com.day10;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		// �迭 ��� ���� - �������� ����
		// public static void sort(int[] a)
		
		int[] arr = {55,36,44,78,99,21,3};
		
		for(int n : arr) {
			System.out.println(n+"\n");
		}
		
		//����
		Arrays.sort(arr);
		
		System.out.println("\n\n----������-----");
		
		for(int n : arr) {
			System.out.println(n+"\n");
		}		

	}

}

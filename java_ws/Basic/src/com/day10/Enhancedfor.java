package com.day10;

public class Enhancedfor {

	public static void main(String[] args) {
		// enhanced for, for each��
		// �迭�̳� �÷����� ��ȸ��� �ݺ�ó��
		// �迭�� �÷����� ������ŭ �ݺ�
		
		/*
		 for(�ڷ��� ����: �迭�̳� �÷���) {
		 	�ݺ��� ����
		 }
		 */
		
		int[] num= {12, 43, 64, 56, 32};
		for (int n : num) { System.out.println(n); } 
		
		String[] hobby= {"movie", "reading", "sports"};
		for (String s : hobby) { System.out.println(s); }


	}

}

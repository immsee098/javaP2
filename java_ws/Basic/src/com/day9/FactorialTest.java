package com.day9;

public class FactorialTest {

	public static void main(String[] args) {
		//��� ȣ�� - �޼��� ������ �ڽ��� �ż��带 ȣ���ϴ� ��
		//- �ݺ��� ��� ��밡��
		//- ȿ������ �������ٴ� ����
		//��ǥ���� ���ȣ���� �� - factorial
		System.out.println(factorial(5));

	}
	
	public static long factorial(int n) {
		/*
		 4! = 4*3*2*1
		 	= 4*3,,,
		 */
		
		long result = 0;
		if(n==1) {
			result = 1;
		} else {
			result=n*factorial(n-1);
		}
		
		return result;
	}

}

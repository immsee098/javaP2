package com.dqy15;

public class CallStackTest {

	public static void main(String[] args) {
		/*
		 �ڹ� ����ӽ� ����ü�κ��� ���α׷��� �ʿ��� �޸𸮸� �Ҵ����
		 �Ҵ�����޸𸮸� �̿��Ͽ� �ڽŵ� ����ǰ�
		 �ڹ� ���α׷��� ������Ŵ
		 
		 �Ʒ��� ���� ��� ���
		 */
		
		int a = 10, b=20;
		int c=a+b;
		
		firstMethod();

	}
	
	private static void firstMethod() {
		int n1 = 50;
		int result2 = secondMethod(n1);
	}
	
	public static int secondMethod(int num) {
		System.out.println(num);
		int res = num*100;
		return res;
	}

}

package com.day8;

public class MethodTest3_3_17 {
	public static void func() {
		System.out.println("***********");
		//�Ű������� �ְ�, ��ȯ���� ���� �޼��� ����
		//�Է¹��� ������ŭ ���� ����ϴ� �޼���
	}
	
	public static void func2(int cnt) {
		for(int i=0; i<cnt; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	//[3] �Ű������� ����, ��ȯ���� �ִ� �޼��� ����
	//1~10���� ���� ���� �� ����� �����ϴ� �޼���
	public static double func3() {
		int sum = 0;
		for(int i =1; i<=10; i++) {
			sum +=i;
		}
		double avg = sum/10.0;
		return avg;
	}
	
	//[4] �Ű����� �ְ�, ��ȯ���� �ִ� �ż��� ����
	//�� ���� ���� ���ϴ� �ż���
	public static int add(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public static void main(String[] args) {
		//[1]�Ű������� ���� ��ȯ���� ���� �޼��� ȣ��
		func();
		
		//[2]�Ű������� �ְ� ��ȯ���� ���� �޼��� ȣ��
		func2(5);
		
		int count = 6;
		func2(count);
		
		
		//[3] �Ű������� ����, ��ȯ���� �ִ� �ż��� ȣ��
		double d= func3();
		System.out.println(d);
		
		//�Ű������� �ְ� ��ȯ���� �ִ� �ż��� ����
		int k = add(1,2);
		System.out.println(k);
		
		//System.out.println(":" + func()); //error ~> void�϶� ������ return�� ���
	}

}
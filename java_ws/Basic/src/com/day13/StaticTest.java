package com.day13;

public class StaticTest {
	int num; //�ν��Ͻ� ����
	static int num2; //static ����
	
	public int add() { //�ν��Ͻ� �ż��忡�� static������ ��� ����
		return num+num2;
	}
	
	public static int multiply(int a, int b) {
		//int result = num1*num2; //error, static �޼��忡���� static ������ ���� ����
		//=> num1�� �ν��Ͻ� �����̹Ƿ� ���� �Ұ�
		return a*b;
	}

	public static void main(String[] args) {
		// static �޼��� ȣ��
		// ���� Ŭ������ �޼�������� ȣ��
		
		int res = multiply(10, 5);
		System.out.println("�� ���� �� : "+res);
		
		//�ν��Ͻ� �޼��� ȣ��
		//int result = add(); //error
		//=>main�� static�̹Ƿ� static�� ���� ����
		//static���� �ν��Ͻ� �޼��忡 �����Ϸ��� ������ ���� �� ����
		
		StaticTest obj = new StaticTest();
		res = obj.add();
		System.out.println("�� ���� �� : "+res);

	}

}

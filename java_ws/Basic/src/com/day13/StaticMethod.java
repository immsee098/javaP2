package com.day13;

class Calculator {
	public static int add(int a, int b) {
		return a+b;
	}
	
	public int minus(int a, int b) {
		return a-b;
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// static�޼��� ȣ��=>Ŭ������.�ż���()
		//=>��ü�� �������� �ʾƵ� Ŭ�����κ��� ȣ���Ҽ�����
		int result = Calculator.add(10, 20);
		System.out.println(result);
		int n = Integer.parseInt("123");
		
		// �ν��Ͻ� ���޼��� ȣ��=>��ü���� �� ��������.�޼���()
		Calculator cal = new Calculator();
		result = cal.minus(50, 30);
		System.out.println(result);
		
	
	}

}

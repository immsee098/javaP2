package com.day9;

public class Overloading {

	public static void main(String[] args) {
		/*
		 �����ε� �ż���
		 -�ϳ��� Ŭ�������� ������ �̸��� ���� �޼���
		 ��, �Űܺ����� ������ �ڷ����� �޶�� ��
		 -����� ����� �ߺ� ������ �� ���
		 */
		int res = add(10,20);
		System.out.println("�� ������ ��  : " + res);
		System.out.println("�� �Ǽ��� �� : " + add(2.3f, 3.4f));
		System.out.println("�� �Ǽ��� �� : " + add(3.14, 5.67, 8));
		System.out.println("�� ���ڿ� ���� : " + add("a", "b"));

	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static float add(float a, float b) {
		return a+b;
	}
	
	public static double add(double a, double b, double c) {
		return a+b+c;
	}
	
	public static String add(String a, String b) {
		return a+b;
	}
	
	//public String add(int a, int b) {
		//return Integer.toString(a+b);
	//}
	//error �����ε� �޼��尡 �ƴ�
	//�Ű������� �޶���� ��ȯŸ���� �ٸ� �� �����ε��� �ƴ�
	//�Ű������� �����ϹǷ� ����
}

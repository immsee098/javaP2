package com.day20;

public class ThrowsTest {
	
	public static void method1() throws Exception { //���⼭ �� ���ѱ�� ���⼭ ����ó����
		method2();
//		try {
//			method2();
//		} catch (Exception e) {
//			System.out.println("����:"+e.getMessage());
//		}
//		System.out.println("\n===next===");
	}
	
	public static void method2() throws Exception{
		throw new Exception("����� ���� ���ܰ� �߻���!!!");
	}

	public static void main(String[] args) {
		//method1();
		try {
			method1();
		} catch (Exception e) {
			System.out.println("����:"+e.getMessage());
		}
		System.out.println("\n===next===");

	}

}

package com.day20;

public class ThrowsTest2 {
	public static void method1() {
		method2();
		
	}
	
	public static void method2() {
		try {
			throw new Exception("���ܰ� �߻���!");
		} catch(Exception e) {
			System.out.println("����:"+e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

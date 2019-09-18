package com.day20;

public class ThrowsTest2 {
	public static void method1() {
		method2();
		
	}
	
	public static void method2() {
		try {
			throw new Exception("예외가 발생함!");
		} catch(Exception e) {
			System.out.println("예외:"+e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package com.day20;

public class ThrowsTest {
	
	public static void method1() throws Exception { //여기서 안 떠넘기면 여기서 예외처리됨
		method2();
//		try {
//			method2();
//		} catch (Exception e) {
//			System.out.println("예외:"+e.getMessage());
//		}
//		System.out.println("\n===next===");
	}
	
	public static void method2() throws Exception{
		throw new Exception("사용자 정의 예외가 발생함!!!");
	}

	public static void main(String[] args) {
		//method1();
		try {
			method1();
		} catch (Exception e) {
			System.out.println("예외:"+e.getMessage());
		}
		System.out.println("\n===next===");

	}

}

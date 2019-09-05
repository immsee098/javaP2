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
		// static메서드 호출=>클래스명.매서드()
		//=>객체가 생성되지 않아도 클래스로부터 호출할수잇음
		int result = Calculator.add(10, 20);
		System.out.println(result);
		int n = Integer.parseInt("123");
		
		// 인스턴스 ㅂ메서드 호출=>객체생성 후 참조변수.메서드()
		Calculator cal = new Calculator();
		result = cal.minus(50, 30);
		System.out.println(result);
		
	
	}

}

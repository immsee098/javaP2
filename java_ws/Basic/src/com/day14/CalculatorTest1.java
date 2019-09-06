package com.day14;

class Calculator{
	//static 메서드
	public static int add(int a, int b){
		int res = a+b;
		return res;
	}

	//instance 메서드
	public int minus(int a, int b){
		return a-b;
	}
}//class

class CalculatorTest1 {
	public static void main(String[] args) {
		//(1) add()메서드를  호출하시오.  (임의의 값 이용)
		System.out.println(Calculator.add(10, 20));
		
		

		//(2) minus() 메서드를 호출하시오.  (임의의 값 이용)
		Calculator ca = new Calculator();
		System.out.println(ca.minus(50, 10));
		
	}
}

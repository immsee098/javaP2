package com.day14;

class Calculator{
	//static �޼���
	public static int add(int a, int b){
		int res = a+b;
		return res;
	}

	//instance �޼���
	public int minus(int a, int b){
		return a-b;
	}
}//class

class CalculatorTest1 {
	public static void main(String[] args) {
		//(1) add()�޼��带  ȣ���Ͻÿ�.  (������ �� �̿�)
		System.out.println(Calculator.add(10, 20));
		
		

		//(2) minus() �޼��带 ȣ���Ͻÿ�.  (������ �� �̿�)
		Calculator ca = new Calculator();
		System.out.println(ca.minus(50, 10));
		
	}
}

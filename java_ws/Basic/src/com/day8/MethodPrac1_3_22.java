package com.day8;

public class MethodPrac1_3_22 {
	//[1]
	public static void func() {
		System.out.println("Hello java");
	}
	
	//[2]
	public static void func2(int a) {
		for(int i=0; i<a; i++) {
			System.out.println("Hello java");
		}
	}
	
	//[3]
	public static int func3() {
		int sum = 0;
		for(int i=1; i<100; i+=2) {
			sum += i;
		}
		return sum;
	}
	
	//[4]
	public static double func4(double a, double b) {
		double multi = a*b;
		return multi;
	}
	
	public static void main(String[] args) {
		func();
		System.out.println();
		func2(3);
		System.out.println();
		System.out.println("1~100���� Ȧ���� ��"+func3());
		System.out.println();
		double x = 10.0;
		double y = 2.5;
		System.out.println("10.0*2.5="+func4(x, y));
	}

}

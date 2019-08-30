package com.day9;

public class Overloading {

	public static void main(String[] args) {
		/*
		 오버로딩 매서드
		 -하나의 클래스에서 동일한 이름을 가진 메서드
		 단, 매겨변수의 개수나 자료형이 달라야 함
		 -비슷한 기능을 중복 정의할 때 사용
		 */
		int res = add(10,20);
		System.out.println("두 정수의 합  : " + res);
		System.out.println("두 실수의 합 : " + add(2.3f, 3.4f));
		System.out.println("세 실수의 합 : " + add(3.14, 5.67, 8));
		System.out.println("두 문자열 연결 : " + add("a", "b"));

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
	//error 오버로딩 메서드가 아님
	//매개변수가 달라야지 반환타입이 다른 건 오버로딩이 아님
	//매개변수가 동일하므로 에러
}

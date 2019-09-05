package com.day13;

public class StaticTest {
	int num; //인스턴스 변수
	static int num2; //static 변수
	
	public int add() { //인스턴스 매서드에서 static변수도 사용 가능
		return num+num2;
	}
	
	public static int multiply(int a, int b) {
		//int result = num1*num2; //error, static 메서드에서는 static 변수만 접근 가능
		//=> num1이 인스턴스 변수이므로 접근 불가
		return a*b;
	}

	public static void main(String[] args) {
		// static 메서드 호출
		// 같은 클래스니 메서드명만으로 호출
		
		int res = multiply(10, 5);
		System.out.println("두 수의 곱 : "+res);
		
		//인스턴스 메서드 호출
		//int result = add(); //error
		//=>main이 static이므로 static만 접근 가능
		//static에서 인스턴스 메서드에 접근하려면 객ㅊㅔ 생성 후 접근
		
		StaticTest obj = new StaticTest();
		res = obj.add();
		System.out.println("두 수의 합 : "+res);

	}

}

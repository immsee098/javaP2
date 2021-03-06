package com.day8;

public class MethodTest3_3_17 {
	public static void func() {
		System.out.println("***********");
		//매개변수는 있고, 반환값은 없는 메서드 정의
		//입력받은 개수만큼 별을 출력하는 메서드
	}
	
	public static void func2(int cnt) {
		for(int i=0; i<cnt; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	//[3] 매개변수는 없고, 반환값만 있는 메서드 정의
	//1~10까지 합을 구한 후 평균을 리턴하는 메서드
	public static double func3() {
		int sum = 0;
		for(int i =1; i<=10; i++) {
			sum +=i;
		}
		double avg = sum/10.0;
		return avg;
	}
	
	//[4] 매개변숟 있고, 반환값도 있는 매서드 정의
	//두 수의 합을 구하는 매서드
	public static int add(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public static void main(String[] args) {
		//[1]매개변수도 없고 반환값도 없는 메서드 호출
		func();
		
		//[2]매개변수는 있고 반환값은 없는 메서드 호출
		func2(5);
		
		int count = 6;
		func2(count);
		
		
		//[3] 매개변수는 없고, 반환값만 있는 매서드 호출
		double d= func3();
		System.out.println(d);
		
		//매개변수도 있고 반환값도 있는 매서드 정의
		int k = add(1,2);
		System.out.println(k);
		
		//System.out.println(":" + func()); //error ~> void일때 에러남 return이 없어서
	}

}

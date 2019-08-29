package com.day8;

public class ScopeTest {
	public static int getSum(int count) { //count=>매개변수
		int sum = 0; //지역변수
		//지역변순 매개변수는 해당 메서드가 종료되면 소멸됨
		
		for(int i =1; i<=count; i++) { //i => 지역변수(블럭변수)
			sum += i;
		} //for
		return sum;
	}
	public static void main(String[] args) {
		int count = 100; //지역변수
		int sum = getSum(count); //지역변수
		System.out.println("1~"+count+"까지의 합:"+sum);

	}

}

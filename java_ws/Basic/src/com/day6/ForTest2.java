package com.day6;

public class ForTest2 {

	public static void main(String[] args) {
		//1~3까지 합계 구하기(누적)
		
		int sum = 0; //0으로 초기화
		
		for(int i=0; i<3; i++) {
			sum+=i; // sum =sum+i
			System.out.println("i="+i+", sum="+sum);
		} //for문 안에서 출력하면 과정이 모두 출력됨
		System.out.println("1~3까지 합계:" + sum);//for문 밖에서 출력하면 하나만 출력됨
		
		
		//1~10까지 짝수의 합 구하기
		int sum2 = 0;
		
		for(int i=0; i<11; i+=2) {
			sum2 += i;
		}
		System.out.println("짝수의 합은 "+sum2);
		
		//1~10까지 홀수의 합 구하기
		int sum3 = 0;
		
		for(int i=1; i<10; i+=2) {
			sum3 += i;
		}
		System.out.println("홀수의 합은 "+sum3);
		
		//for문에서 선언한 i는 지역변수이므로 for문을 벗어나면 소멸함

	}
	
}

package com.day4;

public class ThreeOp {

	public static void main(String[] args) {
		// 삼항연산자
		/* 변수 선언 = (조건식)?값1:값2;
		 	조건식이 true이면 값1을, faㅣse이면 값2를 변수에 할당
		 	
		 	조건식 - 결과가 true, fasle가 나옴
		 			비교 연산자나 논리 연산자가 와야 함
		 			
		 	값1, 값2와 변수는 자료형이 같아야 함
		 */
		//더 큰 수 구하기
		int a =10, b=3;
		int c = (a>b)?a:b;
		System.out.println("a="+a+", b="+b);
		System.out.println("더 큰 수는"+c);
		
		//같은지 비교
		System.out.println("a와 b의 값이 같은가?" + ((a==b)? "같다":"다르다"));
		
		//성별 체크
		int g =1;
		String gender =(g==1 || g==3)?"남":"여";
		System.out.println("\n성별:"+gender);

	}

}

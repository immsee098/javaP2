package com.day4.Control;

import java.util.Scanner;

public class Iftest2 {

	public static void main(String[] args) {
		// 성별 받아서 M이면 남, F면 여 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 입력하세요");
		String gender = sc.nextLine().toUpperCase(); //방법1
		/*
		 *기본자료형에서 == (등가연산자)는 값이 같은지 비교
		  참조형에서는 주소를 비교
		  => String에서 값을 비교할 때는 equals() 매서드를 사용해야 함
		  
		  public boolean equals(Object anObject) ~> object는 스트링의 부모다 
		  	=> non static메서드이므로 호출시
		  		참조변수.메서드()
		*/
		
		boolean bool = gender.equals("M");
		System.out.println("입력값이 M과 같은가?" + bool);
		
		String result = "";
		if(gender.equals("F")) {
			result="여";
		} else if(gender.equalsIgnoreCase("M")) { //방법2
			result="남";
		} else {
			result="잘못입력";
		}
		System.out.println(gender+"=>"+result);
	}
	//참조형에서는 주소를 비교한다. 따라서 같은 M이라도 다른 공간에 들가잇으면 다르게 나옴..

}

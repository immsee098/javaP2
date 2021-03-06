package com.day4.Control;

import java.util.Scanner;

public class condition {

	public static void main(String[] args) {
		/*
		 제어문 - 프로그램의 실행 순서나 흐름을 제어할 때 사용
		 [1] 조건문
		 	if
		 	switch
		 	
		 [2] 반복문
		 	for
		 	while
		 	do-while
		*/
		/*
		if(조건식) {
			문장
		}
		조건식을 만족하면(조건식이 true이면) 문장을 실행
		만족하지 않으면(false이면) 실행하지 않고 다음으로 넘어감
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();
		
		if(n>0) {
			System.out.println("양수");
		}
		
		System.out.println("\n======= 다음 문장 =======\n");
		
		sc.close();
		
		//양수인지 음수인지 체크
		/*
		 if(조건식) {
		 	문장1
		 }else{
		 	문장2
		 }
		 => 조건식을 만족하면 문장1을 실행하고
		 	만족하지 않으면 문장2를 실행한다
		 	
		*/
		
		if(n>0) {
			System.out.println("양수!");
		}else {
			System.out.println("음수!");
		} 
		System.out.println("----next!----\n");
		
	
	
		/*
		 if(조건식1) {
		 	문장1
		 }else if(조건식2) {
		 	문장2
		 }else{
		 	문장3
		 }
		 => 조건식1을 만족하면 1 수행 2만족하면 2, 3만족시3	  
		*/
		
		//양수, 음수, 0인지 체크
	
		if(n>0) {
			System.out.println("양수!");
		}else if(n==0) {
			System.out.println("0");
		} else {
			System.out.println("음수!");
		}
		System.out.println("\n======= 다음 문장 =======\n");
		
	

		//중복 제거
	
		String result = "";
		if(n>0) {
			result="양수";
		} else if(n==0) {
			result="-";
		} else {
			result="음수";
		}
		System.out.println(result);
		
	
		//삼항연산자 이용
		String s = (n>0) ? "양수" : "음수";
		s = (n>0)?"양수": (n==0)?"0":"음수";
		System.out.println(s);
		

}
}

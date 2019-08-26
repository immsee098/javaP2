package com.day5;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		/*
		중첩 if
		- if문 안에 if문이 들어간 것
		- 바깥 if문이 참이어야 안쪽 if문이 실행됨 
		
		if(조건식1) {
			if(조건식2){
				문장1
			}
		}
		=>조건식1이 참이면 안쪽 if문을 실행
		   거짓이면 다음 문장으로 넘어감 (안쪽 if문이 실행되지 않음)
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("회원여부를 입력하세요(1.회원  2.비회원");
		int type = sc.nextInt();
		String result = "";
		
		if(type==1) {
			System.out.println("구매금액을 입력하세요");
			int price = sc.nextInt();
			if(price >= 1000000) {
				result = "외장하드";
			} else if (price >= 500000) {
				result = "스피커";
			} else if (price >= 100000) {
				result = "마우스";
			} else {
				result = "10만원 미만은 사은품이 없습니다";
			}
		} else {
			result ="비회원은 사은품 증정 불가!";
		}
		
		System.out.println(result);

	}

}

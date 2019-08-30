package com.day8;

import java.util.Scanner;

public class NumberGame_3_30 {

	public static void main(String[] args) {
		// 숫자 맞추기 게임
		//1~100사이의 랜덤값을 정답으로 지정
		//사용자가 입력한 값과 비교해서 정답인지 체크
		/*
		public static double random()
		 0.0 <= x <1.0 사이의 double 값을 리턴
		 
		 [1]
		 1~100 사이의 임의 정수 구하기
		 0.0<=x*100<100.0
		 1.0 <x*100+1<101.0
		 1<= (int)(x*100+1)<101
		 
		 [2]
		 1~10사이의 임의 정수 구하기
		 0<= (int)(x*11) <11
		 
		 [3]a~z 사이의 임의의 문자(97~122)
		 97('a') <= (int)(x*26+'a') <26+97
		 
		 [4]D~H 
		 68 <= (int)(x*5 + 'D') <5+68
		 
		 *랜덤값 구하는 방법
		 -발생시키려는 수의 개수를 각 변에 곱한다
		 -시작값을 더한다
		 -int로 형변환
		*/
		
		//1. 정답 구하기(1~100사이의 임의의 정수)
		int answer = getRandom('a', 'z');
		boolean TF = false;
		
		//2. 사용자에게 4번의 기회를 준다 => 반복문에서 처리
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			//사용자로부터 1~100사이 정수 입력 받기
			System.out.println("1~100사이의 정수를 입력하세요");
			System.out.println((char)answer);
			int num = sc.nextInt();
			
			if(num==answer) {
				System.out.println("정답입니다");
				TF = true;
				break;
			} else if(num>answer) {
				if(i<3) {
					System.out.println("너무 큽니다.조금 작은 수를 입력하세요");
					continue;
				} else {
					continue;
				}
			} else {
				if(i<3) {
					System.out.println("너무 작습니다. 더 큰 수를 입력하세요");
					continue;
				} else {
					continue;
				}
				
			}
		}
		if(TF ) {
			System.out.println("축하합니다!");
		} else {
			System.out.println("기회를 전부 소진했습니다. 정답은" + answer + "였습니다.");
		}
		
		//1~100사이의 정수 입력 받기
		
		//정답과 비교 - if
	}
	
	//public static int getRandom() {
		//return (int)(Math.random()*100+1);
	//}

	public static int getRandom(int start, int end) {
		int count = end-start+1;
		int answer = (int)(Math.random()*count+1);
		return answer;
	}
}

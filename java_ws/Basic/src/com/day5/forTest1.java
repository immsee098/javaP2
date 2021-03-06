package com.day5;

public class forTest1 {

	public static void main(String[] args) {
		//반복문 - 반복 처리할 때 사용
		/* for, while, di~while, 확장 for
		 
		 [1] for문
		 	- 반복 횟수가 정해진 경우 주로 사용
		 	
		 	for(초기식; 조건식; 증감식) {
		 		반복할 내용
		 	}
		*/
		
		for (int i=0; i<3; i++) {  //i=0,1,2 => 3번 반복
			System.out.println("Hello java");
		}
		
		for(int i=0; i<3; i++) {
			System.out.println(i);
		}
		
		for(int i=3; i>0; i--) { //i=3,2,1 => 3번 반복
			System.out.println("i="+i);
		}
		
		for(int i=0; i<4; i++) {
			System.out.println((i+1) + ". Hello java");
		}
		
		for(int i=0; i<5;i++) {
			System.out.println(i*2);
		}
		
		for(int i=1; i<7; i+=2) {
			System.out.println(i);
		}

	}

}

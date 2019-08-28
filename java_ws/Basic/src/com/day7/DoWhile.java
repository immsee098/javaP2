package com.day7;

public class DoWhile {

	public static void main(String[] args) {
		/*
		 do ~ while
		 - 선 실행, 후 조건처리
		 - 조건이 거짓이더라도 한번은 실행함
		 
		 do{
		 	반복할 내용
		 } while(조건식);
		*/
		
		int k = 0;
		do {
			System.out.println("k="+k);
			
			k++;
		} while(k>3);

		System.out.println("\n\n===============");
		k = 0;
		do {
			System.out.println(+k);
			
			k++;
		} while(k<3);
	}

}

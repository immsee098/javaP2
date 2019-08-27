package com.day6;

public class OverlapFor {

	public static void main(String[] args) {
		// 중첩 for문 - for 안에 for가 들어간 것
		/*
		 for(int i =0; i<3; i++) {
		 	for(int j=0; j<2; j++){
		 		반복할 내용
		 	}//안쪽 for
		 }//바깥 for
		 
		 =>바깥 for문의 횟수만큼 안쪽 for문이 실행됨		 
		 */
		
		for(int i=0; i<3; i++) {
			System.out.println("=========== i="+i);
			
			for(int j=0; j<2; j++) {
				System.out.println("j="+j);
			}//안쪽 for
			System.out.println();
		}//바깥 for
		
		for(int dan=2; dan<10; dan++) { 
			for(int j=1; j<10; j++) { 
				System.out.println(dan + " * " + j + " = " + dan*j ); 
				} 
			System.out.println(); 
			}

	}

}

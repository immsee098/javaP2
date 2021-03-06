package com.day7;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		/*
		 #while문
		 - 횟수가 가변적일 때 주로 사용
		 
		 while(조건식) {
		 	반복할 내용
		 }
		 => 조건식이 참인동안 반복할 내용을 반복 처리
		 	거짓이 되면 while문을 빠져나온다
		 */
		
		String str = "\n\n가나다 하나 둘 \n\n라\n\n";
		Scanner sc = new Scanner(str);
		//returns true if this scanner has another token is input
		while(sc.hasNext()) {
			String s = sc.nextLine();
			/*
			 \n
			 \n
			 나나다 하아 들식
			 */
			System.out.println("출력 :" + s);
		}//while
		
		String s2 = sc.nextLine();
		System.out.println("while 탈출 후 1 :"+s2); //error
		
		//s2 = sc.nextLine();
		//System.out.println("while 탈출 후 2 :"+s2); //error
		
		//next이용
		System.out.println("n==========next()이용======================");
		Scanner sc2 =new Scanner(str);
		while(sc2.hasNext()) {
			String s = sc2.next(); //단어 단위 공백기준으로 가져옴
			System.out.println("출력"+s);
			/*
			 출력가나다
			출력하나
			출력둘
			출력라
			 */
		}
		
		s2=sc2.nextLine();
		System.out.println("while 탈출 후 1 "+s2);
		
		s2=sc2.nextLine();
		System.out.println("while 탈출 후 2 "+s2);
		
		//s2=sc2.nextLine();
		//System.out.println("while 탈출 후 3 "+s2);
		
		System.out.println("\n\n=========nextInt()============");
		str = "\n\n123 80 77 \n\n50\n\n";
		Scanner sc3 = new Scanner(str);
		
		while(sc3.hasNext()) {
			int n = sc3.nextInt();
			System.out.println("출력 : "+n);
		}
		
		s2 = sc3.nextLine();
		System.out.println("while탈출 후 1: "+s2);
		
		s2 = sc3.nextLine();
		System.out.println("while탈출 후 2: "+s2);
	}

}

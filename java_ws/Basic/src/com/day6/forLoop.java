package com.day6;

import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) {
		/*
		 무한루프
		 - 반드시 break문을 이용해서 반복문을 탈출해야 함
		 
		 for(;;) {
		 	반복처리
		 	
		 	if(조건식) break;
		 }
		 
		 **break문을 사용할 수 있는 구문
		 *[1] switch문
		 *[2] 반복문
		 */
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println("게임 중!!");
			
			System.out.println("계속하시겠습니까?(Y/N)");
			
			String quit = sc.nextLine();
			
			if(quit.equalsIgnoreCase("Y")) {
				break;
			}
		}
		
		
		for(;;) {
			int qq = sc.nextInt();
			for(int i=9; i>0; i--) {
				System.out.println(qq +"*"+ i + "="+qq*i);
			}
			sc.nextLine();//엔터를 먹기 때문에 엔터용 라인을 하나 넣어둬야함
			
			String quit = sc.nextLine();
		}

	}

}

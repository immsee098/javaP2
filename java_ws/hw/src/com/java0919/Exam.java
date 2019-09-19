package com.java0919;

import java.util.Scanner;

class  Exam{
	public static void main(String[] args) 	{
		//1) arr 배열 선언	
		int[] arr = new int[10];
		

		int count=arr.length;  //실제 데이터 개수

		//2) 2의 배수로 초기화 - for문 이용
		for(int i=1; i<11; i++) {
			arr[i-1] = i*2;
		}


		//삭제 전 배열 요소 출력
		for(int n : arr){
			System.out.println(n);
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("\n삭제하려는 인덱스를 입력하세요");
		int delIdx=sc.nextInt();
		
		//3) 삭제 처리
		for(int i=delIdx; i<count-1; i++) {
			arr[i] = arr[i+1];
		}
		count = count-1;
		
		
		//4) 삭제 후 배열 요소 출력
		
		for(int n: arr) {
			System.out.println(n);
		}
	}
}
		
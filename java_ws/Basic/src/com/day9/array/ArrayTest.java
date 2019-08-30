package com.day9.array;

public class ArrayTest {

	public static void main(String[] args) {
		/*
		 배열 - 동일한 타입의 데이터 여러개를 저장하기 위한 저장소
		 cf. 변수 - 데이터 하나를 저장하기 위한 저장소
		 	-index를 이용해 배열요소에 접근
		 	-여러개의 변수 선언에 편의를 제공
		 	-반복문을 이용해서 동일한 코드 패턴을 적용할 수 있다
		 	-배열은 참조형, 배열이름에 참조값(주소값)이 들어감
		 */

		//[1]
		//배열 선언
		int[] arr;
		
		//메모리 할당
		arr=new int[3]; //heap 3개의 정수를 저장할 공간이 할당됨
		
		//초기화
		//index는 0부터 시작
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		//[2] 배열 선언과 메모리 할당을 동시에
		int[] arr2 = new int[4];
		
		//[3] 배열 선언, 메모리 할당, 초기화를 모두 동시에
		int[] arr3 = {100, 200, 300, 400};
		
		int[] arr4 = new int[] {88, 9, 4, 5,6};
		//int[] arr5 = new int[3] {6,9,7}; //error
		
		//
		int[] arr6;
		arr6 = new int[] {77,99,55,66,44,23};
		
		//int[] arr7;
		//arr7 = {10, 50, 73}; //error
		
		//배열 요소 출력
		for(int i =0; i<3; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i =0; i<arr2.length; i++) {
			System.out.println("arr2의 배열 요소 : " +arr2[i]);
		}
		
		for(int i =0; i<arr3.length; i++) {
			System.out.println(arr3[i]+"\t");
		}
		
		System.out.println("\n\narr 배열 요소의 개수:"+arr.length);
		System.out.println("arr배열의 주소:"+arr);
	}

}

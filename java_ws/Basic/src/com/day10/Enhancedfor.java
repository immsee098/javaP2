package com.day10;

public class Enhancedfor {

	public static void main(String[] args) {
		// enhanced for, for each문
		// 배열이나 컬렉션을 순회허며 반복처리
		// 배열의 컬렉션의 개수만큼 반복
		
		/*
		 for(자료형 변수: 배열이나 컬렉션) {
		 	반복할 내용
		 }
		 */
		
		int[] num= {12, 43, 64, 56, 32};
		for (int n : num) { System.out.println(n); } 
		
		String[] hobby= {"movie", "reading", "sports"};
		for (String s : hobby) { System.out.println(s); }


	}

}

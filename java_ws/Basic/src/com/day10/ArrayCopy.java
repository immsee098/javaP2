package com.day10;

import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		//배열의 변수 복사 - 배열변수 자체만 복사됨
		//배열의 인스턴스는 복사되지 않음
		//=>배열은 참조명이므로 배열명애눈 주소가 들어가고,
		//배열주소를 복사하면 같은 메모리 영역을 가지게됨(같은 주소가 되어서)
		
		int[] arr = new int[4];
		int[] num = arr; //num도 arr와 동일한 주소
		//같은 메모리 여역 가리케됨
		
		arr[0]++;
		System.out.println("arr[0]=" + arr[0]); //1
		System.out.println("num0[0]=" + num[0]); //1
		
		int[] arr2 = {15,90,78};
		int[] copy =arr2;
		arr2[1]++;
		
		System.out.println("\n\n====arr2배열의 요소===");
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]+"\t");
		}
			
			
			System.out.println("\n\n====copy배열의 요소===");
			
			for(int i=0; i<copy.length; i++) {
				System.out.println(copy[i]+"\t");
			}
	}

}

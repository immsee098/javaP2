package com.day6;

import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {
		// 사용자로부터 반복횟수 입력받아 그 수만큼 hello java 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("반복 횟수를 입력하세요");
		int count = sc.nextInt();
		
		for (int i=0; i<(count+1); i++) {
			System.out.println(i+" Hello Java");
		}

	}

}

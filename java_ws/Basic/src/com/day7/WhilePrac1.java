package com.day7;

import java.util.Scanner;

public class WhilePrac1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("두 개의 정수를 입력하세요(피제수 제수 순으로 입력)");
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0 && b==0) {
				break;
			} else if (a == 0 || b == 0) {
				sc.nextLine();
				continue;
			} else {
				int share = a/b;
				int left = a%b;
				System.out.println("몫 : "+share + ", 나머지:"+left);
				System.out.println();
				sc.nextLine();
			}
		}

	}

}

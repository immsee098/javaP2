package com.day22;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		String file = "test.txt";
		int f = file.lastIndexOf(".");
		String s1 = file.substring(0,f);
		String s2 = file.substring(f+1);
		System.out.println("파일명:"+s1+", 확장자:"+s2);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주소입력");
		String input = sc.nextLine();
		String n = "http://www.mall.com";
		
		if(input.indexOf(n) == -1) {
			System.out.println("Url주소가 적합하지 않음");
		} else {
			System.out.println("해당 Url주소:"+input);
		}

	}

}

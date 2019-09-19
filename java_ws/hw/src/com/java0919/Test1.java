package com.java0919;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("주민번호 입력");
			String num = sc.nextLine();
			
			if(num.length()!=14) {
				throw new Exception("주민번호는 14자리로");
			}
			System.out.println("주민번호 :"+num);
		} catch(Exception e) {
			System.out.println("예외 발생:"+e.getMessage());
		}
		

	}

}

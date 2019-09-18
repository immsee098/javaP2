package com.day20;

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("주민번호를 입력하세요");
			String num = sc.nextLine();
			
			if(num.length()!=13) {
				throw new Exception("주민번호는 13자리");
			}
			
			System.out.println("주민번호: "+num);
		} catch(Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}

	}

}

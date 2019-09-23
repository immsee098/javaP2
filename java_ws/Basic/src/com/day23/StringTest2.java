package com.day23;

public class StringTest2 {

	public static void main(String[] args) {
		// String-문자열이 동일한 경우에는 하나의 String 인스턴스만 생성해서 공유한다
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "java";
		
		if(str1==str2) {
			System.out.println("str1과 str2의 주소는 동일하다");
		} else {
			System.out.println("str1과 str2의 주소는 다르다");
		}
		
		if(str1==str3) {
			System.out.println("str1과 str2의 주소는 동일하다");
		} else {
			System.out.println("str1과 str2의 주소는 다르다");
		}
		
		String str4 = new String("Hello");
		String str5 = new String("Hello");
		
		if(str4==str5) {
			System.out.println("str1과 str2의 주소는 동일하다");
		} else {
			System.out.println("str1과 str2의 주소는 다르다");
		}

	}

}

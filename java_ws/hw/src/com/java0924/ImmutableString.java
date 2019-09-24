package com.java0924;

class ImmutableString{
	public static void main(String[] args){
		String str1="Hello";
		String str2="Hello";		
		
		if(str1==str2)  
			System.out.println("str1, str2는 동일 인스턴스 참조");
		else
			System.out.println("str1, str2는 다른 인스턴스 참조");		
		
		String str4 = new String("Hello");
		String str5 = new String("Hello");

		if(str4==str5)
			System.out.println("str4, str5는 동일 인스턴스 참조");
		else
			System.out.println("str4, str5는 다른 인스턴스 참조");			
	}
}
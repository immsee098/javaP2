package com.java0924;

class ImmutableString{
	public static void main(String[] args){
		String str1="Hello";
		String str2="Hello";		
		
		if(str1==str2)  
			System.out.println("str1, str2�� ���� �ν��Ͻ� ����");
		else
			System.out.println("str1, str2�� �ٸ� �ν��Ͻ� ����");		
		
		String str4 = new String("Hello");
		String str5 = new String("Hello");

		if(str4==str5)
			System.out.println("str4, str5�� ���� �ν��Ͻ� ����");
		else
			System.out.println("str4, str5�� �ٸ� �ν��Ͻ� ����");			
	}
}
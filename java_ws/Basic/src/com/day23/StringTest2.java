package com.day23;

public class StringTest2 {

	public static void main(String[] args) {
		// String-���ڿ��� ������ ��쿡�� �ϳ��� String �ν��Ͻ��� �����ؼ� �����Ѵ�
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "java";
		
		if(str1==str2) {
			System.out.println("str1�� str2�� �ּҴ� �����ϴ�");
		} else {
			System.out.println("str1�� str2�� �ּҴ� �ٸ���");
		}
		
		if(str1==str3) {
			System.out.println("str1�� str2�� �ּҴ� �����ϴ�");
		} else {
			System.out.println("str1�� str2�� �ּҴ� �ٸ���");
		}
		
		String str4 = new String("Hello");
		String str5 = new String("Hello");
		
		if(str4==str5) {
			System.out.println("str1�� str2�� �ּҴ� �����ϴ�");
		} else {
			System.out.println("str1�� str2�� �ּҴ� �ٸ���");
		}

	}

}

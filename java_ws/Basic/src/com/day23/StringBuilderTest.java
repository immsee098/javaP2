package com.day23;

public class StringBuilderTest {

	public static void main(String[] args) {
		// StringBuilder, StringBuffer
		//문자열 변경이 가능한 클래스
		
		
		//String - 문자열 변경이 불가능, 값을 변경하면 새로운 인스턴스가 생김
		StringBuilder sb = new StringBuilder();
		sb.append("java");
		sb.append("Hello");
		
		System.out.println("sb="+sb);
		
		StringBuilder sb2 = new StringBuilder("hi!");
		sb2.append("oracle");
		
		System.out.println("sb2="+sb2);
		
		StringBuilder sb3 = new StringBuilder();
		sb3.append("안녕!").append("jsp!").append("Spring");
		
		System.out.println("sb3="+sb3);
		StringBuilder sb4 = sb3.append("test");
		System.out.println("sb3="+sb3);
		System.out.println("sb4="+sb4);
		System.out.println(System.identityHashCode(sb3));
		System.out.println(System.identityHashCode(sb4));
		

	}

}

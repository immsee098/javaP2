package com.day23;

public class StringTest {

	public static void main(String[] args) {
		String str="ABCDEFG"; 
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);
		
		
		String str2="990107-1112222"; 
		
		StringBuilder sb2 = new StringBuilder(str2);
		int a = str2.lastIndexOf("-");
		sb2.deleteCharAt(6);
		System.out.println(sb2);
	}

}

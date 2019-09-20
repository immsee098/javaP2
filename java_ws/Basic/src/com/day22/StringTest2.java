package com.day22;

public class StringTest2 {

	public static void main(String[] args) {
		String str = "123456789";
		String s = str.replace('7', 'Ä¥');
		
		System.out.println("str");
		System.out.println("7À» Ä¥·Î Ä¡È¯:"+s);
	
		str="java,oracle,html,css";
		String[] arr = str.split(",");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("\n==============");
		str="jsp.spring.mybatis.android";
		String[] sarr = str.split("\\.", 2);
		for(String ss : sarr) {
			System.out.println(ss);
		}

	}

}

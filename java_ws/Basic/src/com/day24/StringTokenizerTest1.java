package com.day24;

import java.util.StringTokenizer;

public class StringTokenizerTest1 {

	public static void main(String[] args) {
		// StringTokenizer - 구분자를 기준으로 여러개의 토큰으로 분리
		//-split과 유사
		
		String str = "100, 200, 300, 400";
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println("===split===");
		String[] arr = str.split(",");
		for(String s: arr) {
			System.out.println(s);
		}
		
		
		System.out.println("=============");
		//StringTokenizer - 단 한 문자의 구분자만 사용
		str = "100*(200+300)/2";
		StringTokenizer st2 = new StringTokenizer(str, "+-*/=()");
		//str2.split("+-*/=()")하면 에러남
		while(st2.hasMoreTokens()) {
			String token = st2.nextToken();
			System.out.println(token);
		}
		
		System.out.println("=======");

	}

}

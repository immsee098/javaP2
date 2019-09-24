package com.day24;

import java.util.StringTokenizer;

public class StringTokenizerTest2 {

	public static void main(String[] args) {
		// 무자열에 포함되 ㄴ데이터가 두가지 종류의 구분자로 나뉘어져 있을 때 두 개의 st와 이중반복문으로 처라
		String source = "1, 김천재, 100,100,100|2, 박수재, 95,80,90|3, 이자바,80,90,90";
		
		StringTokenizer st = new StringTokenizer(source, "|");
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			System.out.println(str);
		}
			
			StringTokenizer st2 = new StringTokenizer(source, ",");
			while(st2.hasMoreTokens()) {
				String str1 = st2.nextToken();
				System.out.println(str1);
			}
			
		String arr[] = source.split("\\|");
		for(String n:arr) {
			System.out.println(n);
		}
		
		
		
	}

}

package com.day24;

import java.util.StringTokenizer;

public class StringTokenizerTest3 {

	public static void main(String[] args) {
		// split()은 빈 문자열도 토큰으로 인식하는 반면 StringTokenizer은 빈문자열을 토큰으로 인식x
		//다라서 ㄷㅏ를 썼을 때 토큰 개수가 다르게 나온다
		
		String source = "100,,,,200,300,400";
		
		StringTokenizer st = new StringTokenizer(source,",");
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			System.out.println(str);//4개
		}
		
		System.out.println("=========");
		String arr[] = source.split(",");
		for(String n:arr) {
			System.out.println(n+"|"); //토큰개수가 6개
		}

	}

}

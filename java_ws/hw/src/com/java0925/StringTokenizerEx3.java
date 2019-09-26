package com.java0925;

import java.util.*; 

class StringTokenizerEx3 { 
	public static void main(String args[]) { 
		
		Object obj = new Object();
		System.out.println(obj.toString());
		
		String source = "1,김길재,70,100,88|2,박길동,95,80,90|3,이길수,80,90,90";

		//(1) 두 개의 StringTokenizer 와 이중 반복문을 사용해서 처리한 후 출력
		StringTokenizer st = new StringTokenizer(source, "|");
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			System.out.println(str);
		}


		//(2) split() 메서드를 이용하여 동일 결과가 나오도록 할 것
		String arr[] = source.split("\\|");
		for(String n:arr) {
			System.out.println(n);
		}

	
	} // main
}


package com.javatest1;

import java.util.*; 

class StringTokenizerTest1 { 
      public static void main(String[] args) { 
		String source = "100,200,300,400";
		
		//(1) StringTokenizer를 이용하여 ,를 구분자로 분리하여 출력
		StringTokenizer st = new StringTokenizer(source, ",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
 
		//(2) split() 메서드를 이용하여 동일 결과가 나오도록 할 것
		String[] arr = source.split(",");
		for(String n:arr) {
			System.out.println(n);
		}

       } 
}

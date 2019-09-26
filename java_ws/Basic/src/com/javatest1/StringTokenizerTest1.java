package com.javatest1;

import java.util.*; 

class StringTokenizerTest1 { 
      public static void main(String[] args) { 
		String source = "100,200,300,400";
		
		//(1) StringTokenizer�� �̿��Ͽ� ,�� �����ڷ� �и��Ͽ� ���
		StringTokenizer st = new StringTokenizer(source, ",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
 
		//(2) split() �޼��带 �̿��Ͽ� ���� ����� �������� �� ��
		String[] arr = source.split(",");
		for(String n:arr) {
			System.out.println(n);
		}

       } 
}

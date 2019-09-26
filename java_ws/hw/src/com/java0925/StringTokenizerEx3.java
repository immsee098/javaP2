package com.java0925;

import java.util.*; 

class StringTokenizerEx3 { 
	public static void main(String args[]) { 
		
		Object obj = new Object();
		System.out.println(obj.toString());
		
		String source = "1,�����,70,100,88|2,�ڱ浿,95,80,90|3,�̱��,80,90,90";

		//(1) �� ���� StringTokenizer �� ���� �ݺ����� ����ؼ� ó���� �� ���
		StringTokenizer st = new StringTokenizer(source, "|");
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			System.out.println(str);
		}


		//(2) split() �޼��带 �̿��Ͽ� ���� ����� �������� �� ��
		String arr[] = source.split("\\|");
		for(String n:arr) {
			System.out.println(n);
		}

	
	} // main
}


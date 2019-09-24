package com.day24;

import java.util.StringTokenizer;

public class StringTokenizerTest1 {

	public static void main(String[] args) {
		// StringTokenizer - �����ڸ� �������� �������� ��ū���� �и�
		//-split�� ����
		
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
		//StringTokenizer - �� �� ������ �����ڸ� ���
		str = "100*(200+300)/2";
		StringTokenizer st2 = new StringTokenizer(str, "+-*/=()");
		//str2.split("+-*/=()")�ϸ� ������
		while(st2.hasMoreTokens()) {
			String token = st2.nextToken();
			System.out.println(token);
		}
		
		System.out.println("=======");

	}

}

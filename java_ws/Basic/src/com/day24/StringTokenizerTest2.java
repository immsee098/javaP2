package com.day24;

import java.util.StringTokenizer;

public class StringTokenizerTest2 {

	public static void main(String[] args) {
		// ���ڿ��� ���Ե� �������Ͱ� �ΰ��� ������ �����ڷ� �������� ���� �� �� ���� st�� ���߹ݺ������� ó��
		String source = "1, ��õ��, 100,100,100|2, �ڼ���, 95,80,90|3, ���ڹ�,80,90,90";
		
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

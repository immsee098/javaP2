package com.day24;

import java.util.StringTokenizer;

public class StringTokenizerTest3 {

	public static void main(String[] args) {
		// split()�� �� ���ڿ��� ��ū���� �ν��ϴ� �ݸ� StringTokenizer�� ���ڿ��� ��ū���� �ν�x
		//�ٶ� ������ ���� �� ��ū ������ �ٸ��� ���´�
		
		String source = "100,,,,200,300,400";
		
		StringTokenizer st = new StringTokenizer(source,",");
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			System.out.println(str);//4��
		}
		
		System.out.println("=========");
		String arr[] = source.split(",");
		for(String n:arr) {
			System.out.println(n+"|"); //��ū������ 6��
		}

	}

}

package com.day23;

public class StringBuilderTest2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("AB");
		sb.append(25);
		sb.append('Y').append(true);
		
		System.out.println("sb="+sb);
		
		//public StringBuilder insert(int offset, boolean b)
		sb.insert(2, false);
		System.out.println("insert �� sb="+sb);
		
		sb.insert(sb.length(), "ZZ");//������ ��ġ�� ZZ�ֱ�
		System.out.println("���� sb="+sb);

	}

}

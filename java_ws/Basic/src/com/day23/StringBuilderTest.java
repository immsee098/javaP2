package com.day23;

public class StringBuilderTest {

	public static void main(String[] args) {
		// StringBuilder, StringBuffer
		//���ڿ� ������ ������ Ŭ����
		
		
		//String - ���ڿ� ������ �Ұ���, ���� �����ϸ� ���ο� �ν��Ͻ��� ����
		StringBuilder sb = new StringBuilder();
		sb.append("java");
		sb.append("Hello");
		
		System.out.println("sb="+sb);
		
		StringBuilder sb2 = new StringBuilder("hi!");
		sb2.append("oracle");
		
		System.out.println("sb2="+sb2);
		
		StringBuilder sb3 = new StringBuilder();
		sb3.append("�ȳ�!").append("jsp!").append("Spring");
		
		System.out.println("sb3="+sb3);
		StringBuilder sb4 = sb3.append("test");
		System.out.println("sb3="+sb3);
		System.out.println("sb4="+sb4);
		System.out.println(System.identityHashCode(sb3));
		System.out.println(System.identityHashCode(sb4));
		

	}

}

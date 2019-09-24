package com.day24;

public class HashCode {

	public static void main(String[] args) {
		// String Ŭ������ ���ڿ��� ������ ������.
		//������ �ؽ��ڵ带 ��ȯ�ϵ��� hashCode �޼��带 �������̵���
		
		String s = new String("hello");
		String s2 = new String("hello");
		
		System.out.println("s�� �ؽ��ڵ尪:" + s.hashCode());
		System.out.println("s2�� �ؽ��ڵ尪:" + s2.hashCode()); //���ڿ��� �����Ƿ� ������ �ؚ����
		
		System.out.println("s���ּ�:" + System.identityHashCode(s));
		System.out.println("s2���ּ�:" + System.identityHashCode(s2));
		
		//System.identityHashCode()
		//->���� �ؽ��ڵ尪-��簴ü�� �ٸ��� ���� //�ٸ� ��¥����
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		
		System.out.println("s3�� �ؽ��ڵ尪:" + s.hashCode());
		System.out.println("s23�� �ؽ��ڵ尪:" + s2.hashCode()); //���ڿ��� �����Ƿ� ������ �ؚ����
		
		System.out.println("3���ּ�:" + System.identityHashCode(s));
		System.out.println("22���ּ�:" + System.identityHashCode(s2));
		
		
		Integer n1=10, n2=20;
		
		System.out.println("n3�� �ؽ��ڵ尪:" + n1.hashCode());
		System.out.println("n4�� �ؽ��ڵ尪:" + n2.hashCode());
		
		System.out.println("n33���ּ�:" + System.identityHashCode(s));
		System.out.println("n4���ּ�:" + System.identityHashCode(s2));
	}

}

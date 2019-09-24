package com.day24;

public class HashCode {

	public static void main(String[] args) {
		// String 클래스는 문자열의 내용이 같으면.
		//동일한 해시코드를 반환하도록 hashCode 메서드를 오버라이딩함
		
		String s = new String("hello");
		String s2 = new String("hello");
		
		System.out.println("s의 해시코드값:" + s.hashCode());
		System.out.println("s2의 해시코드값:" + s2.hashCode()); //문자열이 같으므로 동일한 해싴토드
		
		System.out.println("s의주소:" + System.identityHashCode(s));
		System.out.println("s2의주소:" + System.identityHashCode(s2));
		
		//System.identityHashCode()
		//->실제 해시코드값-모든객체가 다르게 가짐 //먜만 진짜가됨
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		
		System.out.println("s3의 해시코드값:" + s.hashCode());
		System.out.println("s23의 해시코드값:" + s2.hashCode()); //문자열이 같으므로 동일한 해싴토드
		
		System.out.println("3의주소:" + System.identityHashCode(s));
		System.out.println("22의주소:" + System.identityHashCode(s2));
		
		
		Integer n1=10, n2=20;
		
		System.out.println("n3의 해시코드값:" + n1.hashCode());
		System.out.println("n4의 해시코드값:" + n2.hashCode());
		
		System.out.println("n33의주소:" + System.identityHashCode(s));
		System.out.println("n4의주소:" + System.identityHashCode(s2));
	}

}

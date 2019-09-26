package com.java0925;

class Exam {
	public static void main(String[] args) {
		String str1=new String("abc");
		String str2=new String("abc");

		String str3="abc";
		String str4="abc";
		
		System.out.println(str1.hashCode());  //(1)
		System.out.println(str2.hashCode());  //(2)
		System.out.println(str3.hashCode());  //(3)
		System.out.println(str4.hashCode());  //(4)

		System.out.println(System.identityHashCode(str1)); //(5)
		System.out.println(System.identityHashCode(str2)); //(6) 
		System.out.println(System.identityHashCode(str3)); //(7) 
		System.out.println(System.identityHashCode(str4)); //(8) 
	}
}
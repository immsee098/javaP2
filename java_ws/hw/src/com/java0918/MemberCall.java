package com.java0918;

//class MemberCall {
//	int iv = 10;
//	static int cv = 20;
//	int iv2 = cv;
//	static int cv2 = iv; // ���� A 
//
//	static void staticMethod1() {
//		System.out.println(cv);
//		System.out.println(iv); // ���� B 
//	}
//	void instanceMethod1() {
//		System.out.println(cv);
//		System.out.println(iv); // ���� C
//	}
//	static void staticMethod2() {
//		staticMethod1();
//		instanceMethod1(); // ���� D 
//	}
//	void instanceMethod2() {
//		staticMethod1(); // ���� E
//		instanceMethod1();
//	}
//	long add(int a, int b) { return a+b;}
//	long add(int x, int y) { return x+y;}
//	long add(long a, long b) { return a+b;}
//	int add(byte a, byte b) { return a+b;}
//	int add(long a, int b) { return (int)(a+b);}
//}
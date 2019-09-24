package com.day24;

public class AnonymousTest {
	Object obj = new Object() {
		public void nethod() {}
	};
	
	static Object obj2 = new Object() {
		public void method() {}
	};
	
	public void func() {
		Object obj3 = new Object() {
			public void method() {}
		};
	}


	public static void main(String[] args) {
	
	}

}

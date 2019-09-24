package com.day24;

public class InnerTest1 {
	// 내부 클래스 - 클래스 내에 선언된 클래스
	// [1] 인스턴스 클래스
	class InstanceInner {
		int iv;
		//static int sv;// error
		// =>내부 클래스 중 static 클래스만 static 멤버를 가질 수 있다
		static final int CONST1 = 100; // static final은 가능 상수라

	}

	// [2] static 클래스
	static class StaticInner {
		int iv;
		static int sv;
		static final double PI = 3.141592;
	}

	public void showInfo() {
		// [3] 지역 클래스
		class LocalInner {
			int iv;
			static final int CONST = 3000;

		}
	}

	public static void main(String[] args) {
		System.out.println("sv=" + StaticInner.sv);
		System.out.println("PI=" + StaticInner.PI);

	}

}

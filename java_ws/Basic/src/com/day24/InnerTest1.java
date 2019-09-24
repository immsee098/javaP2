package com.day24;

public class InnerTest1 {
	// ���� Ŭ���� - Ŭ���� ���� ����� Ŭ����
	// [1] �ν��Ͻ� Ŭ����
	class InstanceInner {
		int iv;
		//static int sv;// error
		// =>���� Ŭ���� �� static Ŭ������ static ����� ���� �� �ִ�
		static final int CONST1 = 100; // static final�� ���� �����

	}

	// [2] static Ŭ����
	static class StaticInner {
		int iv;
		static int sv;
		static final double PI = 3.141592;
	}

	public void showInfo() {
		// [3] ���� Ŭ����
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

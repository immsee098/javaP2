package com.day24;

class Outer2{
	class InstanceInner{
		int iv=10;
		final static double PI = 3.141592;
		
	}
	
	static class StaticInner{
		int iv=20;
		static int sv=30;
		final static int CONST=100;
	}
	
	public void method() {
		class LocalInner{
			int lv=100;
			static final int L_CONST=500;
		}
	}
}

public class InnerTest3 {

	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		Outer2.InstanceInner iiner = outer.new InstanceInner();
		System.out.println(iiner.iv);
		System.out.println(Outer2.InstanceInner.PI);
		
		//static 클래스의 static 멤버 접근
		System.out.println(Outer2.StaticInner.CONST);
		System.out.println(Outer2.StaticInner.sv);
		
		//static클래스의 인스턴스 멤버접근
		Outer2.StaticInner sinner = new Outer2.StaticInner();
		System.out.println(sinner.iv);

	}

}

package com.java0925;

class Outer {
	class InstanceInner {
		int iv=100;
	}
	static class StaticInner {
		int iv=200;
		static int cv=300;
	}
}
class Exam5 {
	public static void main(String args[]) {
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();  //(1) 
		System.out.println("ii.iv : "+ ii.iv);
		
		Outer.StaticInner si = new Outer.StaticInner();  //(2)
		System.out.println("si.iv : "+ si.iv);

		System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);  //(3)
	}
}
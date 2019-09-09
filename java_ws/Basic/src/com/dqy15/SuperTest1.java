package com.dqy15;

class Parent {	
	protected int x =10;
}

class Child extends Parent {
	public void showInfo() {
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}

class Child2 extends Parent {
	private int x =30;
	public void showInfo() {
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}

public class SuperTest1 {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.showInfo();
		
		Child2 ch2 = new Child2();
		ch2.showInfo();

	}

}

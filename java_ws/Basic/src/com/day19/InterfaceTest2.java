package com.day19;

interface III{
	public abstract void method();
}

class AAA {
	public void methodA(III i) {
		i.method();
	}
}

class BBB implements III{
	public void method() {
		System.out.println("BBB의 매서드");
	}
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		AAA obj = new AAA();
		

	}

}

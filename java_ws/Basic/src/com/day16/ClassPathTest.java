package com.day16;

class AAA{
	public void showInfo() {
		System.out.println("AAA�޼���");
	}
}

class BBB{
	public void showInfo() {
		System.out.println("BBB�޼���");
	}
}

public class ClassPathTest {

	public static void main(String[] args) {
		System.out.println("class path����");
		
		AAA obj = new AAA();
		obj.showInfo();
		
		
		BBB b = new BBB();
		b.showInfo();

	}

}

package com.day14;

class GrandFather{
	GrandFather(){
		System.out.println("������ ȣ�� - GrandFather!");
	}
	
	public void showGrand() {
		System.out.println("Grandfather �޼���");
	}
}

class Father extends GrandFather{
	Father(){
		System.out.println("������ ȣ�� - Father!");
	}
	
	public void showFather() {
		System.out.println("Father �޼���");
	}
}

class Child4 extends Father {
	Child4(){
		System.out.println("������ ȣ��-child");
	}
	
	public void showChild() {
		System.out.println("Child �޼���");
	}
}

public class Inheritence3 {

	public static void main(String[] args) {
		Child4 ch = new Child4();
		ch.showChild();
		ch.showFather();
		ch.showGrand();

	}

}

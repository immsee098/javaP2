package com.day14;

class GrandFather{
	GrandFather(){
		System.out.println("생성자 호출 - GrandFather!");
	}
	
	public void showGrand() {
		System.out.println("Grandfather 메서드");
	}
}

class Father extends GrandFather{
	Father(){
		System.out.println("생성자 호출 - Father!");
	}
	
	public void showFather() {
		System.out.println("Father 메서드");
	}
}

class Child4 extends Father {
	Child4(){
		System.out.println("생성자 호출-child");
	}
	
	public void showChild() {
		System.out.println("Child 메서드");
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

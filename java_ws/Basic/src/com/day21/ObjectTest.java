package com.day21;

class Person{
	public void display() {
		System.out.println("this="+this);
	}
}

public class ObjectTest {

	public static void main(String[] args) {
		Person p = new Person();
		
		System.out.println("p객체를 표현하는 문자열:"+p.toString());
		System.out.println("p="+p);
		System.out.println(p);
		
		p.display();
		
		
		//toString ~> 객체의 클래스이름을 16진수로 표현 ~>Object거라 ㄱㅊ
	}

}

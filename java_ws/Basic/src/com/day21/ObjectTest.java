package com.day21;

class Person{
	public void display() {
		System.out.println("this="+this);
	}
}

public class ObjectTest {

	public static void main(String[] args) {
		Person p = new Person();
		
		System.out.println("p��ü�� ǥ���ϴ� ���ڿ�:"+p.toString());
		System.out.println("p="+p);
		System.out.println(p);
		
		p.display();
		
		
		//toString ~> ��ü�� Ŭ�����̸��� 16������ ǥ�� ~>Object�Ŷ� ����
	}

}

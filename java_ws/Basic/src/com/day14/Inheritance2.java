package com.day14;



class Parent2 {
	protected String name;
	protected int age;
	
}//class


class Son extends Parent2 {
	Son() {
		name="�Ƶ�"; //�θ����� �ڱ��ó�� ��밡��
		age=30;
	}
	public void showInfo() {
		System.out.println("�̸�:" + name);
		System.out.println("����:" + age);
	}
}

class Daughter extends Parent2{
	Daughter() {
		name="��";
		age = 25;
	}
	
	public void showInfo() {
		System.out.println("�̸�:" + name);
		System.out.println("����:" + age);
	}
	
}//class

class GrandChild extends Son {
	GrandChild() {
		name="����";	
		age=2;
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		Son ch = new Son();
		ch.showInfo();
		
		Daughter ch2 = new Daughter();
		ch2.showInfo();
		
		GrandChild gc = new GrandChild();
		gc.showInfo();
	}

}

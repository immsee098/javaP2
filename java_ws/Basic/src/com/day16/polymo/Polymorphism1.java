package com.day16.polymo;

class Parent {
	public void showInfo() {
		System.out.println("Parent�� ShowInfo()�޼���");
	}
	
	public void parentFunc() {
		System.out.println("Parent-func()");
	}
}

class Child extends Parent{
	public void showInfo() {
		System.out.println("Child�� showInfo()-overriding");
	}
	
	public void childFunc() {
		System.out.println("Child �ڽĸ��� �޼���");
	}
}

public class Polymorphism1 {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.showInfo();
		p.parentFunc();
		
		Child ch = new Child();
		ch.showInfo();
		ch.parentFunc();
		ch.childFunc();
		
		//������ - �θ��� ���������� �ڽ��� �ν��Ͻ��� �����ϵ��� �����ν� �������� ������ �� �ִ�.
		//�θ��� ���������δ� �θ��� ����� ���� ����
		//��, �ڽ��� �������̵� �޼��尡 �ִٸ� �θ��� ���������� �ڽ��� �������̵� �޼��� ȣ��
		Parent p2 = new Child(); //�θ� �ڽ� �ν��Ͻ� ����
		p2.showInfo(); //�ڽ��� �������̵� �޼��� ȣ��
		p2.parentFunc(); // �θ��� ��� ���� ����
		//p2.childFunc() //error, �ڽĸ��� �޼���� ���� �Ұ�
	}

}

package com.day14;

/*
 ��� - �θ��� ����� �״�� �����޾� ����ϰ�, �ڽŸ��� Ư���� ������ �߰��ؼ� ���
 		�������� ���� �θ𿡼� �����ϰ�, �ڽ� Ŭ������ �ڽſ� ���ǵ� ����鸸 ����
 		������ ����, �ߺ� ����
 		���꼺, ���������� ����
 		
 		class �ڽ�Ŭ���� extends �θ�Ŭ���� {
 		}
 */

class Parent {
	protected String name;
	protected int age;
	protected int money=10000;
}//class

class Child extends Parent{
	Child() {
		name="�ڽ�";
		age = 20;
	}
	
	public void showInfo() {
		System.out.println("�̸�:" + name);
		System.out.println("����:" + age);
		System.out.println("�������� �ڻ�" + money);
	}
	
}//class

public class Inheritance1 {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.showInfo();

	}

}

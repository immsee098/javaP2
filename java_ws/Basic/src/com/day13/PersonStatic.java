package com.day13;

class Person {
	private String name;
	private int age;
	private static int count; //static�� �Ἥ �Ѱ� ������
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
		
		System.out.println(++count+"��°��ü����!"); //��ü���� ���� �Ҵ�
	}
	
	public void display() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
	}
}


public class PersonStatic {
	

	public static void main(String[] args) {
		System.out.println("��������");
		Person hong = new Person("ȫ�浿", 20);
		hong.display();
		
		Person kim = new Person("��浿", 30);
		kim.display();

	}

}

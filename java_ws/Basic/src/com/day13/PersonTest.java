package com.day13;

class Testper {
	private String name;
	private int age;
	
	Testper(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String p_name) {
		name = p_name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int p_age) {
		age = p_age;
	}
	
	public void showInfo() {
		System.out.println("�̸��� "+name);
		System.out.println("���̴� "+age);
	}
}

public class PersonTest {

	public static void main(String[] args) {
		Testper p1 = new Testper("ȫ�浿", 13);
		p1.setAge(20);
		p1.setName("��浿");
		
		System.out.println(p1.getAge());
		System.out.println(p1.getName());

	}

}

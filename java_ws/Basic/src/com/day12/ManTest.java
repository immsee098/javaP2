package com.day12;

class Man {
	private int age;
	int height;
	
	
	//getter setter
	public int getAge() {
		return age;
	}
	
	public void setAge(int p_age) {
		age = p_age;
	}
}

public class ManTest {

	public static void main(String[] args) {
		Man m = new Man();
		
		//m.age=20; //error, private��
		
		m.height=170;
		m.setAge(20); //setter�� �̿��� ��������� ���� ����
		
		//System.out.println("����:"+m.age);//error
		System.out.println("����:" + m.getAge());

	}

}

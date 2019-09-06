package InherT;

import java.util.Scanner;

class Person {
	protected String name;
	protected int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}

class Student extends Person {
	protected String id;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void study() {
		System.out.println("�����Ѵ�");
	}
}

class Graduate extends Student {
	public String major;
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void writeThesis() {
		System.out.println("���� ����");
	}
}


public class PersonTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ����, �й�, ���� �Է�");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String id = sc.nextLine();
		String major = sc.nextLine();
		
		Graduate gr = new Graduate();
		
		gr.setName(name);
		gr.setMajor(major);
		gr.setId(id);
		gr.setAge(age);
		 
		System.out.println("=======================");
		
		System.out.println("�̸�:"+gr.getName());
		System.out.println("����:"+gr.getAge());
		System.out.println("�й�:"+gr.getId());
		System.out.println("����:"+gr.getMajor());
		gr.writeThesis();
		

	}

}

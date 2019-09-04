package com.day12;

class Person {
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int p_age) {
		if(p_age<1) {
			age=1;
		} else {
			age=p_age;
		}
	}
}

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(20);
		System.out.println("나이: "+p.getAge());
		
		Person p2=new Person();
		p2.setAge(0);
		System.out.println("나이:" + p2.getAge());

	}

}

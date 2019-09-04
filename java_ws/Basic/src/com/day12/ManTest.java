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
		
		//m.age=20; //error, private임
		
		m.height=170;
		m.setAge(20); //setter을 이용해 멤버변수에 값을 셋팅
		
		//System.out.println("나이:"+m.age);//error
		System.out.println("나이:" + m.getAge());

	}

}

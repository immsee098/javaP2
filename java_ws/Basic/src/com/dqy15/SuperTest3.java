package com.dqy15;

class Father{
	protected String name;
	
	Father(String name){
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("�̸�:"+name);
	}
}

class Son extends Father {
	Son(String name) {
		super(name);
	}
}

public class SuperTest3 {

	public static void main(String[] args) {
		Son s = new Son("ȫ�浢");
		s.showInfo();

	}

}

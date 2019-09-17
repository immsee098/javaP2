package com.java0917;

class BindingTest{
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();

		System.out.println("p.x = " + p.x);  //(1)  
		p.method(); 

		System.out.println("c.x = " + c.x);  //(2) 
		c.method(); 
	}
}

class Parent {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 200;

	void method() {
		System.out.println("Child Method");  
	}
}


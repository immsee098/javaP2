package com.day24;

class Person {
	public void showInfo() {
		System.out.println(this+"o");
	}
}
public class ObjectTest {

	public static void main(String[] args) {
		Person p = new Person();
		Person p2 = new Person();
		
		System.out.println("p와 p2가 같은가?:"+p.equals(p2));
		System.out.println("p.hasCode():"+p.hashCode());
		System.out.println("p.getClass():"+p.getClass());
		System.out.println("p.getClass().getName():"+p.getClass().getName());
		
		System.out.println("hashcode를 16진수로:"+(Integer.toHexString(p.hashCode())));
		System.out.println("p.toString()="+p.toString());
		System.out.println(p);
		p.showInfo();
	}

}

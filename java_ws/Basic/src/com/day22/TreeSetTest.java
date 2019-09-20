package com.day22;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Person[name="+name+", age="+age+"]";
	}
	
	//���ı��� - ���� ũ�� ����
	//int compare(T, o)
	
	public int compareTo(Person p) { //Compare�ż��� �������̵�
		if(this.age>p.age) {
			return 1;
		} else if(this.age<p.age) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Person> tset = new TreeSet<Person>();
		tset.add(new Person("ȫ�浿", 20)); //Person cannot be cast to java.lang.Comparable~>����...�� �� �θ�� ��Ӱ��� �ʿ�
		//PersonŬ������ Comparable �������̽��� �����ϸ� �������	
		//Compareto() �޼��带 �������̵�
		
		tset.add(new Person("��浿", 233));
		tset.add(new Person("�̱浿", 133));
		tset.add(new Person("���浿", 533));
		
		Iterator<Person> iter = tset.iterator();
		while(iter.hasNext()) {
			Person p = iter.next();
			System.out.println(p); //���̼����
		}
	 	
		}

}

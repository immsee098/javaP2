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
	
	//정렬기준 - 나이 크고 작음
	//int compare(T, o)
	
	public int compareTo(Person p) { //Compare매서드 오버라이딩
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
		tset.add(new Person("홍길동", 20)); //Person cannot be cast to java.lang.Comparable~>위에...가 꼭 부모라 상속관계 필요
		//Person클래스를 Comparable 인터페이스로 구현하면 정상실핼	
		//Compareto() 메서드를 오버라이딩
		
		tset.add(new Person("김길동", 233));
		tset.add(new Person("이길동", 133));
		tset.add(new Person("은길동", 533));
		
		Iterator<Person> iter = tset.iterator();
		while(iter.hasNext()) {
			Person p = iter.next();
			System.out.println(p); //나이순출력
		}
	 	
		}

}

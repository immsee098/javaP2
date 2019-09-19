package com.day21;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IteratorList {

	public static void main(String[] args) {
		ArrayList<Member> alist = new ArrayList<Member>();
		
		alist.add(new Member("500", "홍길동"));
		alist.add(new Member("400", "김길동"));
		alist.add(new Member("300", "금길동"));
		
		Iterator<Member> iter = alist.iterator();
		
		while(iter.hasNext()) {
			Member m = iter.next();
			System.out.println(m.toString());
		}
		
		
		Vector<Member> vec = new Vector<Member>(4);
		vec.add(new Member("799", "정길동"));
		vec.add(new Member("899", "겅길동"));
		vec.add(new Member("999", "놔길동"));
		
		for(int i=0; i<vec.size(); i++) {
			Member m = vec.get(i);
			System.out.println(m.toString());
		}
		
		System.out.println("\n====Enumberation 이용======");
		//Enumberation - Iterator의 구버전
		//public Enumeration<E> elements()
		
		Enumeration<Member> en = vec.elements();
		while(en.hasMoreElements()) {
			Member m = en.nextElement();
			System.out.println(m.toString());
		}
		}

}

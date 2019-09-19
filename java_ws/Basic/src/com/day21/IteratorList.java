package com.day21;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IteratorList {

	public static void main(String[] args) {
		ArrayList<Member> alist = new ArrayList<Member>();
		
		alist.add(new Member("500", "ȫ�浿"));
		alist.add(new Member("400", "��浿"));
		alist.add(new Member("300", "�ݱ浿"));
		
		Iterator<Member> iter = alist.iterator();
		
		while(iter.hasNext()) {
			Member m = iter.next();
			System.out.println(m.toString());
		}
		
		
		Vector<Member> vec = new Vector<Member>(4);
		vec.add(new Member("799", "���浿"));
		vec.add(new Member("899", "�ϱ浿"));
		vec.add(new Member("999", "���浿"));
		
		for(int i=0; i<vec.size(); i++) {
			Member m = vec.get(i);
			System.out.println(m.toString());
		}
		
		System.out.println("\n====Enumberation �̿�======");
		//Enumberation - Iterator�� ������
		//public Enumeration<E> elements()
		
		Enumeration<Member> en = vec.elements();
		while(en.hasMoreElements()) {
			Member m = en.nextElement();
			System.out.println(m.toString());
		}
		}

}

package com.day21;

import java.util.ArrayList;

public class ArrayListMember {

	public static void main(String[] args) {
		ArrayList<Member> m = new ArrayList<Member>();
		
		Member m1 = new Member("111", "������");
		m.add(m1);
		m.add(new Member("222","���ٹ�"));
		
		System.out.println(m.toString());
	}

}

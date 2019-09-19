package com.day21;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<Integer>();
		//����� ������ �����Ͱ� ���ĵ�
		
		tset.add(10);
		tset.add(3);
		tset.add(42);
		tset.add(7);
		tset.add(25);
		tset.add(10);
		
		System.out.println("������ ũ��:"+tset.size());
		
		Iterator<Integer> iter = tset.iterator();
		while(iter.hasNext()) {
			int n = iter.next();
			System.out.println(n+" ");
		}
		
		//�ζ�
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		
		while(lotto.size() < 6) {
			int rnd = (int)(Math.random()*45+1);
			lotto.add(rnd);
		}
		System.out.println("\n\n======lotto======");
		Iterator<Integer> iter2 = lotto.iterator();
		while(iter2.hasNext()) {
			int n = iter2.next();
			System.out.println(n+" ");
		}
		
		TreeSet<String> tset2 = new TreeSet<String>();
		tset2.add("ȫ�浿");
		tset2.add("ZXY");
		tset2.add("1234");
		tset2.add("ABCDE");
		tset2.add("lmn");
		tset2.add("a");
		tset2.add("780");
		tset2.add("�ڹ�");
		tset2.add("������");
		
		System.out.println("\n\n======String ���ı���======");
		Iterator<String> iter3 = tset2.iterator();
		while(iter3.hasNext()) {
			String s = iter3.next();
			System.out.println(s);
		}
	}

}

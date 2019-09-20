package com.day22;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class StringComparator implements Comparator<String>{
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
		
		/*if(s1.length()>s2.length()) {
			return 1;
		} else if(s1.length()<s2.length()) {
			return -1;
		} else {
			return 0;
		}*/
	}
}

public class TreeSetTest2 {

	public static void main(String[] args) {
		// ���ڿ��� �������� ������ �ƴ�, ���� ������ �����ؼ� TreeSet�� �ִ� ���
		//Comparator�������̽��� �����ϴ� Ŭ������ ���� �� TreeSet�� ������ ��
		//TreeSet(Comparator<? super E> comparator) �� �̿��Ѵ�
		
		TreeSet<String> tset = new TreeSet<String>(new StringComparator()); //�̷��� ������� �Ȱ��� ���̴� �ȵ�
		
		tset.add("abcjava");
		tset.add("��");
		tset.add("�����ٶ�");
		tset.add("xyza");
		tset.add("ZZ");
		tset.add("1234567890");
		tset.add("90");
		
		System.out.println("������ ũ��:"+tset.size()+"\n");
		
		Iterator<String> iter = tset.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}

	}

}

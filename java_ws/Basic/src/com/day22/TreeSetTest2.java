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
		// 문자열을 사전편찬 순서가 아닌, 길이 순으로 정렬해서 TreeSet에 넣는 경우
		//Comparator인터페이스를 구현하는 클래스를 만든 후 TreeSet의 생성자 중
		//TreeSet(Comparator<? super E> comparator) 을 이용한다
		
		TreeSet<String> tset = new TreeSet<String>(new StringComparator()); //이렇게 써버리면 똑같은 길이는 안들어감
		
		tset.add("abcjava");
		tset.add("헝");
		tset.add("가나다라");
		tset.add("xyza");
		tset.add("ZZ");
		tset.add("1234567890");
		tset.add("90");
		
		System.out.println("데이터 크기:"+tset.size()+"\n");
		
		Iterator<String> iter = tset.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}

	}

}

package com.awt.day1;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;

public class ListTest {

	public static void main(String[] args) {
		Frame f= new Frame("List 연습");		
		f.setLayout(new FlowLayout());
		
		List list = new List(4);  //public List(int rows)
		list.add("java");
		list.add("oracle");
		list.add("html");
		list.add("js");
		list.add("jsp");
		list.add("spring");
		
		List list2 = new List(3, true); //=> 다중 선택 가능
		//public List(int rows, boolean multipleMode)       

		list2.add("감");	
		list2.add("자두");	
		list2.add("배");	
		list2.add("바나나");	
		list2.add("오렌지");	
		
		f.add(list);
		f.add(list2);
		
		f.setSize(500, 400);
		f.setVisible(true);
		
	}

}

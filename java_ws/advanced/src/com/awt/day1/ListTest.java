package com.awt.day1;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;

public class ListTest {

	public static void main(String[] args) {
		Frame f= new Frame("List ����");		
		f.setLayout(new FlowLayout());
		
		List list = new List(4);  //public List(int rows)
		list.add("java");
		list.add("oracle");
		list.add("html");
		list.add("js");
		list.add("jsp");
		list.add("spring");
		
		List list2 = new List(3, true); //=> ���� ���� ����
		//public List(int rows, boolean multipleMode)       

		list2.add("��");	
		list2.add("�ڵ�");	
		list2.add("��");	
		list2.add("�ٳ���");	
		list2.add("������");	
		
		f.add(list);
		f.add(list2);
		
		f.setSize(500, 400);
		f.setVisible(true);
		
	}

}

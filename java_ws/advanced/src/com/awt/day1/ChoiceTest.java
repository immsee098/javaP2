package com.awt.day1;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ChoiceTest {

	public static void main(String[] args) {
		Frame f = new Frame("Choice ����"); 
		//Frame�� �⺻ ���̾ƿ�:BorderLayout
		f.setLayout(new FlowLayout());
		
		Choice ch = new Choice();
		ch.add("���");
		ch.add("��");
		ch.add("����");
		ch.add("����");
		
		f.add(ch);
		
		f.setSize(400, 300);
		f.setVisible(true);
		
	}

}

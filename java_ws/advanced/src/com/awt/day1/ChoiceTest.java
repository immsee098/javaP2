package com.awt.day1;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ChoiceTest {

	public static void main(String[] args) {
		Frame f = new Frame("Choice 연습"); 
		//Frame의 기본 레이아웃:BorderLayout
		f.setLayout(new FlowLayout());
		
		Choice ch = new Choice();
		ch.add("사과");
		ch.add("귤");
		ch.add("수박");
		ch.add("포도");
		
		f.add(ch);
		
		f.setSize(400, 300);
		f.setVisible(true);
		
	}

}

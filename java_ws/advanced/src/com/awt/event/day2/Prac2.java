package com.awt.event.day2;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextField;

public class Prac2 extends Frame {
	List li;
	Choice ch;
	TextField tf;
	
	public Prac2() {
		super("Event Test");
		init();
		addEvent();
	}

	private void addEvent() {
		// TODO Auto-generated method stub
		
	}

	private void init() {
		ch=new Choice();
		ch.add("java");
		ch.add("jsp");
		ch.add("spring");
		
		li = new List(4);
		li.add("绵备");
		li.add("具备");
		li.add("咯青");
		li.add("雀拳");
		
		tf = new TextField();
		tf.setBackground(Color.gray);
		
		this.add(ch, "North");
		this.add(li, "Center");
		this.add(tf, "South");
		
	}

	public static void main(String[] args) {
		Prac2 f = new Prac2();
		f.setSize(400,300);
		f.setVisible(true);

	}

}

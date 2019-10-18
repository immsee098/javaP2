package com.awt.day2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class InserPrac2 extends Frame {

	public static void main(String[] args) {
		InserPrac2 f = new InserPrac2();
		f.setLayout(new GridLayout(2,1));
		
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(2, 1, 1, 1));
		p1.setBackground(Color.blue);
		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(2,1,1,1));
		
		Label id = new Label("아이디");
		Label pwd = new Label("비밀번호");
		
		p1.add(id);
		p1.add(pwd);
		
		Panel p3 = new Panel();
		
		f.add(p1);
		f.add(p2);
		
		f.setSize(400,300);
		f.setVisible(true);
	}

}

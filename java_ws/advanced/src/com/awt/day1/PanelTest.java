package com.awt.day1;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class PanelTest {

	public static void main(String[] args) {
		//Panel�� �⺻������ FlowLayout �� ���̾ƿ� �Ŵ����� ���
		Frame f = new Frame("Panel����");
		f.setLayout(null);
		
		Panel p = new Panel();
		p.setBackground(Color.orange);
		p.setSize(250, 200);
		p.setLocation(100, 130);
		
		Button bt = new Button("OK");
		p.add(bt);
		
		f.add(p);
		
		f.setSize(400, 400);
		f.setVisible(true);
		


	}

}




package com.awt.day1;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class PanelTest {

	public static void main(String[] args) {
		//Panel은 기본적으로 FlowLayout 을 레이아웃 매니저로 사용
		Frame f = new Frame("Panel연습");
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




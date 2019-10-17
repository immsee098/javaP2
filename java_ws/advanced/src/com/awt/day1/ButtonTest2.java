package com.awt.day1;

import java.awt.Button;
import java.awt.Frame;

public class ButtonTest2 {

	public static void main(String[] args) {
		Frame f = new Frame("Button 연습2");
		f.setLayout(null);
		
		Button bt = new Button("확인");
		bt.setSize(100, 60);
		bt.setLocation(50, 100);
		f.add(bt); //Frame에 Button 추가
		
		f.setSize(300, 200);
		f.setVisible(true);
		
	}

}

package com.awt.day1;

import java.awt.Button;
import java.awt.Frame;

public class ButtonTest {

	public static void main(String[] args) {
		Frame f = new Frame("Button 연습");
		
		Button bt = new Button("확인");
		f.add(bt); //Frame에 Button 추가
		
		f.setSize(300, 200);
		f.setVisible(true);
		
	}

}

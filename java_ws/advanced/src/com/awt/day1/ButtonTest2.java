package com.awt.day1;

import java.awt.Button;
import java.awt.Frame;

public class ButtonTest2 {

	public static void main(String[] args) {
		Frame f = new Frame("Button ����2");
		f.setLayout(null);
		
		Button bt = new Button("Ȯ��");
		bt.setSize(100, 60);
		bt.setLocation(50, 100);
		f.add(bt); //Frame�� Button �߰�
		
		f.setSize(300, 200);
		f.setVisible(true);
		
	}

}

package com.awt.day1;

import java.awt.Button;
import java.awt.Frame;

public class ButtonTest {

	public static void main(String[] args) {
		Frame f = new Frame("Button ����");
		
		Button bt = new Button("Ȯ��");
		f.add(bt); //Frame�� Button �߰�
		
		f.setSize(300, 200);
		f.setVisible(true);
		
	}

}

package com.awt.day1;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class TextFieldT {

	public static void main(String[] args) {
		Frame f = new Frame("TextField����");
		f.setLayout(new FlowLayout());
		
		Label lb = new Label("ID:", Label.RIGHT);
		Label lb2 = new Label("PASSWORD:", Label.RIGHT);
		
		TextField tf = new TextField(10);
		TextField tf2 = new TextField(10);
		//public TextField(int columns)
		
		tf2.setEchoChar('*');
		
		f.add(lb);
		f.add(tf);
		f.add(lb2);
		f.add(tf2);
		
		//TextArea - ������ �Է� ������ �ؽ�Ʈ ����
		//public TextArea(int rows, int columns)
		TextArea ta = new TextArea(3, 50);		
		TextArea ta2 = new TextArea("�ϰ� ���� ���� ��������", 5, 40);
				
		f.add(ta2);
		f.add(ta);
		
		ta2.selectAll();
		
		f.setSize(500, 400);
		f.setVisible(true);
		
	}

}


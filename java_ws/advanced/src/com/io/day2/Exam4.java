package com.io.day2;

import java.awt.Button;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exam4 extends JFrame{

	public static void main(String[] args) {
		
		Exam4 f = new Exam4();
		
		JPanel tb = new JPanel();
		
		Button bt = new Button("file");
		tb.add("West", bt);
		f.add(tb, "North");
		
		TextArea ta = new TextArea();
		ta.setEditable(false);
		
		f.add(ta, "Center");
		
		f.setSize(300, 400);
		f.setVisible(true);
	}

}

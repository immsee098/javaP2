package com.awt.day1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

public class LabelTest {

	public static void main(String[] args) {
		Frame f = new Frame("Label ¿¬½À");
		f.setLayout(null);
		
		Label lb = new Label("ID:");
		lb.setBounds(50, 50, 100, 20);
		//public void setBounds(int x,int y,int width,int height)
		
		lb.setBackground(Color.cyan);
		
		Label lb2 = new Label("Password:", Label.RIGHT);
		lb2.setBounds(50, 70, 100, 20);
		lb2.setBackground(Color.yellow);
		
		f.add(lb);
		f.add(lb2);
		
		f.setSize(400, 300);
		f.setVisible(true);
		
	}

}

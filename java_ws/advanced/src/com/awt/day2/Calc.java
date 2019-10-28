package com.awt.day2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Calc {

	public static void main(String[] args) {
		Frame f = new Frame("°è»ê±â");
		
		TextField tf = new TextField();
		tf.setEditable(false);
		
		Panel p = new Panel();
		p.setLayout(new GridLayout(4,5,4,4));
		p.setBackground(Color.LIGHT_GRAY);
		
		f.setSize(190, 160);
		f.add(tf, "North");
		f.add(p, "Center");
		
		Button[] btArr = new Button[20];
		String[] strArr = { "7", "8", "9", "/", "CE",
				"4", "5", "6", "*", "BS",
				"1", "2", "3", "-", "1/x",
				"0", "+/-", ".", "+", "=" };

		for(int i=0;i<btArr.length;i++) {
			btArr[i] = new Button(strArr[i]);
			btArr[i].setForeground(Color.blue);
			p.add(btArr[i]);
		}
		
		f.setVisible(true);
	}

}

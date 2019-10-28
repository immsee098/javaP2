package com.awt.day1;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;

public class FontTest {

	public static void main(String[] args) {
		Frame f = new Frame("Font ¿¬½À");		
		f.setLayout(new FlowLayout());
		
		String abc="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Label lb1 = new Label(abc);
		Label lb2 = new Label(abc);
		Label lb3 = new Label(abc);
		Label lb4 = new Label(abc);
		
		//public Font(String name, int style, int size)
		Font f1= new Font("Serif", Font.PLAIN, 20);
		Font f2= new Font("Serif", Font.BOLD, 20);
		Font f3= new Font("Serif", Font.ITALIC, 20);
		Font f4= new Font("Serif", Font.BOLD+Font.ITALIC, 20);
		
		lb1.setFont(f1);
		lb2.setFont(f2);
		lb3.setFont(f3);
		lb4.setFont(f4);
		
		f.add(lb1);
		f.add(lb2);
		f.add(lb3);
		f.add(lb4);
		
		f.setSize(500, 500);
		f.setVisible(true);
	}

}






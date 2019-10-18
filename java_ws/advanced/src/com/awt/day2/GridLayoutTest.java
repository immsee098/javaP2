package com.awt.day2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayoutTest {

	public static void main(String[] args) {
		Frame f = new Frame("GridLayout연습");
		
		f.setLayout(new GridLayout(3, 2)); //3행 2열
		
		f.add(new Button("1"));
		f.add(new Button("2"));
		f.add(new Button("3"));
		f.add(new Button("4"));
		f.add(new Button("5"));
		f.add(new Button("6"));
		
		f.setSize(400,300);
		f.setVisible(true);

	}

}

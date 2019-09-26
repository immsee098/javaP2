package com.java0925;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Anonymous2 extends Frame{ 
	Button btn;	
	Object obj = new Object() {
		public void Anonymous2(){
		btn=new Button("´Ý ±â");
		add(btn,"South");
		btn.addActionListener(new EventHandler());
		}
	};

	class EventHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
}//class


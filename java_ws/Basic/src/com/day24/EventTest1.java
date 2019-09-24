package com.day24;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class EventTest1 extends Frame {
	private Button bt;
	
	public EventTest1() {
		super("이벤트연습");
		
		bt= new Button("닫기");
		this.add(bt, "South");
	
		bt.addActionListener(new EventHandler());
	}
	
	class EventHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
	}
}
	
	
	public static void main(String[] args) {
		EventTest1 f = new EventTest1();
		f.setSize(400, 200);
		f.setVisible(true);

	}

}

package com.awt.event.day2;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatWin extends Frame{
	TextArea ta;
	TextField tf;
	
	public ChatWin() {
		super("채팅창");
		
		init();
		
		addEvent();
		
	}
	
	private void addEvent() {
		tf.addActionListener(new EventHandler());
	}

	class EventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String str=tf.getText();
			
			ta.append("\r\n>>" + str); //엔터친 것처럼 다음줄로 가라
			tf.setText("");
		}
		
	}
	
	private void init() {
		ta=new TextArea();
		ta.setEditable(false);
		
		tf=new TextField();
		
		add(ta, "Center");
		add(tf, "South");
		
		setSize(400,300);
		setVisible(true);
		
		tf.requestFocus();
	}

	public static void main(String[] args) {
		ChatWin f = new ChatWin();
		
	}

}

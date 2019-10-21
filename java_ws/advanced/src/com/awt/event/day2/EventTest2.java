package com.awt.event.day2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest2 extends Frame{
	Button bt;
	
	public EventTest2(){
		super("익명 클래스로 이벤트핸들러 구성 ");
		
		init();
		
		addEvent();
	}
	
	private void addEvent() {
		bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);			
			}	
		});
	}
	
	
	private void init() {
		setLayout(new FlowLayout());
		
		bt=new Button("확인");
		add(bt);
	}

	public static void main(String[] args) {
		EventTest2 f = new EventTest2();
		f.setSize(300,300);
		f.setVisible(true);
	}

}

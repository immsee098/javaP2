package com.awt.event.day2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest3 extends Frame{
	Button bt;
	
	public EventTest3(){
		super("�͸� Ŭ������ �̺�Ʈ�ڵ鷯 ���� ");
		
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
		
		bt=new Button("Ȯ��");
		add(bt);
	}

	public static void main(String[] args) {
		EventTest3 f = new EventTest3();
		f.setSize(300,300);
		f.setVisible(true);
	}

}

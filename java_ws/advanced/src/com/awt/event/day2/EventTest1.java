package com.awt.event.day2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest1 extends Frame{
	Button bt;
	
	public EventTest1(){
		super("���� Ŭ������ �̺�Ʈ�ڵ鷯 ���� ");
		
		init();
		
		addEvent();
	}
	
	private void addEvent() {
		bt.addActionListener(new EventHandler());
	}

	//���� Ŭ����
	class EventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);			
		}		
	}
	
	private void init() {
		setLayout(new FlowLayout());
		
		bt=new Button("Ȯ��");
		add(bt);
	}

	public static void main(String[] args) {
		EventTest1 f = new EventTest1();
		f.setSize(300,300);
		f.setVisible(true);
	}

}

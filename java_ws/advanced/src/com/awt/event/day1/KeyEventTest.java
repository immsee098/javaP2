package com.awt.event.day1;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventTest extends Frame{
	Label lbSsn, lb;
	TextField tfSsn1, tfSsn2;

	public KeyEventTest(){
		super("KeyEvent");

		init();

		//이벤트 연결
		addEvent();
		
		this.setSize(500, 200);
		this.setVisible(true);
	}

	private void init() {
		this.setLayout(new FlowLayout());

		lbSsn=new Label("주민번호 : ");
		lb=new Label(" - ");

		tfSsn1=new TextField(10);
		tfSsn2=new TextField(10);

		this.add(lbSsn);
		this.add(tfSsn1);
		this.add(lb);
		this.add(tfSsn2);

	}

	private void addEvent() {
		//이벤트 소스 : tfSsn1
		//이벤트 핸들러 : KeyListener를 구현한 클래스
		tfSsn1.addKeyListener(new EventHandler());
	}

	class EventHandler implements KeyListener{

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyReleased(KeyEvent e) {
			String ssn=tfSsn1.getText().trim();
			if(ssn.length()==6) {
				tfSsn2.requestFocus();
			}			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) {
		KeyEventTest f = new KeyEventTest();
	}

}

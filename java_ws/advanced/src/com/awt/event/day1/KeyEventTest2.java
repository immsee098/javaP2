package com.awt.event.day1;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventTest2 extends Frame implements KeyListener{
	Label lbSsn, lb;
	TextField tfSsn1, tfSsn2;

	public KeyEventTest2(){
		super("KeyEvent");

		init();

		//�̺�Ʈ ����
		addEvent();
		
		this.setSize(500, 200);
		this.setVisible(true);
	}

	private void init() {
		this.setLayout(new FlowLayout());

		lbSsn=new Label("�ֹι�ȣ : ");
		lb=new Label(" - ");

		tfSsn1=new TextField(10);
		tfSsn2=new TextField(10);

		this.add(lbSsn);
		this.add(tfSsn1);
		this.add(lb);
		this.add(tfSsn2);

	}

	private void addEvent() {
		//�̺�Ʈ �ҽ� : tfSsn1
		//�̺�Ʈ �ڵ鷯 : KeyListener�� ������ Ŭ����
		tfSsn1.addKeyListener(this);
	}

	

	public static void main(String[] args) {
		KeyEventTest2 f = new KeyEventTest2();
	}

	@Override
	public void keyPressed(KeyEvent e) {
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

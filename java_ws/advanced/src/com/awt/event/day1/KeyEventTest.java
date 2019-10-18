package com.awt.event.day1;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.EventHandler;

public class KeyEventTest extends Frame {
	Label lbSsn, lb;
	TextField tfSsn1, tfSsn2;
	
	
	public KeyEventTest(){
		super("KeyEvent");
		
		init();
		
		
		
		addEvent();
	}
	
	private void init() {
		
		this.setLayout(new FlowLayout());
		
		lbSsn = new Label("ÁÖ¹Î¹øÈ£:");
		lb = new Label("-");
		
		tfSsn1 = new TextField(10);
		tfSsn2 = new TextField(10);
		
		this.add(lbSsn);
		this.add(tfSsn1);
		this.add(lb);
		this.add(tfSsn2);
		
		this.setSize(500,200);
		this.setVisible(true);
	}
	
	private void addEvent() {
		tfSsn1.addKeyListener(new EventHandler());
	}
	
	class EventHandler implements KeyListener{

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			String ssn = tfSsn1.getText().trim();
			if(ssn.length()==6) {
				tfSsn2.requestFocus();
			}
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

	public static void main(String[] args) {
		KeyEventTest f = new KeyEventTest();

	}

}

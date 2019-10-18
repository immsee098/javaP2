package com.awt.event.day1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseEventTest extends Frame implements MouseMotionListener{
	Label lb;
	String str="Mouse Pointer Location : ";
	
	public MouseEventTest(){
		super("MouseEvent¿¬½À");
		
		init();
		
		addEvent();
		
		this.setSize(500, 400);
		this.setVisible(true);
	}
	
	
	private void addEvent() {
		this.addMouseMotionListener(this);
	}


	private void init() {
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		lb=new Label(str);
		lb.setBackground(Color.yellow);
		
		add(lb);		
	}


	public static void main(String[] args) {
		MouseEventTest f = new MouseEventTest();
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		String s = "x="+e.getX() + ", y="+ e.getY();
		lb.setText(s);
	}

}

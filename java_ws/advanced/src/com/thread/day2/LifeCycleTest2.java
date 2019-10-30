package com.thread.day2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LifeCycleTest2 extends Frame 
	implements ActionListener, Runnable{
	private Button btStart, btStop;
	private Panel pl;
	
	int x=30, y=100;	
	Thread th;
	
	public LifeCycleTest2(){
		super("Thread LifeCycle");
		
		init();
		
		addEvent();
	}
	
	@Override
	public void paint(Graphics g) {  //Window의 paint 메서드
		g.setColor(Color.orange);
		g.fillOval(x, y, 70, 70);
	}
	
	private void addEvent() {
		btStart.addActionListener(this);
		btStop.addActionListener(this);		
	}

	private void init() {		
		pl=new Panel();
		btStart=new Button("Start");
		btStop=new Button("Stop");
		
		pl.add(btStart);
		pl.add(btStop);
		
		add(pl, "South");
	}

	
	public static void main(String[] args) {
		LifeCycleTest2 f = new LifeCycleTest2();
		f.setSize(600, 400);
		f.setVisible(true);
		
	}

	@Override
	public void run() {
		int width=this.getWidth();
		System.out.println("width="+ width);
		
		while(true) {
			if(x>width) {
				x=0;
			}
			
			x+=5;
			repaint();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("InterruptedException 발생"+ e);
				break;
			}			
		}//while
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btStart) {
			th=new Thread(this);
			th.start();
		}else if(e.getSource()==btStop) {
			th.interrupt();
		}
	}

}

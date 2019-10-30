package com.thread.day2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class ProgressbarTest2 extends JFrame 
	implements ActionListener{

	private JProgressBar bar1, bar2, bar3;
	private JButton btStart;
	private JPanel pl;
	
	public ProgressbarTest2() {
		super("쓰레드");
		
		init();
		addEvent();
	}
	
	private void addEvent() {
		btStart.addActionListener(this);
	}

	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pl=new JPanel();
		bar1=new JProgressBar();
		bar2=new JProgressBar();
		bar3=new JProgressBar();
		bar1.setStringPainted(true);
		bar2.setStringPainted(true);
		bar3.setStringPainted(true);
		
		btStart=new JButton("Start");
		pl.add(bar1);
		pl.add(bar2);
		pl.add(bar3);
		
		add(pl,"Center");
		add(btStart, "South");
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ProgressbarTest2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btStart) {
			MyThread5 th=new MyThread5(bar1, 100, 5);			
			th.start();
			
			MyThread5 th2=new MyThread5(bar2, 1000, 20);			
			th2.start();
			
			MyThread5 th3=new MyThread5(bar3, 500, 10);			
			th3.start();
		}
	}

}

class MyThread5 extends Thread{
	private JProgressBar bar;
	private int interval;  
	private int n;  //증가치
	
	MyThread5(JProgressBar bar, int interval, int n){
		this.bar=bar;
		this.interval=interval;
		this.n=n;
	}
	
	@Override
	public void run() {
		synchronized (bar) {
			for(int i=bar.getMinimum();i<=bar.getMaximum();i+=n) {
				bar.setValue(i);
				System.out.println("i="+i);
				
				try {
					Thread.sleep(interval);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}			
			}
			
		}
		
	}
	
}
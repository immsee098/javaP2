package com.thread.day2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class ProgressbarTest1 extends JFrame 
	implements ActionListener, Runnable{
	private JLabel lb;
	private JTextField tf;
	private JButton btStart;
	private JProgressBar bar;
	
	private Thread th;
	
	public ProgressbarTest1(){
		super("진행바-Thread이용");
		init();
		addEvent();
	}
	
	private void addEvent() {
		btStart.addActionListener(this);
	}

	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		lb=new JLabel("메모");
		tf=new JTextField(20);
		btStart=new JButton("Start");
		bar=new JProgressBar();
		bar.setStringPainted(true); //진행바에 퍼센티지가 표시됨	
		
		add(lb);
		add(tf);
		add(btStart);
		add(bar);
		
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ProgressbarTest1();		
	}

	@Override
	public void run() {
		System.out.println("min:"+bar.getMinimum());
		System.out.println("max:"+bar.getMaximum());
		
		synchronized (bar) {
			for(int i=bar.getMinimum();i<=bar.getMaximum();i+=5) {
				bar.setValue(i);
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}//for
		}		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btStart) {
			th=new Thread(this);
			th.start();
		}
		
	}

}

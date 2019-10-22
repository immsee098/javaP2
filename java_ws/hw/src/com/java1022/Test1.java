package com.java1022;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test1 extends Frame {
	private Panel p1, p2, p3,p4;
	private Label lb1,lb2, lb3;
	private TextField tf1, tf2, tf3;
	private Button bt1, bt2;
	
	public Test1() {
		super();
		this.setBackground(Color.pink);
		p1= new Panel();		
		p2= new Panel();
		p3= new Panel();
		p4= new Panel();
		
		lb1 = new Label("첫번째 숫자");
		lb2 = new Label("두번째 숫자");
		lb3 = new Label("세번째 숫자");
		
		tf1 = new TextField();
		tf2 = new TextField();
		tf3 = new TextField();
		
		bt1 = new Button("더하기");
		bt2 = new Button("화면 지우기");
		
		p1.add(lb1);
		p1.add(tf1);
		p2.add(lb2);
		p2.add(tf2);
		p3.add(lb3);
		p3.add(tf3);
		p4.add(bt1);
		p4.add(bt2);
		
		this.add(p1);
		this.add(p2);
		this.add(p3);
		this.add(p4);
		
		addEvent();
	}

	private void addEvent() {
		bt1.addActionListener(new EventHandler());
		bt2.addActionListener(new EventHandler());
		
	}
	
	class EventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getSource());
		
			if(e.getSource()==bt2) {
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
			}
			if(tf1.getText()!=null && tf2.getText()!=null && !tf1.getText().equals("") && !tf2.getText().equals("")) {
				int adder = Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText());
				tf3.setText(adder+"");
			} else {
				tf3.setText("숫자를 입력하세요");
			}
			
		}
		
	}

	public static void main(String[] args) {
		Test1 f = new Test1();
		f.setLayout(new GridLayout(4, 1));
		f.setSize(400, 300);
		f.setVisible(true);
	}

}

package com.awt.event.day2;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prac1 extends Frame {
	Label lb1, lb2, lb3;
	Checkbox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8;
	CheckboxGroup radio;
	Button bt;
	
	public Prac1(){
		super("CheckboxEventTest");
		init();
		addEvent();
		
	}

	private void addEvent() {
		bt.addActionListener(new EventHandler());
		
	}
	
	class EventHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			float score = 0f;
			if(cb1.getState()) {score+=12.5f;}
			if(cb2.getState()) {score+=12.5f;}
			if(cb3.getState()) {score+=12.5f;}
			if(cb4.getState()) {score+=12.5f;}
			if(cb7.getState()) {score+=50.0f;}
			lb3.setText("*���: ������ "+score+"���Դϴ�.");
		}
	}

	private void init() {
		
		//this.setLayout();
		
		Panel p1 = new Panel(new GridLayout(5,1,5,5));
		Panel p2 = new Panel(new GridLayout(5,1,5,5));
		Panel p3 = new Panel(new GridLayout(2,1,5,5));
		lb1 = new Label("1.������ ActionEvent�� actionPerformed�޼��尡 ȣ��Ǵ� ����?(��� ������)");
		
		cb1 = new Checkbox("Button�� ������ ��");
		cb2 = new Checkbox("����Ű ��������");
		cb3 = new Checkbox("MenuItem�� Ŭ��������");
		cb4 = new Checkbox("List���� ��������");
		
		lb2 = new Label("2.Frame�� �⺻ LayoutManager��?");
		radio = new CheckboxGroup();
		cb5 = new Checkbox("Flow", radio, false);
		cb6 = new Checkbox("Grid", radio, false);
		cb7 = new Checkbox("Border", radio, false);
		cb8 = new Checkbox("Card", radio, false);
		
		bt = new Button("�� ��ư�� �����ø� ����� �� �� �ֽ��ϴ�");
		lb3 = new Label("*���:");
		
		p1.add(lb1);
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		p1.add(cb4);
		
		p2.add(lb2);
		p2.add(cb5);
		p2.add(cb6);
		p2.add(cb7);
		p2.add(cb8);
		
		p3.add(bt);
		p3.add(lb3);
		
		this.add(p1, "North");
		this.add(p2, "Center");
		this.add(p3, "South");
		
	}

	public static void main(String[] args) {
		Prac1 f = new Prac1();
		f.setSize(400,300);
		f.setVisible(true);

	}

}

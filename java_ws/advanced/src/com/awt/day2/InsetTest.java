package com.awt.day2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.TextArea;

public class InsetTest extends Frame{
	Button bt1, bt2;
	TextArea ta;
	MyPanel p;
	
	public InsetTest(){
		super("Inset ����");
		
		bt1=new Button("Ȯ��");
		bt2=new Button("���");
		
		ta=new TextArea();
		p=new MyPanel();
		p.setLayout(new GridLayout(1,2, 4,4));
		
		p.setBackground(Color.green);
		
		p.add(bt1);
		p.add(bt2);
		
		this.add(ta, "Center");
		this.add(p, "South");
	}
	
	//�����̳��� �ٱ������� �ֱ� ���ؼ��� Container Ŭ������ getInsets() 
	//�޼ҵ带 �������̵�
	@Override
	public Insets getInsets() {
		Insets insets = new Insets(100, 20, 30, 40);
		//public Insets(int top, int left, int bottom, int right)
		
		return insets;
	}
	
	
	public static void main(String[] args) {
		InsetTest f = new InsetTest();
		f.setSize(400, 500);
		f.setVisible(true);
	}
}

class MyPanel extends Panel{

	@Override
	public Insets getInsets() {
		return new Insets(10, 10, 10, 10);
	}
	
}






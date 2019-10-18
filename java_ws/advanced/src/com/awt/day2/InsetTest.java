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
	
	public InsetTest(){
		super("Inset ����");
		
		bt1=new Button("Ȯ��");
		bt2=new Button("���");
		
		ta=new TextArea();
		MyPanel p = new MyPanel();
		p.setLayout(new GridLayout(1, 2,4,4));
		p.setBackground(Color.green);
		
		p.add(bt1);
		p.add(bt2);
		
		this.add(ta, "Center");
		this.add(p, "South");
	}
	
	//�����̳��� �ٱ������� �ֱ� ���ؼ��� Ŭ������ getInsets()�޼ҵ� �������̵�
	public Insets getInsets() {
		Insets insets = new Insets(100, 20, 30, 40);
		
		return insets;
	}
	
	public static void main(String[] args) {
		InsetTest f = new InsetTest();
		f.setSize(400, 500);
		f.setVisible(true);
	}

}


class MyPanel extends Panel{
	
	public Insets getInsets() {
		return new Insets(10,10,10,10);
	}
}

package com.awt.day2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Panel;

class LayoutEx5 extends Frame{
	private Button bt1,bt2,bt3,bt4, bt5,bt6;

	public LayoutEx5(){
		super("���̾ƿ� �ǽ�");

		MyPanel2 p1=new MyPanel2();
		Panel p2=new MyPanel2();
		p1.setBackground(Color.pink);
		p2.setBackground(Color.cyan);

		//�г��� ���̾ƿ� ����
		p1.setLayout(new GridLayout(2,2,10,10));
		p2.setLayout(new GridLayout(1,2,10,10));

		bt1=new Button("��ư1");
		bt2=new Button("��ư2");
		bt3=new Button("��ư3");
		bt4=new Button("��ư4");
		bt5=new Button("��ư5");
		bt6=new Button("��ư6");

		p1.add(bt1);
		p1.add(bt2);
		p1.add(bt3);
		p1.add(bt4);

		p2.add(bt5);
		p2.add(bt6);

		add(p1,"Center");
		add(p2,"East");

		this.setSize(400, 400);
		this.setVisible(true);
	}

	public Insets getInsets(){
		return new Insets(40,40,40,40);
	}//getInsets()

	public static void main(String[] args){
		LayoutEx5 f = new LayoutEx5();
	}//main
}//


class MyPanel2 extends Panel
{
	public Insets getInsets(){
		return new Insets(15,15,15,15);
	}
}//

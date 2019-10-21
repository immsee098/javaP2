package com.awt.event.day2;

import java.awt.*;
import java.awt.event.*;

public class Exam2 extends Frame{
	Label lbl, lbl2, lbl3; 
	Choice choice;
	List list;
	Panel p;
	TextField tf;

	public Exam2(String title){
		super(title);

		init();

		addEvent();
	}	

	private void addEvent() {
		EventHandler handler = new EventHandler();
		
		choice.addItemListener(handler);
		list.addItemListener(handler);
	}

	private void init() {
		p = new Panel();

		lbl = new Label("��밡�� ���");
		choice = new Choice();
		choice.add("JAVA");
		choice.add("JSP");
		choice.add("C");

		lbl2= new Label("���");
		list = new List();
		list.add("�౸");
		list.add("�߱�");
		list.add("����");
		list.add("��ȭ");

		//lbl3 = new Label("��� ���");
		tf = new TextField("��� ���");
		tf.setEditable(false);

		p.add(lbl);	 p.add(choice);		
		p.add(lbl2);  p.add(list);

		add(p,"Center");
		add(tf, "South");

		setSize(400, 200);
		setLocation(200, 200);
		setVisible(true);
	}

	class EventHandler	implements ItemListener	{
		public void itemStateChanged(ItemEvent e){ 
			if (e.getSource() == choice){
				String str = choice.getSelectedItem();
				tf.setText(str);		
				System.out.println("�޺����ڿ��� ������ �� :  " + str);
			}else if (e.getSource() == list){
				String str = list.getSelectedItem();
				tf.setText(str);		
				System.out.println("����Ʈ���� ������ �� :  " + str);
			}
		}
	}	

	public static void main(String[] args) {	
		Exam2 f = new Exam2("Event Test");
		
	}
} //class

package com.awt.event.day2;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEventTest extends Frame {
	Choice ch;
	List list;
	
	public ChoiceEventTest() {
		super("Choice, List Event");
		
		init();
		
		addEvent();
	}

	private void addEvent() {
		//�̺�Ʈ �ҽ�
		ch.addItemListener(new EventHandler());
		list.addItemListener(new EventHandler());
	}
	
	//����Ŭ����
	class EventHandler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource()==ch) {
				//choice���� �̺��߻�
				String sel = ch.getSelectedItem();
				System.out.println("�޺����� ������ �׸�:"+sel+", ������ index = "+ch.getSelectedIndex());
			}else if(e.getSource()==list) {
				//list���� �߻�
				String sel = ch.getSelectedItem();
				System.out.println("����Ʈ���� ������ �׸�:"+sel+", ������ index = "+ch.getSelectedIndex());
			}
			
		}
		
	}

	private void init() {
		this.setLayout(new FlowLayout());
		
		ch=new Choice();
		ch.add("java");
		ch.add("jsp");
		ch.add("spring");
		
		list = new List(3);
		list.add("���");
		list.add("��");
		list.add("�ٳ���");
		list.add("����");
		
		this.add(ch);
		this.add(list);
	}

	public static void main(String[] args) {
		ChoiceEventTest f = new ChoiceEventTest();
		f.setSize(400,300);
		f.setVisible(true);
	}

}

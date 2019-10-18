package com.awt.event.day1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//��ư Ŭ���� ó��
//�̺�Ʈ �ҽ� : ��ư
//�̺�Ʈ �ڵ鷯 : ActionListener�� ������ Ŭ����
//�̺�Ʈ : ActionEvent

public class ButtonEventTest extends Frame {
	TextField tf;
	Button bt;
	Label lb;
	
	public ButtonEventTest(){
		super("ActionEvent ����-��ư Ŭ��");
		this.setLayout(new FlowLayout());
		
		tf=new TextField(30);
		bt=new Button("Ȯ��");
		lb=new Label("���⿡ ����� ��µ˴ϴ�.");
		
		this.add(tf);
		this.add(bt);
		this.add(lb);
		
		this.setSize(340, 300);
		this.setVisible(true);
		
		//�̺�Ʈ ����
		bt.addActionListener(new EventHandler());
	}
	
	public static void main(String[] args) {
		ButtonEventTest f = new ButtonEventTest();
	}
	
	//���� Ŭ����
	class EventHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//��ư Ŭ���� ó���� ��
			String text=e.getActionCommand();
			String str=tf.getText();
			
			lb.setText(str+", " + text + "��ư�� Ŭ����!");
		}
		
	}//class
	
}//class



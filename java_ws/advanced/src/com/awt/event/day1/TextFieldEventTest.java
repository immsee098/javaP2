package com.awt.event.day1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldEventTest extends Frame{
	Label lbId, lbPwd;
	TextField tfId, tfPwd;
	Button btOk;
	
	public TextFieldEventTest(){
		super("ActionEvent����-Login");
		this.setLayout(new FlowLayout());
		
		lbId=new Label("���̵�:");
		lbPwd=new Label("��й�ȣ:");
		
		tfId=new TextField(10);
		tfPwd=new TextField(10);
		tfPwd.setEchoChar('*');
		
		btOk=new Button("OK");
		
		this.add(lbId);
		this.add(tfId);
		this.add(lbPwd);
		this.add(tfPwd);
		
		this.setSize(500, 200);
		this.setVisible(true);
		
		//�̺�Ʈ ����
		//�̺�Ʈ �ҽ�:��ư, ��й�ȣ �ؽ�Ʈ �ʵ�
		//�̺�Ʈ �ڵ鷯: ActionListener�� ������ Ŭ����
		btOk.addActionListener(new EventHandler());
		tfPwd.addActionListener(new EventHandler());
	}
	
	//���� Ŭ����
	class EventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("�̺�Ʈ �ҽ�:"+ e.getSource());
			
			String id=tfId.getText();
			String pwd=tfPwd.getText();
			
			if(!id.equals("hong")) {
				System.out.println("�ش� ���̵� �������� �ʽ��ϴ�.");
				tfId.requestFocus();
				tfId.selectAll();
			}else if(!pwd.equals("1234")) {
				System.out.println("��й�ȣ�� �߸��Ǿ����ϴ�.");
				tfPwd.requestFocus();
				tfPwd.selectAll();
			}else {
				System.out.println("�α��� ����!");
			}
		}
		
	}
	
	public static void main(String[] args) {
		TextFieldEventTest f = new TextFieldEventTest();
	}

}

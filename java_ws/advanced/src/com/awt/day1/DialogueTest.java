package com.awt.day1;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogueTest {

	public static void main(String[] args) {
		//Dialog - �ַ� ȭ�鿡 �޽���â�� �����ִµ� ����
		Frame f = new Frame("Dialog����");
		
		Dialog d= new Dialog(f, "information", true);
		//public Dialog(Frame owner,String title, boolean modal)
		
		d.setLayout(new FlowLayout());
		d.setSize(200, 150);
		d.add(new Label("this is modal!"));
		Button bt = new Button("ok");
		d.add(bt);
		
		bt.addActionListener(new ActionListener() {
			//�͸�Ŭ������
			@Override
			public void actionPerformed(ActionEvent e) {
				//d.setVisible(false);//���̾�α׸� �Ⱥ��̰� �Ѵ�
				d.dispose();//�޸𸮿��� ���ش�
			}
		});
		
		f.setSize(400, 500);
		f.setVisible(true); //�θ��� frame�� ���� �����ش�
		
		d.setVisible(true); //���߿� dialog�� ���̰� �Ѵ�
		
	}

}

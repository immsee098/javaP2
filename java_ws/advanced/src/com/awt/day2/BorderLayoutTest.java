package com.awt.day2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutTest {

	public static void main(String[] args) {
		/*
		 BorderLayout - �����̳ʸ� North, South, East, West, Center 
		 	��� 5���� �������� ������, �� ������ �ϳ��� ������Ʈ���� ��ġ�� �� �ֵ��� ��
			-�� ������ ���� ���� ������Ʈ�� ��ġ�ϸ�, �������� �߰��� ������Ʈ�� ���̰� ��
			-�� ������ �ϳ� �̻��� ������Ʈ�� �ֱ� ���� Panel�� �̿��ؾ� ��
		  */

		Frame f= new Frame("BorderLayout����");
		
		//f.setLayout(new BorderLayout()); //���� ����
		//=> Frame�� �⺻���̾ƿ��� BorderLayout�̹Ƿ�
		
		Button btN = new Button("��");
		Button btS = new Button("��");
		Button btE = new Button("��");
		Button btW = new Button("��");
		Button btC = new Button("���");
		
		f.add(btC,"Center");
		f.add(btE,"East");
		f.add("West", btW);
		f.add("South", btS);
		f.add(btN,BorderLayout.NORTH);
		
		f.setSize(400, 300);
		f.setVisible(true);		
		
	}

}

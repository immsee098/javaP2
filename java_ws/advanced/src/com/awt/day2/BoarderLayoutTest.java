package com.awt.day2;

import java.awt.Button;
import java.awt.Frame;

public class BoarderLayoutTest {
	public static void main(String[] args) {
		Frame f = new Frame("BoarderLayout ����");
		//f.setLayout(new BoarderLayout()); �������� �⺻���̾ƿ��� ������ ��������
		
		Button btN = new Button("��");
		Button btS = new Button("��");
		Button btE = new Button("��");
		Button btW = new Button("��");
		Button btC = new Button("���");
		
		f.add(btC, "Center");
		f.add(btS, "South");
		f.add(btE, "East");
		f.add(btW, "West");
		f.add(btN, "North");
		
		f.setSize(400, 300);
		f.setVisible(true);
		
	}
}

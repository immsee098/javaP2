package com.awt.day1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;

public class Scrollapne {

	public static void main(String[] args) {
		/*ScrollPane - �����̳��̹Ƿ� �ٸ� ������Ʈ�� ���Խ�ų �� ������, 
		  �ٸ� �����̳ʵ���� �޸� �� �ϳ��� ������Ʈ���� ���Խ�ų �� ����
		 */
		Frame f = new Frame("ScrollPane ����");
		
		Panel p = new Panel();
		p.setBackground(Color.orange);
		
		p.add(new Button("ù��°"));
		p.add(new Button("�ι�°"));
		p.add(new Button("����°"));
		p.add(new Button("�׹�°"));
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.add(p);
		
		f.add(scrollPane);
		
		f.setSize(400, 300);
		f.setVisible(true);
		
	}

}

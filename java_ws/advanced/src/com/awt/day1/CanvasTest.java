package com.awt.day1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class CanvasTest {

	public static void main(String[] args) {
		Frame f = new Frame("Canvas ����");
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.green);
		canvas.setSize(200, 150);
		
		f.setLayout(new FlowLayout());
		
		f.add(canvas);
		f.setSize(400, 300);
		f.setVisible(true);
		
		/*Canvas - �� ��� ������ �����ϴ� ������Ʈ
		���⿡ �׸��� �׸����� �ְ�, ���ڸ� ���� ���� ����
		�ַ� �׸��� �׸��ų� �̹����� ���� �������� ���*/
		
	}

}





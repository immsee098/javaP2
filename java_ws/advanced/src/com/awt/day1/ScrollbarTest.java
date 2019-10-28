package com.awt.day1;

import java.awt.Frame;
import java.awt.Scrollbar;

public class ScrollbarTest {

	public static void main(String[] args) {
		Frame f = new Frame("Scrollbar ����");
		f.setLayout(null);
		
		Scrollbar sb 
			= new Scrollbar(Scrollbar.HORIZONTAL, 0, 50, 0, 100);
		
		/*public Scrollbar(int orientation,
                int value,int visible,int minimum, int maximum)*/
		sb.setSize(100,	25);
		sb.setLocation(160, 130);
		
		Scrollbar sb2 
			= new Scrollbar(Scrollbar.VERTICAL, 50,20 ,0, 100);
		sb2.setSize(25, 100);
		sb2.setLocation(30, 100);
		
		/*
		Scrollbar(int orientation, int init, int buttonSize, 
			int min, int max)
			orientation : Scrollbar�� ���� ����
				Scrollbar.VERTICAL, Scrollbar.HORIZONTAL
			init : Scrollbar�� �ʱⰪ
			buttonSize : Scroll��ư(bubble)�� ũ��
			min : Scrollbar�� ���� �� �ִ� �ּҰ�
			max : Scrollbar �� ���� �� �ִ� �ִ밪
		 */
		
		f.add(sb);
		f.add(sb2);
		
		f.setSize(400,500);
		f.setVisible(true);
		
		
	}

}

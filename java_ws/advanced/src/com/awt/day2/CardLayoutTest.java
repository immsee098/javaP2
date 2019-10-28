package com.awt.day2;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.EventHandler;

public class CardLayoutTest {

	public static void main(String[] args) {
		/*
		 CardLayout - 여러 화면을 슬라이드처럼 바꿔가며 보여줄 수 있음
			프레임에 카드를 엎어 놓은 듯이 여러 개의 Panel 등과 같은 객체를 
			포개 놓은 듯한 배치
			- 여러 개의 컨테이너를 CardLayout에 추가한 다음, 
			순서대로 또는 임의의 컨테이너를 선택해서 보여줄 수 있음
		 */
		Frame f = new Frame("CardLayout연습");
		
		CardLayout cardLayout=new CardLayout(10,10);
		f.setLayout(cardLayout);
		//public CardLayout(int hgap, int vgap)
		
		Panel p1 = new Panel();
		p1.setBackground(Color.orange);
		p1.add(new Label("Card1"));
		
		Panel p2 = new Panel();
		p2.setBackground(Color.cyan);
		p2.add(new Label("Card2"));
		
		Panel p3 = new Panel();
		p3.setBackground(Color.green);
		p3.add(new Label("Card3"));
		
		Panel p4 = new Panel();
		p4.setBackground(Color.yellow);
		p4.add(new Label("Card4"));
		
		f.add(p1,"1");
		f.add(p2,"2");
		f.add(p3,"3");
		f.add(p4,"4");
				
		cardLayout.show(f, "1");
		//public void show(Container parent,   String name)
		
		f.setSize(400, 300);
		f.setVisible(true);
		
		//지역 클래스
		class Handler extends MouseAdapter{
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getModifiers()==e.BUTTON3_MASK) {
					cardLayout.next(f);
					//public void next(Container parent)
				}else {
					cardLayout.previous(f);
				}
			}
		}//class
		
		p1.addMouseListener(new Handler());
		p2.addMouseListener(new Handler());
		p3.addMouseListener(new Handler());
		p4.addMouseListener(new Handler());
		
	}//main	
	
}//class




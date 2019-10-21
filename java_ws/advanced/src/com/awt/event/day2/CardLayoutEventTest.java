package com.awt.event.day2;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutEventTest  extends Frame 
	implements ActionListener{
	Panel slide, pSouth, p1, p2, p3, p4, p5;
	Button btFirst, btLast, btNext, btPrev;
	CardLayout cardLayout;
	
	public CardLayoutEventTest() {
		super("CardLayout");
		
		init();
		
		addEvent();
	}
	
	private void addEvent() {
		btFirst.addActionListener(this);
		btLast.addActionListener(this);
		btNext.addActionListener(this);
		btPrev.addActionListener(this);
		
	}

	private void init() {
		cardLayout=new CardLayout();
		
		slide=new Panel();
		slide.setLayout(cardLayout);
		
		pSouth=new Panel();
		
		p1=new Panel();
		p1.setBackground(Color.green);
		p1.add(new Label("Card1"));
		
		p2=new Panel();
		p2.setBackground(Color.orange);
		p2.add(new Label("Card2"));
		
		p3=new Panel();
		p3.setBackground(Color.cyan);
		p3.add(new Label("Card3"));
				
		p4=new Panel();
		p4.setBackground(Color.yellow);
		p4.add(new Label("Card4"));
		
		p5=new Panel();
		p5.setBackground(Color.blue);
		p5.add(new Label("Card5"));
		
		slide.add(p1, "1");
		slide.add(p2, "2");
		slide.add(p3, "3");
		slide.add(p4, "4");
		slide.add(p5, "5");
		
		btFirst=new Button("<<");
		btLast=new Button(">>");
		btPrev=new Button("<");
		btNext=new Button(">");
		
		pSouth.add(btFirst);
		pSouth.add(btPrev);
		pSouth.add(btNext);
		pSouth.add(btLast);
		
		add(slide, "Center");
		add(pSouth, "South");
		
		cardLayout.show(slide, "1");
	}

	public static void main(String[] args) {
		CardLayoutEventTest f = new CardLayoutEventTest();
		f.setSize(400, 300);
		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btFirst) {
			cardLayout.first(slide);
		}else if(e.getSource()==btLast) {
			cardLayout.last(slide);			
		}else if(e.getSource()==btNext) {
			cardLayout.next(slide);			
		}else if(e.getSource()==btPrev) {
			cardLayout.previous(slide);			
		}		
	}

}

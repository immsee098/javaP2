package com.awt.event.day2;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEventTest extends Frame {
	Choice ch;
	List list;
	
	public ChoiceEventTest() {
		super("Choice, List Event");
		
		init();
		
		addEvent();
	}

	private void addEvent() {
		//이벤트 소스
		ch.addItemListener(new EventHandler());
		list.addItemListener(new EventHandler());
	}
	
	//내부클래스
	class EventHandler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource()==ch) {
				//choice에서 이벤발생
				String sel = ch.getSelectedItem();
				System.out.println("콤보에서 선택한 항목:"+sel+", 선택한 index = "+ch.getSelectedIndex());
			}else if(e.getSource()==list) {
				//list에서 발생
				String sel = ch.getSelectedItem();
				System.out.println("리스트에서 선택한 항목:"+sel+", 선택한 index = "+ch.getSelectedIndex());
			}
			
		}
		
	}

	private void init() {
		this.setLayout(new FlowLayout());
		
		ch=new Choice();
		ch.add("java");
		ch.add("jsp");
		ch.add("spring");
		
		list = new List(3);
		list.add("사과");
		list.add("귤");
		list.add("바나나");
		list.add("포도");
		
		this.add(ch);
		this.add(list);
	}

	public static void main(String[] args) {
		ChoiceEventTest f = new ChoiceEventTest();
		f.setSize(400,300);
		f.setVisible(true);
	}

}

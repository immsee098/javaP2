package com.awt.event.day1;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventTest extends Frame implements ItemListener{
	Checkbox ck1, ck2, ck3;
	CheckboxGroup group;
	TextField tf;
	
	public ItemEventTest(){
		super("체크박스 선택");
		
		init();
		
		addEvent();
	}
	
	private void addEvent() {
		ck1.addItemListener(this);
		ck2.addItemListener(this);
		ck3.addItemListener(this);
	}

	private void init() {
		setLayout(new FlowLayout());
		
		group=new CheckboxGroup();
		
		ck1=new Checkbox("java", group, false);
		ck2=new Checkbox("jsp", group, false);
		ck3=new Checkbox("spring", group, false);
		
		tf=new TextField(30);
		
		add(ck1);
		add(ck2);
		add(ck3);
		add(tf);
	}

	public static void main(String[] args) {
		ItemEventTest f = new ItemEventTest();
		f.setSize(400, 300);
		f.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Checkbox ck = (Checkbox) e.getSource();
		String str = ck.getLabel();
		
		tf.setText("선택된 항목:" +str);
		
	}

}

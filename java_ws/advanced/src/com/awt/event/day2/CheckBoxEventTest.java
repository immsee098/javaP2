package com.awt.event.day2;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxEventTest extends Frame{
	Checkbox ck1, ck2, ck3, ckM, ckF;
	CheckboxGroup group;
	Button btOk;
	
	public CheckBoxEventTest() {
		super("checkbox event");
		
		init();
		
		addEvent();
	}
	
	private void addEvent() {
		btOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ckM.getState()) {
					System.out.println("성별: 남자");
				}else if(ckF.getState()) {
					System.out.println("성별: "+ ckF.getLabel());
				}
				
				String lang="";
				if(ck1.getState()) {
					lang+= ck1.getLabel()+" ";
				}
				if(ck2.getState()) {
					lang+= ck2.getLabel()+" ";					
				}
				if(ck3.getState()) {
					lang+= ck3.getLabel()+" ";					
				}
				
				System.out.println("언어 :"+ lang);
			}
		});
	}

	private void init() {
		ck1 = new Checkbox("java");
		ck2 = new Checkbox("jsp");
		ck3 = new Checkbox("oracle");
		
		group=new CheckboxGroup();
		ckM=new Checkbox("남자", group, true);
		ckF=new Checkbox("여자", group, false);
		
		btOk=new Button("확인");
		
		this.setLayout(new FlowLayout());
		
		add(ck1);
		add(ck2);
		add(ck3);
		add(ckM);
		add(ckF);
		add(btOk);
		
	}

	public static void main(String[] args) {
		CheckBoxEventTest f = new CheckBoxEventTest();
		f.setSize(400, 300);
		f.setVisible(true);
	}

}

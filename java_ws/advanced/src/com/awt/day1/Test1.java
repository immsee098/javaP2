package com.awt.day1;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Test1 {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		
		Label name = new Label("이름", Label.RIGHT);
		Label pwd = new Label("비밀번호", Label.RIGHT);
		
		TextField namet = new TextField(10);
		TextField pwdt = new TextField(10);
		
		Label job = new Label("직업", Label.RIGHT);
		Label married = new Label("결혼여부", Label.RIGHT);
		
		Choice ch = new Choice();
		ch.add("자영업");
		ch.add("회사원");
		ch.add("공무원");
		
		CheckboxGroup group = new CheckboxGroup();
		Checkbox ckM=new Checkbox("미혼", group, true);
		Checkbox ckN=new Checkbox("비혼", group, false);
		
		f.add(name);
		f.add(namet);
		f.add(pwd);
		f.add(pwdt);
		
		f.add(job);
		f.add(ch);
		
		f.add(married);
		f.add(ckM);
		f.add(ckN);
//		Panel p = new Panel();
//		p.setBackground(Color.BLUE);
		
		f.setSize(350,400);
		f.setVisible(true);
	}

}

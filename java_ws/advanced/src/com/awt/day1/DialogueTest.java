package com.awt.day1;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogueTest {

	public static void main(String[] args) {
		//Dialog - 주로 화면에 메시지창을 보여주는데 사용됨
		Frame f = new Frame("Dialog연습");
		
		Dialog d= new Dialog(f, "information", true);
		//public Dialog(Frame owner,String title, boolean modal)
		
		d.setLayout(new FlowLayout());
		d.setSize(200, 150);
		d.add(new Label("this is modal!"));
		Button bt = new Button("ok");
		d.add(bt);
		
		bt.addActionListener(new ActionListener() {
			//익명클래스다
			@Override
			public void actionPerformed(ActionEvent e) {
				//d.setVisible(false);//다이얼로그를 안보이게 한다
				d.dispose();//메모리에서 없앤다
			}
		});
		
		f.setSize(400, 500);
		f.setVisible(true); //부모인 frame을 먼저 보여준다
		
		d.setVisible(true); //나중에 dialog를 보이게 한다
		
	}

}

package com.awt.event.day1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//버튼 클릭시 처리
//이벤트 소스 : 버튼
//이벤트 핸들러 : ActionListener를 구현한 클래스
//이벤트 : ActionEvent

public class ButtonEventTest extends Frame {
	TextField tf;
	Button bt;
	Label lb;
	
	public ButtonEventTest(){
		super("ActionEvent 연습-버튼 클릭");
		this.setLayout(new FlowLayout());
		
		tf=new TextField(30);
		bt=new Button("확인");
		lb=new Label("여기에 결과가 출력됩니다.");
		
		this.add(tf);
		this.add(bt);
		this.add(lb);
		
		this.setSize(340, 300);
		this.setVisible(true);
		
		//이벤트 연결
		bt.addActionListener(new EventHandler());
	}
	
	public static void main(String[] args) {
		ButtonEventTest f = new ButtonEventTest();
	}
	
	//내부 클래스
	class EventHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//버튼 클릭시 처리할 일
			String text=e.getActionCommand();
			String str=tf.getText();
			
			lb.setText(str+", " + text + "버튼을 클릭함!");
		}
		
	}//class
	
}//class



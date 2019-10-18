package com.awt.event.day1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldEventTest extends Frame{
	Label lbId, lbPwd;
	TextField tfId, tfPwd;
	Button btOk;
	
	public TextFieldEventTest(){
		super("ActionEvent연습-Login");
		this.setLayout(new FlowLayout());
		
		lbId=new Label("아이디:");
		lbPwd=new Label("비밀번호:");
		
		tfId=new TextField(10);
		tfPwd=new TextField(10);
		tfPwd.setEchoChar('*');
		
		btOk=new Button("OK");
		
		this.add(lbId);
		this.add(tfId);
		this.add(lbPwd);
		this.add(tfPwd);
		
		this.setSize(500, 200);
		this.setVisible(true);
		
		//이벤트 연결
		//이벤트 소스:버튼, 비밀번호 텍스트 필드
		//이벤트 핸들러: ActionListener를 구현한 클래스
		btOk.addActionListener(new EventHandler());
		tfPwd.addActionListener(new EventHandler());
	}
	
	//내부 클래스
	class EventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("이벤트 소스:"+ e.getSource());
			
			String id=tfId.getText();
			String pwd=tfPwd.getText();
			
			if(!id.equals("hong")) {
				System.out.println("해당 아이디가 존재하지 않습니다.");
				tfId.requestFocus();
				tfId.selectAll();
			}else if(!pwd.equals("1234")) {
				System.out.println("비밀번호가 잘못되었습니다.");
				tfPwd.requestFocus();
				tfPwd.selectAll();
			}else {
				System.out.println("로그인 성공!");
			}
		}
		
	}
	
	public static void main(String[] args) {
		TextFieldEventTest f = new TextFieldEventTest();
	}

}

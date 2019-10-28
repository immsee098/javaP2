package com.awt.day2;

import java.awt.*;
import java.awt.event.*;

class MyFrame2 extends Frame{
	private Label lb, lb1;
	private TextField tfId, tfPwd;
	private Button bt, bt1;

	public MyFrame2() {
		super("레이아웃 실습");
		this.init();
		this.setSize(200, 120);
		this.setVisible(true);
	}

	public void init() {
		lb = new Label("아이디 ", Label.RIGHT);
		lb1 = new Label("비밀번호", Label.RIGHT);
		tfId = new TextField();
		tfPwd = new TextField();
		bt = new Button("확인");
		bt1 = new Button("취소");

		Panel p = new Panel(new GridLayout(2, 1));
		p.add(lb);
		p.add(lb1);
		this.add("West", p);

		Panel p2 = new Panel(new GridLayout(2, 1));
		p2.add(tfId);
		p2.add(tfPwd);
		this.add("Center", p2);

		Panel p3 = new Panel();
		p3.add(bt);
		p3.add(bt1);
		this.add("South", p3);
	}
	/*public Insets getInsets(){
		return new Insets(10,10,10,10);
	}*/
}

public class LayoutEx2 {
	public static void main(String[] ar) {
		MyFrame2 obj = new MyFrame2();
	}
}

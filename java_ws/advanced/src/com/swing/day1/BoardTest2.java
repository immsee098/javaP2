package com.swing.day1;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

class BoardSub extends Frame{
	private Label  read_lb;
	private TextArea read_ta;
	private Button edit_bt,delete_bt,end_bt;
	
	private Label lb, lb1;
	private TextField tfId, tfPwd;
	private Button bt, bt1;

	public BoardSub() {
		super("레이아웃 연습");
		init();
		addEvent();
		this.setSize(500, 300);
		this.setVisible(true);
	}
	
	public void init() {
		this.setLayout(new GridLayout(1, 2, 10, 10));

		lb = new Label("아이디 ", Label.RIGHT);
		lb1 = new Label("비밀번호", Label.RIGHT);
		tfId = new TextField();
		tfPwd = new TextField();
		bt = new Button("로그인");
		bt1 = new Button("취소");

		read_lb = new Label("글보기");
		read_ta = new TextArea();
		edit_bt = new Button("수정");
		delete_bt = new Button("삭제");
		end_bt = new Button("종료");

		Panel pl = new MyPanel();
		pl.setLayout(new BorderLayout(5, 5));

		Panel p = new Panel(new GridLayout(2, 1));
		p.add(lb);
		p.add(lb1);
		pl.add("West", p);

		Panel p2 = new Panel(new GridLayout(2, 1));
		p2.add(tfId);
		p2.add(tfPwd);
		pl.add("Center", p2);

		Panel p3 = new Panel();
		p3.add(bt);
		p3.add(bt1);
		pl.add("South", p3);
		this.add(pl);


		Panel pl1 = new Panel(new BorderLayout(5, 5));
		pl1.add("North", read_lb);
		read_ta.setEditable(false);
		pl1.add("Center", read_ta);

		Panel pl3 = new Panel(new GridLayout(1, 3, 5, 5));
		pl3.add(edit_bt);
		pl3.add(delete_bt);
		pl3.add(end_bt);
		pl1.add("South", pl3);
		this.add(pl1);
	}

	public void addEvent(){
		this.addWindowListener(new EventHandler());

		bt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Dialog info = new Dialog(BoardSub.this, "로그인", false);
				info.setSize(240, 120);
				info.setLayout(new FlowLayout());

				Label msg = new Label("아이디 "+tfId.getText() + "으로 로그인되었습니다.", Label.CENTER);
				Button ok = new Button("close");
				info.add(msg);
				info.add(ok);

				info.setVisible(true);
			}
		});
	}

	class EventHandler extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0); 			
		}
	}

}

class MyPanel extends Panel{
	public Insets getInsets(){
		return new Insets(29,10,120,10);
	}
}


public class BoardTest2 {
	public static void main(String[] args) {
		BoardSub bs = new BoardSub();
	}
}

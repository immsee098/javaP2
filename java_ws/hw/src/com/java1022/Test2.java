package com.java1022;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Test2 extends JFrame implements ActionListener {
	JTable table;
	JButton bt;
	JScrollPane scrollPane;
	String[] colNames = {"번호", "이름", "전화번호"};
	String[][] data = {
			{"1", "홍길동", "010-100-2000"},
			{"2", "김연아", "010-200-5000"},
			{"3", "윤아", "010-300-7000"}	};
	DefaultTableModel model = new DefaultTableModel();
	
	public Test2() {
		super();
		init();
		addEvent();
	}
	
	private void addEvent() {
		bt.addActionListener(this);
		
	}

	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		table = new JTable();
		bt = new JButton("조회");
		
		model.addColumn("번호");
		model.addColumn("이름");
		model.addColumn("전화번호");
		
		table.setModel(model);
		scrollPane = new JScrollPane(table);
	
		add(scrollPane,"Center");
		add(bt, "North");
		
	}

	public static void main(String[] args) {
		Test2 f = new Test2();
		f.setSize(300,300);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt) {
			model.setDataVector(data, colNames);
			table.setModel(model);
		}
		
	}

}

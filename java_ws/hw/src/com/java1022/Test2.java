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
	String[] colNames = {"��ȣ", "�̸�", "��ȭ��ȣ"};
	String[][] data = {
			{"1", "ȫ�浿", "010-100-2000"},
			{"2", "�迬��", "010-200-5000"},
			{"3", "����", "010-300-7000"}	};
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
		bt = new JButton("��ȸ");
		
		model.addColumn("��ȣ");
		model.addColumn("�̸�");
		model.addColumn("��ȭ��ȣ");
		
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

package com.swing.day1;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest1 extends JFrame{
	JTable table;
	JScrollPane scrollPane;
	String[] colNames= {"��ȣ","�̸�","�ּ�"};
	String[][] data = {{"1","ȫ�浿","���ʵ�"}, 
			{"2","��浿","������"},
			{"3","�̱浿","����4��"},
			{"4","�ڱ浿","��ġ��"}
	};
	
	
	public JTableTest1() {
		super("JTable ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		table = new JTable(data, colNames);
		scrollPane = new JScrollPane(table);
		
		add(scrollPane);
	}
	
	public static void main(String[] args) {
		JTableTest1 f = new JTableTest1();
		
		f.setSize(400,300);
		f.setVisible(true);
	}

}

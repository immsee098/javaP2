package com.swing.day1;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableTest2 extends JFrame {
	JTable table;
	JScrollPane scrollPane;
	String[] colNames= {"��ȣ","�̸�","�ּ�"};
	String[][] data = {{"1","ȫ�浿","���ʵ�"}, 
			{"2","��浿","������"},
			{"3","�̱浿","����4��"},
			{"4","�ڱ浿","��ġ��"}
	};
	
	DefaultTableModel model = new DefaultTableModel();
	
	public JTableTest2() {
		super("JTable����2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		table = new JTable();
		model.setDataVector(data, colNames);
		
		scrollPane = new JScrollPane(table);
		table.setModel(model);
		
		add(scrollPane);
	}

	public static void main(String[] args) {
		JTableTest2 f = new JTableTest2();
		f.setSize(300,300);
		f.setVisible(true);

	}

}

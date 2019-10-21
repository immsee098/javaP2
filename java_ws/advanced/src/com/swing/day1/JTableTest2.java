package com.swing.day1;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableTest2 extends JFrame {
	JTable table;
	JScrollPane scrollPane;
	String[] colNames= {"번호","이름","주소"};
	String[][] data = {{"1","홍길동","서초동"}, 
			{"2","김길동","논현동"},
			{"3","이길동","서초4동"},
			{"4","박길동","대치동"}
	};
	
	DefaultTableModel model = new DefaultTableModel();
	
	public JTableTest2() {
		super("JTable연습2");
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

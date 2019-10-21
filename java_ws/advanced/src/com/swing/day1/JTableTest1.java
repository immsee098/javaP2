package com.swing.day1;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest1 extends JFrame{
	JTable table;
	JScrollPane scrollPane;
	String[] colNames= {"번호","이름","주소"};
	String[][] data = {{"1","홍길동","서초동"}, 
			{"2","김길동","논현동"},
			{"3","이길동","서초4동"},
			{"4","박길동","대치동"}
	};
	
	
	public JTableTest1() {
		super("JTable 연습");
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

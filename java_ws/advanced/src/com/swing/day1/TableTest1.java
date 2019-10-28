package com.swing.day1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableTest1 extends JFrame{	
	JScrollPane scrollpain;
	JTable table;
	DefaultTableModel model = new DefaultTableModel();
	JButton bt;
	
	String data[][]={ 
		{"1", "홍길동", "010-100-1000"},
		{"2", "김연아", "010-200-2000"},
		{"3", "윤아", "010-300-3000"}
	};

	String[] colNames={"번호", "이름", "전화번호"};
	
	public TableTest1(){	
		bt = new JButton("조회");
		add(bt, "North");
		
		model.addColumn("	번호");		
		model.addColumn("이  름");
		model.addColumn("전화번호");
		
		table = new JTable();		
		scrollpain = new JScrollPane();

		//model을 view와 연결
		table.setModel(model);		
		scrollpain.setViewportView(table);

		add(scrollpain, "Center");	
		
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showData();
			}
		});		

	}//생성자


	public void showData(){
		model.setDataVector(data, colNames);
		table.setModel(model);				
	}//showData()	

	public static void main(String[] args) {
		TableTest1 d=new TableTest1();
		d.setSize(300, 300);
		d.setVisible(true);
	}	
}

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
		{"1", "ȫ�浿", "010-100-1000"},
		{"2", "�迬��", "010-200-2000"},
		{"3", "����", "010-300-3000"}
	};

	String[] colNames={"��ȣ", "�̸�", "��ȭ��ȣ"};
	
	public TableTest1(){	
		bt = new JButton("��ȸ");
		add(bt, "North");
		
		model.addColumn("	��ȣ");		
		model.addColumn("��  ��");
		model.addColumn("��ȭ��ȣ");
		
		table = new JTable();		
		scrollpain = new JScrollPane();

		//model�� view�� ����
		table.setModel(model);		
		scrollpain.setViewportView(table);

		add(scrollpain, "Center");	
		
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showData();
			}
		});		

	}//������


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

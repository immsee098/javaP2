package com.swing.day1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.pd.model.PdDAO;
import com.pd.model.PdDTO;

public class JTableTest3 extends JFrame implements ActionListener{
	JTable table;
	JScrollPane scrollPane;
	JButton bt;
	
	DefaultTableModel model=new DefaultTableModel();
	
	public JTableTest3() {
		super("��ǰ ��ȸ");
		
		init();
		
		addEvent();
	}
	
	private void addEvent() {
		bt.addActionListener(this);
	}

	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		table=new JTable();
		scrollPane =new JScrollPane();
		bt=new JButton("��ȸ");
		
		model.addColumn("��ȣ");
		model.addColumn("��ǰ��");
		model.addColumn("����");
		
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		add(bt, "North");
		add(scrollPane, "Center");		
	}

	public static void main(String[] args) {
		JTableTest3 f = new JTableTest3();
		f.setSize(400, 300);
		f.setVisible(true);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt) {
			showAll();
		}
	}

	private void showAll() {
		//��ü ��ȸ
		String[] colNames= {"��ȣ","��ǰ��","����"};
		
		PdDAO dao = new PdDAO();
		try {
			ArrayList<PdDTO> alist=dao.selectAll();
			
			String[][] data=new String[alist.size()][3];
			
			for(int i=0;i<alist.size();i++) {
				PdDTO dto=alist.get(i);
				
				data[i][0]=dto.getNo()+"";
				data[i][1]=dto.getPdName();
				data[i][2]=dto.getPrice()+"";				
			}
			
			model.setDataVector(data, colNames);
			table.setModel(model);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

}

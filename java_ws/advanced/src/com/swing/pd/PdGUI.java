package com.swing.pd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PdGUI extends JFrame implements ActionListener{
	JPanel pNorth, pSouth;
	JLabel lbNo, lbPdName, lbPrice;
	JTextField tfNo, tfPdName, tfPrice;
	JButton btAdd, btEdit, btDel, btSearch, btAll,btCancel;
	JTable table;
	JScrollPane scrollPane;
	DefaultTableModel model=new DefaultTableModel();
	String[] colNames= {"��ȣ","��ǰ��","����"};
	
	public PdGUI() {
		super("��ǰ ����");
		
		init();
		
		addEvent();
	}
	
	private void addEvent() {
		// TODO Auto-generated method stub
		
	}

	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pNorth=new JPanel();
		pSouth=new JPanel();
		
		lbNo=new JLabel("��ȣ");
		lbPdName=new JLabel("��ǰ��");
		lbPrice=new JLabel("����");
		
		tfNo=new JTextField(10);
		tfPdName=new JTextField(10);
		tfPrice=new JTextField(10);
		
		pNorth.add(lbNo);
		pNorth.add(tfNo);
		pNorth.add(lbPdName);
		pNorth.add(tfPdName);
		pNorth.add(lbPrice);
		pNorth.add(tfPrice);
		
		add(pNorth, "North");
		
		btAdd=new JButton("�Է�");
		btEdit=new JButton("����");
		btDel=new JButton("����");
		btSearch=new JButton("�˻�");
		btAll=new JButton("��ü��ȸ");
		btCancel=new JButton("���");
		
		pSouth.add(btAdd);
		pSouth.add(btEdit);
		pSouth.add(btDel);
		pSouth.add(btSearch);
		pSouth.add(btAll);
		pSouth.add(btCancel);
		
		add(pSouth,"South");
		
	}

	public static void main(String[] args) {
		PdGUI f = new PdGUI();
		f.setSize(600, 500);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

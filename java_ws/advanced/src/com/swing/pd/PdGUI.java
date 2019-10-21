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
	String[] colNames= {"번호","상품명","가격"};
	
	public PdGUI() {
		super("상품 관리");
		
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
		
		lbNo=new JLabel("번호");
		lbPdName=new JLabel("상품명");
		lbPrice=new JLabel("가격");
		
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
		
		btAdd=new JButton("입력");
		btEdit=new JButton("수정");
		btDel=new JButton("삭제");
		btSearch=new JButton("검색");
		btAll=new JButton("전체조회");
		btCancel=new JButton("취소");
		
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

package com.swing.pd;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.pd.model.PdDAO;
import com.pd.model.PdDTO;

public class PdGUI extends JFrame implements ActionListener{
	JPanel pNorth, pSouth;
	JLabel lbNo, lbPdName, lbPrice;
	JTextField tfNo, tfPdName, tfPrice;
	JButton btAdd, btEdit, btDel, btSearch, btAll,btCancel;
	JTable table;
	JScrollPane scrollPane;
	DefaultTableModel model=new DefaultTableModel();
	String[] colNames= {"��ȣ","��ǰ��","����"};
//�׽�Ʈ
	private PdDAO pdDao;

	public PdGUI() {
		super("��ǰ ����");
		pdDao=new PdDAO();

		init();

		addEvent();

		showAll();
	}

	private void addEvent() {
		btAdd.addActionListener(this);
		btAll.addActionListener(this);
		btCancel.addActionListener(this);
		btDel.addActionListener(this);
		btEdit.addActionListener(this);
		btSearch.addActionListener(this);	

		table.addMouseListener(new EventHandler());
	}

	class EventHandler extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			int row=table.getSelectedRow();
			System.out.println("row="+row);

			//public Object getValueAt(int row, int column)
			/*String no= (String) table.getValueAt(row, 0);
			String pdName= (String) table.getValueAt(row, 1);
			String price= (String) table.getValueAt(row, 2);

			System.out.println("no="+no);
			System.out.println("pdName="+pdName);
			System.out.println("price="+price);*/

			for(int i=0;i<3;i++) {
				String val= (String) table.getValueAt(row, i);

				switch(i) {
				case 0:
					tfNo.setText(val);
					break;
				case 1:
					tfPdName.setText(val);
					break;
				case 2:
					tfPrice.setText(val);
					break;
				}
			}//for

		}		
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
		tfNo.setEditable(false);

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

		table=new JTable();
		scrollPane=new JScrollPane();

		model.addColumn("��ȣ");
		model.addColumn("��ǰ��");
		model.addColumn("����");

		table.setModel(model);

		table.getTableHeader().setBackground(Color.black);
		table.getTableHeader().setForeground(Color.yellow);
		table.getTableHeader().setReorderingAllowed(false);
		table.setRowHeight(20);

		scrollPane.setViewportView(table);
		add(scrollPane, "Center");

	}

	public static void main(String[] args) {
		PdGUI f = new PdGUI();
		f.setSize(600, 500);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btAdd) {
			add();
		}else if(e.getSource()==btAll) {
			showAll();
		}else if(e.getSource()==btEdit) {
			edit();
		}else if(e.getSource()==btDel) {
			del();
		}else if(e.getSource()==btSearch) {
			search();
		}else if(e.getSource()==btCancel) {
			clear_tf();
		}

	}

	private void clear_tf() {
		tfNo.setText("");
		tfPdName.setText("");
		tfPrice.setText("");		
	}

	private void search() {
		//1.	
		String pdName=tfPdName.getText();

		if(pdName==null || pdName.isEmpty()) {
			JOptionPane.showMessageDialog(this, "��ǰ���� �Է��ϼ���.");
			tfPdName.requestFocus();
			return;
		}
		
		//2.
		try {
			ArrayList<PdDTO> list=pdDao.selectByPdName(pdName);

			//3.
			String[][]data = new String[list.size()][3];
			for(int i=0;i<list.size();i++) {
				PdDTO dto=list.get(i);

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

	private void del() {
		//1.
		String no=tfNo.getText();

		if(no==null || no.isEmpty()) {
			JOptionPane.showMessageDialog(this, "��ȣ�� ���õǾ�� �մϴ�.");
			return;
		}

		//2.
		try {
			int cnt=pdDao.deletePd(Integer.parseInt(no));

			//3.
			if(cnt>0) {
				JOptionPane.showMessageDialog(this, "��ǰ �����Ǿ����ϴ�.");
				showAll();
			}else {
				JOptionPane.showMessageDialog(this, "��ǰ ���� ����!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void edit() {
		//1.
		String no=tfNo.getText();
		String pdName=tfPdName.getText();
		String price=tfPrice.getText();

		if(no==null || no.isEmpty()) {
			JOptionPane.showMessageDialog(this, "��ȣ�� ���õǾ�� �մϴ�.");
			return;
		}else if(pdName==null || pdName.isEmpty()) {
			JOptionPane.showMessageDialog(this, "��ǰ���� �Է��ϼ���.");
			tfPdName.requestFocus();
			return;
		}

		//2.
		PdDTO dto = new PdDTO();
		dto.setNo(Integer.parseInt(no));
		dto.setPdName(pdName);
		dto.setPrice(Integer.parseInt(price));

		try {
			int cnt=pdDao.updatePd(dto);

			//3.
			if(cnt>0) {
				JOptionPane.showMessageDialog(this, "��ǰ �����Ǿ����ϴ�.");
				showAll();
			}else {
				JOptionPane.showMessageDialog(this, "��ǰ ���� ����!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

	private void showAll() {
		//1.		
		//2.
		try {
			ArrayList<PdDTO> list=pdDao.selectAll();

			//3.
			String[][]data = new String[list.size()][3];
			for(int i=0;i<list.size();i++) {
				PdDTO dto=list.get(i);

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

	private void add() {
		//1. ����ڷκ��� �Է¹ޱ�
		String pdName=tfPdName.getText();
		String price=tfPrice.getText();

		//��ȿ�� �˻�
		if(pdName==null || pdName.isEmpty()) {
			JOptionPane.showMessageDialog(this, "��ǰ���� �Է��ϼ���");
			tfPdName.requestFocus();
			return;
		}

		//2. db�۾�
		PdDTO dto=new PdDTO();
		dto.setPdName(pdName);
		dto.setPrice(Integer.parseInt(price));
		try {
			int cnt=pdDao.insertPd(dto);

			//3. ��� ó��
			if(cnt>0) {
				JOptionPane.showMessageDialog(this, "��ǰ ��ϵǾ����ϴ�.");
				showAll();
			}else {
				JOptionPane.showMessageDialog(this, "��ǰ ��� ����!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}

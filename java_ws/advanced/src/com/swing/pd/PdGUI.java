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
	String[] colNames= {"번호","상품명","가격"};
//테스트
	private PdDAO pdDao;

	public PdGUI() {
		super("상품 관리");
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

		lbNo=new JLabel("번호");
		lbPdName=new JLabel("상품명");
		lbPrice=new JLabel("가격");

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

		table=new JTable();
		scrollPane=new JScrollPane();

		model.addColumn("번호");
		model.addColumn("상품명");
		model.addColumn("가격");

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
			JOptionPane.showMessageDialog(this, "상품명을 입력하세요.");
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
			JOptionPane.showMessageDialog(this, "번호가 선택되어야 합니다.");
			return;
		}

		//2.
		try {
			int cnt=pdDao.deletePd(Integer.parseInt(no));

			//3.
			if(cnt>0) {
				JOptionPane.showMessageDialog(this, "상품 삭제되었습니다.");
				showAll();
			}else {
				JOptionPane.showMessageDialog(this, "상품 삭제 실패!");
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
			JOptionPane.showMessageDialog(this, "번호가 선택되어야 합니다.");
			return;
		}else if(pdName==null || pdName.isEmpty()) {
			JOptionPane.showMessageDialog(this, "상품명을 입력하세요.");
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
				JOptionPane.showMessageDialog(this, "상품 수정되었습니다.");
				showAll();
			}else {
				JOptionPane.showMessageDialog(this, "상품 수정 실패!");
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
		//1. 사용자로부터 입력받기
		String pdName=tfPdName.getText();
		String price=tfPrice.getText();

		//유효성 검사
		if(pdName==null || pdName.isEmpty()) {
			JOptionPane.showMessageDialog(this, "상품명을 입력하세요");
			tfPdName.requestFocus();
			return;
		}

		//2. db작업
		PdDTO dto=new PdDTO();
		dto.setPdName(pdName);
		dto.setPrice(Integer.parseInt(price));
		try {
			int cnt=pdDao.insertPd(dto);

			//3. 결과 처리
			if(cnt>0) {
				JOptionPane.showMessageDialog(this, "상품 등록되었습니다.");
				showAll();
			}else {
				JOptionPane.showMessageDialog(this, "상품 등록 실패!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}

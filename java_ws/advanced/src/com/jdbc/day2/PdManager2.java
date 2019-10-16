package com.jdbc.day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Scanner;

import db.DBUtil;
import pd.model.PdDAO;
import pd.model.PdDTO;

public class PdManager2 {
	private Scanner sc = new Scanner(System.in);
	private PdDAO pdDao;
	
	public PdManager2(){
		pdDao=new PdDAO();
	}
	
	public void showMenu() {
		System.out.println("-----------------Main Menu-----------------");
		System.out.println("1.��� 2.��ü��ȸ 3.��ȣ�� ��ȸ 4.���� 5.���� 6.����");
		System.out.println("--------------------------------------------");		
	}

	public void register() throws SQLException {
		//���
		//1. ����ڷ� ���� �Է� �ޱ�
		System.out.println("��ǰ��, ������ �Է��ϼ���");
		String pdName=sc.nextLine();
		int price=Integer.parseInt(sc.nextLine());
		
		//2. db�۾� - insert
		PdDTO dto = new PdDTO();
		dto.setPdName(pdName);
		dto.setPrice(price);
		int cnt=pdDao.insertPd(dto);
		
		//3. ��� ó��
		String result=(cnt>0)?"��ǰ ��ϵǾ����ϴ�.":"��ǰ��� ����!";
		System.out.println(result);
	}

	public void showAll() throws SQLException {
		//��ü ��ȸ
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			//1.
			//2.
			con=DBUtil.getConnection();
			
			//3
			String sql="select * from pd order by no desc";
			ps=con.prepareStatement(sql);
			
			//4.
			rs=ps.executeQuery();
			while(rs.next()) {
				int no=rs.getInt("no");
				String pdName=rs.getString("pdName");
				int price=rs.getInt("price");
				Timestamp regdate=rs.getTimestamp("regdate");
				
				System.out.println(no+"\t"+pdName+"\t"+price+"\t"+regdate);
			}
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}
		
	}

	public void showByNo() throws NumberFormatException, SQLException {
		//��ȣ�� ��ȸ
		//1. ����ڷκ��� �Է¹ޱ�
		System.out.println("��ȣ�� �Է��ϼ���");
		String no=sc.nextLine();
		if(no==null || no.isEmpty()) {
			System.out.println("��ȣ�� �ݵ�� �Է��ؾ� ��!!!!!");
			return;
		}
		
		//2. db�۾� - select
		PdDTO dto=pdDao.selectByNo(Integer.parseInt(no));
		
		//3. ��� ó��
		System.out.println("\n��ȣ:"+ dto.getNo());
		System.out.println("��ǰ��:"+ dto.getPdName());
		System.out.println("����:"+ dto.getPrice());
		System.out.println("�����:"+ dto.getRegdate());
		
	}

	public void edit() {
		// TODO Auto-generated method stub
		
	}

	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
	
}

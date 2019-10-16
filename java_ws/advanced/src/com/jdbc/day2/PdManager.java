package com.jdbc.day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Scanner;

import db.DBUtil;

public class PdManager {
	private Scanner sc = new Scanner(System.in);
	
	public void showMenu() {
		System.out.println("-----------------Main Menu-----------------");
		System.out.println("1.��� 2.��ü��ȸ 3.��ȣ�� ��ȸ 4.���� 5.���� 6.����");
		System.out.println("--------------------------------------------");		
	}

	public void register() throws SQLException {
		//���
		System.out.println("��ǰ��, ������ �Է��ϼ���");
		String pdName=sc.nextLine();
		int price=Integer.parseInt(sc.nextLine());
		
		Connection con=null;
		PreparedStatement ps=null;	
		try {		
			//1.
			//2. con
			con=DBUtil.getConnection();
			
			//3. ps
			String sql="insert into pd(no, pdname, price)" + 
					"values(pd_seq.nextval, ?,?)";
			ps=con.prepareStatement(sql);
			
			//
			ps.setString(1, pdName);
			ps.setInt(2, price);
			
			//4. exec
			int cnt=ps.executeUpdate();
			System.out.println("�Էµ� ���� ����:"+ cnt);
		}finally {
			DBUtil.dbClose(ps, con);
		}		
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

	public void showByNo() {
		// TODO Auto-generated method stub
		
	}

	public void edit() {
		// TODO Auto-generated method stub
		
	}

	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
	
}

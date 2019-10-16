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
		System.out.println("1.등록 2.전체조회 3.번호로 조회 4.수정 5.삭제 6.종료");
		System.out.println("--------------------------------------------");		
	}

	public void register() throws SQLException {
		//등록
		System.out.println("상품명, 가격을 입력하세요");
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
			System.out.println("입력된 행의 개수:"+ cnt);
		}finally {
			DBUtil.dbClose(ps, con);
		}		
	}

	public void showAll() throws SQLException {
		//전체 조회
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

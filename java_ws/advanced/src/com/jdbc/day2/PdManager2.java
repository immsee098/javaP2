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
		System.out.println("1.등록 2.전체조회 3.번호로 조회 4.수정 5.삭제 6.종료");
		System.out.println("--------------------------------------------");		
	}

	public void register() throws SQLException {
		//등록
		//1. 사용자로 부터 입력 받기
		System.out.println("상품명, 가격을 입력하세요");
		String pdName=sc.nextLine();
		int price=Integer.parseInt(sc.nextLine());
		
		//2. db작업 - insert
		PdDTO dto = new PdDTO();
		dto.setPdName(pdName);
		dto.setPrice(price);
		int cnt=pdDao.insertPd(dto);
		
		//3. 결과 처리
		String result=(cnt>0)?"상품 등록되었습니다.":"상품등록 실패!";
		System.out.println(result);
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

	public void showByNo() throws NumberFormatException, SQLException {
		//번호로 조회
		//1. 사용자로부터 입력받기
		System.out.println("번호를 입력하세요");
		String no=sc.nextLine();
		if(no==null || no.isEmpty()) {
			System.out.println("번호는 반드시 입력해야 함!!!!!");
			return;
		}
		
		//2. db작업 - select
		PdDTO dto=pdDao.selectByNo(Integer.parseInt(no));
		
		//3. 결과 처리
		System.out.println("\n번호:"+ dto.getNo());
		System.out.println("상품명:"+ dto.getPdName());
		System.out.println("가격:"+ dto.getPrice());
		System.out.println("등록일:"+ dto.getRegdate());
		
	}

	public void edit() {
		// TODO Auto-generated method stub
		
	}

	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
	
}

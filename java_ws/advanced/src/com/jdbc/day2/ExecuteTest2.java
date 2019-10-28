package com.jdbc.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExecuteTest2 {

	public static void main(String[] args) {
		//execute() - insert, update, delete
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 전화번호 입력!");
		String name=sc.nextLine();
		String tel=sc.nextLine();
		
		Connection con=null;
		PreparedStatement ps=null;
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			
			//2. Connection객체 생성
			String url="jdbc:oracle:thin:@DESKTOP-BFLLBCO:1521:xe";
			String user="testuser", upwd="testuser123";
			con=DriverManager.getConnection(url, user, upwd);
			System.out.println("db연결 성공!");
			
			//3. PreparedStatement객체 생성
			String sql="insert into person(no, name, tel)" + 
					" values(person_seq.nextval, ?,?)";
			ps=con.prepareStatement(sql);
			
			//in parameter setting
			ps.setString(1, name);
			ps.setString(2, tel);
			
			//4. 실행
			boolean bool=ps.execute();
			System.out.println("insert, bool="+bool);
			
			int cnt=ps.getUpdateCount(); //처리된 행의 개수 리턴
			System.out.println("처리된 행의 개수:"+ cnt);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) ps.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}

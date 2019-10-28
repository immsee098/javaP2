package com.jdbc.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementTest {

	public static void main(String[] args) {
		//Statement 이용 - insert
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 전화번호 입력!");
		String name=sc.nextLine();
		String tel=sc.nextLine();
		
		Connection con=null;
		Statement st=null;
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩!");
			
			//2. db서버와 연결하기 위한 Connection객체 생성
			String url="jdbc:oracle:thin:@DESKTOP-BFLLBCO:1521:xe";
			String user="testuser", pwd="testuser123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db연결 성공!");
			
			//3. sql문장을 처리할 Statement객체 생성
			st=con.createStatement();
			
			//4. 실행
			String sql="insert into person(no, name, tel)" + 
				" values(person_seq.nextval, '"+name+"','"+tel+"')";
			int cnt=st.executeUpdate(sql);
			System.out.println("처리된 행의 개수:"+ cnt);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(st!=null) st.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}

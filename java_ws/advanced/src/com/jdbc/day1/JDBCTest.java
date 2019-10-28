package com.jdbc.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCTest {

	public static void main(String[] args) {
		//insert
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 전화번호 입력!");
		String name=sc.nextLine();
		String tel=sc.nextLine();
		
		Connection con=null;
		PreparedStatement ps=null;
		try {
			//1. 데이터베이스와 연결하는 드라이버 클래스 찾기(드라이버 로딩)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			
			//2. 데이터베이스 서버와 연결하기 위한 Connection객체 생성
			String url="jdbc:oracle:thin:@DESKTOP-BFLLBCO:1521:xe";
			String user="testuser", pwd="testuser123";
			con=DriverManager.getConnection(url,user,pwd);
			System.out.println("db연결 성공!");
			
			//3. sql문장을 처리할 PreparedStatement객체 생성
			String sql="insert into person(no, name, tel)" + 
					" values(person_seq.nextval, ?,?)";
			ps=con.prepareStatement(sql);
			
			//in parameter setting
			ps.setString(1, name);
			ps.setString(2, tel);
			
			//4. 실행
			int cnt=ps.executeUpdate();  //처리된 행의 개수 리턴
			System.out.println(cnt+"개 행이 입력됨!");
			
		}catch(ClassNotFoundException e) {
			System.out.println("class not found!");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("sql 예외!");
			e.printStackTrace();
		}finally {
			//5. 자원 반납, 접속 종료			
			try {
				if(ps!=null) ps.close();
				if(con!=null) con.close();
				//=> 생성한 것과 반대로 close한다
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}

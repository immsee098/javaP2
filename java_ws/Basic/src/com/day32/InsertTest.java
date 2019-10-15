package com.day32;

import java.sql.*;
import java.util.Scanner;
class InsertTest {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("이름 : ");
	String name=sc.nextLine();
	System.out.print("전화번호 : ");
	String tel=sc.nextLine();
	Connection conn=null;
	Statement stmt=null;
	try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			String url="jdbc:oracle:thin:@userpc:1521:orcl8";
			String user="javauser1", pwd="java";
			conn=DriverManager.getConnection(url, user, pwd);
			System.out.println("DB 연결됨!");
			stmt=conn.createStatement();
			String sql="insert into person(no, name, tel) values(person_seq.nextval,"
					+"'"+name+"', '"+tel+"')";
			int cnt=stmt.executeUpdate(sql);
			System.out.println(cnt+"개의 레코드가 입력됨!");
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
			} catch (SQLException e) {
			e.printStackTrace();
			}finally{
			try {
			if(stmt!=null) stmt.close();
			if(conn!=null)conn.close();
			} catch (SQLException e) {
			e.printStackTrace();
		}
		}
		}//main
	}
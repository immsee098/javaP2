package com.day32;

import java.sql.*;
import java.util.Scanner;
class InsertTest {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("�̸� : ");
	String name=sc.nextLine();
	System.out.print("��ȭ��ȣ : ");
	String tel=sc.nextLine();
	Connection conn=null;
	Statement stmt=null;
	try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����!");
			String url="jdbc:oracle:thin:@userpc:1521:orcl8";
			String user="javauser1", pwd="java";
			conn=DriverManager.getConnection(url, user, pwd);
			System.out.println("DB �����!");
			stmt=conn.createStatement();
			String sql="insert into person(no, name, tel) values(person_seq.nextval,"
					+"'"+name+"', '"+tel+"')";
			int cnt=stmt.executeUpdate(sql);
			System.out.println(cnt+"���� ���ڵ尡 �Էµ�!");
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
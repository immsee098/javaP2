package com.jdbc.day2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProcedureOut1 {

	public static void main(String[] args) {
		//out�Ű������� �ִ� ���� ���ν��� ó��
		/*
		 create or replace procedure infoProf_proc
			(v_profno   in professor.profno%type,
			v_name  out professor.name%type,
			v_pay out professor.pay%type)
			.....
		  */
		Connection con=null;
		CallableStatement cs=null;
		
		try {
			//1. 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. con
			String url="jdbc:oracle:thin:@DESKTOP-BFLLBCO:1521:xe";
			String user="hr", upwd="hr123";
			con=DriverManager.getConnection(url,user,upwd);

			//3. cs
			String sql="call infoProf_proc(?,?,?)";
			cs=con.prepareCall(sql);
			
			cs.setInt(1, 1001);
			cs.registerOutParameter(2, oracle.jdbc.OracleTypes.VARCHAR);
			cs.registerOutParameter(3, oracle.jdbc.OracleTypes.NUMBER);
			
			boolean bool=cs.execute();
			System.out.println("���� ���ν���, bool="+bool);
			
			String name=cs.getString(2);
			int pay=cs.getInt(3);
			
			System.out.println("\n---1001�� ������ ����---");
			System.out.println("name="+name);
			System.out.println("pay="+pay);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(cs!=null) cs.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		

	}

}

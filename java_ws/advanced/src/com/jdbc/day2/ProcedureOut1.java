package com.jdbc.day2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//create or replace procedure infoProf_proc 
//(
//v_profno in professor.profno%type, 
//v_name out professor.name%type,
//v_pay out professor.pay%type
//) 
//is 
//begin select name, 
//pay into v_name, 
//v_pay from professor where profno=v_profno; 
//end;
//사용

public class ProcedureOut1 {

	public static void main(String[] args) {
		
		Connection con = null;
		CallableStatement cs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩");
			
			String url = "jdbc:oracle:thin:@DESKTOP-IA9SFNU:1521:XE";
			String user ="testuser", upwd="testuser123";
			con = DriverManager.getConnection(url, user,upwd);
			
			String sql = "call infoProf_proc(?,?,?)";
			cs = con.prepareCall(sql);
			
			cs.setInt(1, 1001);
			cs.registerOutParameter(2, oracle.jdbc.OracleTypes.VARCHAR);
			cs.registerOutParameter(3, oracle.jdbc.OracleTypes.NUMBER);
			
			boolean bool = cs.execute();
			System.out.println("저장, bool="+bool);
			
			String name = cs.getString(2);
			int pay = cs.getInt(3);
			
			System.out.println("1001번째 교수정보");
			System.out.println("name="+name);
			System.out.println("pay="+pay);
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}

	}

}

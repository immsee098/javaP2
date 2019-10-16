package com.jdbc.day2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class ProcedureOut2 {

	public static void main(String[] args) {
		/*
		 create or replace procedure personList 
		 (personCursor out SYS_REFCURSOR) 
		 is 
		 begin 
		 	OPEN personCursor For 
		 	select no,name,tel from person 
		 	order by no desc; 
		 	end;
		 */
		Connection con = null;
		CallableStatement cs = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@DESKTOP-IA9SFNU:1521:XE";
			String user ="testuser", upwd="testuser123";
			con = DriverManager.getConnection(url, user,upwd);
			
			String sql = "call personList(?)";
			cs = con.prepareCall(sql);
			
			cs.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
			
			boolean bool = cs.execute();
			System.out.println("저장 프로시저, bool="+bool);
			
			rs = (ResultSet) cs.getObject(1);
			while(rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString(2);
				String tel = rs.getString(3);
				Timestamp regdate = rs.getTimestamp(4);
				
				System.out.println(no+"\t"+name+"\t"+tel+"\t"+regdate+"\t");
			}
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(cs != null) cs.close();
				if(con != null) con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

}

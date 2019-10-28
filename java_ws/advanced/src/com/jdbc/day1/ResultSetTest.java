package com.jdbc.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class ResultSetTest {

	public static void main(String[] args) {
		//ResultSet�� Ŀ�� �̵�
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			//1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			
			//2. db������ �����ϱ� ���� Connection��ü ����
			String url="jdbc:oracle:thin:@DESKTOP-BFLLBCO:1521:xe";
			String user="testuser", pwd="testuser123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db���� ����");
			
			//3. sql������ ó���� PreparedStatement��ü ����
			String sql="select * from person order by no";
			ps=con.prepareStatement(sql, 
					ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			
			//4. ����
			rs=ps.executeQuery();
			rs.afterLast(); //������ ���� ������ �̵�
			while(rs.previous()) {
				int no=rs.getInt(1);
				String name=rs.getString(2);
				String tel=rs.getString(3);
				Timestamp regdate=rs.getTimestamp(4);
				
				System.out.println(no+"\t"+name+"\t"+tel+"\t"+regdate);
			}
			
			rs.absolute(2);  //2��° ������ �̵�
			System.out.println("no:"+rs.getInt(1)
				+", name="+rs.getString(2));
			System.out.println("���� �� => "+rs.getRow());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(ps!=null) ps.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
		

	}

}

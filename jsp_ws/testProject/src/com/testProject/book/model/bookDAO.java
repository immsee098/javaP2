package com.testProject.book.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.testProject.db.ConnectionPoolMgr;

public class bookDAO {
	private ConnectionPoolMgr pool;
	
	public bookDAO() {
		System.out.println("bookDAO호출");
	}
	
	public void setPool(ConnectionPoolMgr pool) {
		this.pool = pool;
		
		System.out.println("setPool 호출");
	}
	
	public List<bookVO> selectAll() throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		
		List<bookVO>list = new ArrayList<bookVO>();
		
		try {
			con = pool.getConnection();
			String sql = "select * from book";
			ps=con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				int price = rs.getInt("price");
				String publisher = rs.getString("publisher");
				Timestamp joindate = rs.getTimestamp("joindate");
				
				bookVO vo = new bookVO(no, title, price, publisher, joindate);
				list.add(vo);
			}
			System.out.println("전체 결과 ="+list.size());
			
			return list;
		} finally {
			pool.dbClose(rs, ps, con);
		}
				
	}

}

package com.herbmall.comments.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.herbmall.db.ConnectionPoolMgr;

public class commentDAO {
	private ConnectionPoolMgr pool;
	
	public commentDAO() {
		pool = new ConnectionPoolMgr();
	}
	
	public int insertComment(commentVO vo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = pool.getConnection();
			
			String sql = "insert into comments\r\n" + 
						"values(comments_seq, ?, ?, ?, ?,?)";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getPwd());
			ps.setString(3, vo.getRegdate());
			ps.setString(4, vo.getContent());
			ps.setInt(5, vo.getBdno());
			
			int cnt = ps.executeUpdate();
			System.out.println("코멘트 등록 cnt="+cnt);
			
			return cnt;
			
		}finally {
			pool.dbClose(ps, con);
		}
	}

}

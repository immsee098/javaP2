//윤해서
package com.herbmall.comments.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.herbmall.db.ConnectionPoolMgr;

public class commentDAO {
	private ConnectionPoolMgr pool;
	
	public commentDAO() {
		pool = new ConnectionPoolMgr();
	}
	
	
	public List<commentVO> selectComment(int num) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<commentVO> list = new ArrayList<commentVO>();
		
		try {
			
			con = pool.getConnection();
			String sql = "select * from comments\r\n" + 
						"where bdno=?";
			
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, num);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String pwd = rs.getString("pwd");
				Timestamp regdate = rs.getTimestamp("regdate");
				String content = rs.getString("content");
				int bdno = rs.getInt("bdno");
				
				commentVO vo = new commentVO(no, name, pwd, regdate, content, bdno);
				list.add(vo);
			}
			
			return list;
			
		} finally {
			pool.dbClose(rs, ps, con);
		}
	}

}

package com.model.reservation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.model.db.ConnectionPoolMgr;

public class resvDAO {
	
	private ConnectionPoolMgr pool;
	
	public resvDAO() {
		pool = new ConnectionPoolMgr();
	}
	
	public List<resContentVO> getResNo(int s_no) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<resContentVO> list = new ArrayList<resContentVO>();
		
		try {
			con=pool.getConnection();
			String sql = "select * from rescontent where s_no=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, s_no);
			rs=ps.executeQuery();
			while(rs.next()) {
				int resNo = rs.getInt("resNo");
				int s_No = rs.getInt("s_no");
				int memno = rs.getInt("memNo");
				int petno = rs.getInt("petno");
				String str = rs.getString("confirm");
				char confirm = str.charAt(0);
				resContentVO vo = new resContentVO(resNo, s_No, memno, petno, confirm);				
				list.add(vo);		
			}

			return list;
			
		}finally{
			pool.dbClose(rs, ps, con);
		}
	}
	
	public resPlanVO selectAllPlan(int resno) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		resPlanVO resp = null;
		
		try {
			con = pool.getConnection();
			String sql = "select * from resplan where resno=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, resno);
			
			rs=ps.executeQuery();
			while(rs.next()) {
				int resCalNo = rs.getInt("resCalNo");
				Timestamp res_sdate = rs.getTimestamp("res_sdate");
				Timestamp res_edate = rs.getTimestamp("res_edate");
				Timestamp res_stime = rs.getTimestamp("res_stime");
				Timestamp res_etime = rs.getTimestamp("res_etime");
				int resNo = rs.getInt("resno");
				
				resPlanVO vo = new resPlanVO(resCalNo, res_sdate, res_edate, res_stime, res_etime, resNo);
				resp = vo;
			}

			return resp;
		} finally {
			pool.dbClose(rs, ps, con);
		}
	}
	
	
	public int updateDel(int resno) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = pool.getConnection();	
			
			String sql = "update rescontent "+ 
						"set confirm = 1"+
						" where resno=?";
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, resno);
			
			int cnt = ps.executeUpdate();
			
			return cnt;
		} finally {
			pool.dbClose(ps, con);	
		}
	}
	

}

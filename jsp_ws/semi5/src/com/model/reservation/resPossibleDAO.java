package com.model.reservation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.db.ConnectionPoolMgr;

public class resPossibleDAO {
	private ConnectionPoolMgr pool;
	
	public resPossibleDAO(){
		pool=ConnectionPoolMgr.getInstance();
	}
	
	public int insertRePos(resPossibleVO vo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = pool.getConnection();	
			
			String sql = "insert into respossible \r\n" + 
						"values(seq_respossible.nextval, ?, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			
			ps.setTimestamp(1, vo.getPlan_sdate());
			ps.setTimestamp(2, vo.getPlan_edate());
			ps.setTimestamp(3, vo.getPlan_stime());
			ps.setTimestamp(4, vo.getPlan_etime());
			ps.setInt(5, vo.getBoardno());
			
			int cnt = ps.executeUpdate();
			System.out.println("resPossible 작성 완료 vo="+vo);
			
			return cnt;
		} finally {
			pool.dbClose(ps, con);	
		}
	}
	
	public int updateRePos(resPossibleVO vo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = pool.getConnection();	
			
			String sql = "update respossible\r\n" + 
						"set plan_sdate=?, plan_edate=?, plan_stime=?, plan_etime=?\r\n" + 
						"where boardno=?";
			ps = con.prepareStatement(sql);
			
			ps.setTimestamp(1, vo.getPlan_sdate());
			ps.setTimestamp(2, vo.getPlan_edate());
			ps.setTimestamp(3, vo.getPlan_stime());
			ps.setTimestamp(4, vo.getPlan_etime());
			ps.setInt(5, vo.getBoardno());
			
			int cnt = ps.executeUpdate();
			System.out.println("resPossible 작성 완료 vo="+vo);
			
			return cnt;
		} finally {
			pool.dbClose(ps, con);	
		}
	}
	
	public resPossibleVO selectRes(int boardno) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		resPossibleVO vo = new resPossibleVO();
		
		try {
			con = pool.getConnection();		
			
			String sql = "select * from respossible where boardno=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, boardno);
			
			rs=ps.executeQuery();
			
			if(rs.next()) {
				vo.setBoardno(boardno);
				vo.setPlan_sdate(rs.getTimestamp("plan_sdate"));
				vo.setPlan_edate(rs.getTimestamp("plan_edate"));
				vo.setPlan_stime(rs.getTimestamp("plan_stime"));
				vo.setPlan_etime(rs.getTimestamp("plan_etime"));
			}
			return vo;
			
		} finally {
			pool.dbClose(rs, ps, con);
		}
	}

}

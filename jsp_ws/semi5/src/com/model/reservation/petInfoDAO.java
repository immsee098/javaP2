package com.model.reservation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.db.ConnectionPoolMgr;

public class petInfoDAO {
	private ConnectionPoolMgr pool;
	
	public petInfoDAO() {
		pool = new ConnectionPoolMgr();
	}
	
	public petInfoVO selectByPetNo(int petno) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		petInfoVO vo = new petInfoVO();
		
		
		try {
			con = pool.getConnection();	
			String sql = "select * from petInfo where petno=?";
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, petno);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				vo.setPetno(rs.getInt("petno"));
				vo.setPetname(rs.getString("petname"));
				vo.setPettype(rs.getInt("pettype"));
				vo.setPetage(rs.getString("petage"));
				vo.setPetphoto(rs.getString("petphoto"));
				vo.setPetgender(rs.getInt("petgender"));
				vo.setPetweight(rs.getInt("petweight"));
				vo.setPetetc(rs.getString("petetc"));
				vo.setMemno(rs.getInt("memno"));
			}
			System.out.println("펫 정보 조회 결과 vo="+vo);
			return vo;
			
		} finally {
			pool.dbClose(rs, ps, con);
		}
	}
	
	public String selectPetName(int petno) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		petInfoVO vo = new petInfoVO();
		
		try {			
			con = pool.getConnection();
			String sql = "select petname from petInfo where petno=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, petno);
			rs = ps.executeQuery();
			while(rs.next()) {
				vo.setPetname(rs.getString("petname"));
			}
			
			System.out.println("펫 이름 조회 결과 ="+vo.getPetname());
			return vo.getPetname();
			
		} finally {
			pool.dbClose(rs, ps, con);
		}
		
	}

}

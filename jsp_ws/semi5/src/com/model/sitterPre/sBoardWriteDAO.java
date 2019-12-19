package com.model.sitterPre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.db.ConnectionPoolMgr;

public class sBoardWriteDAO {
	private ConnectionPoolMgr pool;
	
	public sBoardWriteDAO() {
		pool= new ConnectionPoolMgr();
	}
	
	//boardno가 없으면 insert 있으면 update
	//위를 위해 조회 매서드
	
	public sBoardVO selectByNo(int memno) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		sBoardVO vo = new sBoardVO();
		
		try {
			con = pool.getConnection();
			String sql = "select * from sBoard where memno=?";
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, memno);
			
			rs=ps.executeQuery();
			while(rs.next()) {
				vo.setBoardno(rs.getInt("boardno"));
				vo.setBoardtitle(rs.getString("boardtitle"));
				vo.setPhoto(rs.getString("photo"));
				vo.setArea(rs.getString("area"));
				vo.setAddress(rs.getString("address"));
				vo.setPettype(rs.getInt("pettype"));
				vo.setPrice(rs.getInt("price"));
				vo.setBoardetc(rs.getString("boardetc"));
				vo.setMemno(rs.getInt("memno"));
				vo.setRegdate(rs.getTimestamp("regdate"));
			}
			System.out.println("구직글 조회 결과 vo="+vo);
			return vo;
		} finally {
			pool.dbClose(rs, ps, con);
		}
	}
	
	public int InsertSBoard(sBoardVO vo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = pool.getConnection();	
			String sql ="insert into sBoard values(seq_sBoard.nextval, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";
			ps =con.prepareStatement(sql);
			
			ps.setString(1, vo.getBoardtitle());
			ps.setString(2, vo.getPhoto());
			ps.setString(3, vo.getArea());
			ps.setString(4, vo.getAddress());
			ps.setInt(5, vo.getPettype());
			ps.setInt(6, vo.getPrice());
			ps.setString(7, vo.getBoardetc());
			ps.setInt(8, vo.getMemno());
			
			int cnt = ps.executeUpdate();
			System.out.println("글 등록 결과 cnt="+cnt);
			return cnt;
			
		} finally {
			pool.dbClose(ps, con);
		}
	}
	
	public int UpdateSBoard(sBoardVO vo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = pool.getConnection();	
			String sql ="update sBoard\r\n" + 
					"set boardtitle=?, photo=?, area=?, address=?, pettype=?, price=?, boardetc=?\r\n" + 
					"where memno=?";
			
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getBoardtitle());
			ps.setString(2, vo.getPhoto());
			ps.setString(3, vo.getArea());
			ps.setString(4, vo.getAddress());
			ps.setInt(5, vo.getPettype());
			ps.setInt(6, vo.getPrice());
			ps.setString(7, vo.getBoardetc());
			ps.setInt(8, vo.getMemno());
			
			int cnt = ps.executeUpdate();
			System.out.println("글 등록 결과 cnt="+cnt);
			return cnt;
			
		} finally {
			pool.dbClose(ps, con);
		}
	}

	public int UpdateNoPhoto(sBoardVO vo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = pool.getConnection();	
			String sql ="update sBoard\r\n" + 
					"set boardtitle=?, area=?, address=?, pettype=?, price=?, boardetc=?\r\n" + 
					"where memno=?";
			
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getBoardtitle());
			ps.setString(2, vo.getArea());
			ps.setString(3, vo.getAddress());
			ps.setInt(4, vo.getPettype());
			ps.setInt(5, vo.getPrice());
			ps.setString(6, vo.getBoardetc());
			ps.setInt(7, vo.getMemno());
			
			int cnt = ps.executeUpdate();
			System.out.println("글 등록 결과 cnt="+cnt);
			return cnt;
			
		} finally {
			pool.dbClose(ps, con);
		}
	}

}

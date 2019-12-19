package com.model.mypage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.model.db.ConnectionPoolMgr;

import sun.security.action.GetIntegerAction;

public class sDiaryDAO {
	
	private ConnectionPoolMgr pool;

	public sDiaryDAO() {
		pool=new ConnectionPoolMgr();
	}
	
	//시터가 글쓰기
	public int insertDiary(sDiaryVO vo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = pool.getConnection();
			String sql= "insert into sDiary(d_no, s_no, petname, d_content, d_photo, memno, petno)" + 
						"values (seq_sDiary.nextval, ?, ?, ?, ?, ?, ?)";
			
			ps=con.prepareStatement(sql);
			ps.setInt(1, vo.getS_No());
			ps.setString(2, vo.getPetName());
			ps.setString(3, vo.getD_content());
			ps.setString(4, vo.getD_photo());
			ps.setInt(5, vo.getMemNo());
			ps.setInt(6, vo.getPetNo());
			
			int cnt = ps.executeUpdate();
			System.out.println("글 등록 결과 cnt="+cnt);
			return cnt;
			
		}finally {
			pool.dbClose(ps, con);
		}
		
	}
	
	public List<sDiaryVO> selectAllS(int s_no) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<sDiaryVO> list = new ArrayList<sDiaryVO>();
		
		try {
			con = pool.getConnection();
			String sql = "select * from sDiary where s_no=? order by d_no desc";
			ps=con.prepareStatement(sql);
			ps.setInt(1, s_no);
			
			rs=ps.executeQuery();
			while(rs.next()) {
				int d_No = rs.getInt("d_No");
				int s_No = rs.getInt("s_No");
				String petName = rs.getString("petName");
				String d_content = rs.getString("d_content");
				String d_photo = rs.getString("d_photo");
				Timestamp d_date = rs.getTimestamp("d_date");
				int memNo = rs.getInt("memNo");
				int petNo = rs.getInt("petNo");
				
				sDiaryVO vo = new sDiaryVO(d_No, s_No, petName, d_content, d_photo, d_date, memNo, petNo);
				
				list.add(vo);	
			}
			System.out.println("내가 쓴 글 size="+list.size()+", 시터 넘버="+s_no);
			
			return list;
			
		} finally {
			pool.dbClose(rs, ps, con);
		}
	}
	
	
	public sDiaryVO selectOneDi(int d_no) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		sDiaryVO vo = new sDiaryVO();
		
		try {
			con = pool.getConnection();
			String sql = "select * from sDiary where d_no=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, d_no);
			
			rs=ps.executeQuery();
			while(rs.next()) {
				int d_No = rs.getInt("d_No");
				int s_No = rs.getInt("s_No");
				String petName = rs.getString("petName");
				String d_content = rs.getString("d_content");
				String d_photo = rs.getString("d_photo");
				Timestamp d_date = rs.getTimestamp("d_date");
				int memNo = rs.getInt("memNo");
				int petNo = rs.getInt("petNo");
				
				vo = new sDiaryVO(d_No, s_No, petName, d_content, d_photo, d_date, memNo, petNo);
			}		
			return vo;
			
		} finally {
			pool.dbClose(rs, ps, con);
		}
	}
	

}

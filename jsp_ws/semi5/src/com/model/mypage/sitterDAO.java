package com.model.mypage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.model.db.ConnectionPoolMgr;

public class sitterDAO {
	private ConnectionPoolMgr pool;

	public sitterDAO() {
		pool=new ConnectionPoolMgr();
	}
	
	public memberVO selectByNo(int memno) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		memberVO vo = new memberVO();
		
		try {
			con=pool.getConnection();	
			String sql="select * from member where memno=?";
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, memno);
			rs=ps.executeQuery();
			while(rs.next()) {
				vo.setMemNo(rs.getInt("memno"));
				vo.setId("id");
				vo.setPwd(rs.getString("pwd"));
				vo.setMemName(rs.getString("memname"));
				vo.setPhoneNum(rs.getString("phonenum"));
				vo.setEmail(rs.getString("email"));
				vo.setZipcode("zipcode");
				vo.setAddress(rs.getString("address"));
				vo.setAddressDetail("addressDetail");
				vo.setCareer(rs.getInt("career"));
				vo.setS_PetType(rs.getInt("s_pettype"));
				vo.setS_CatCount(rs.getInt("s_catcount"));
				vo.setS_DogCount(rs.getInt("s_dogcount"));
				vo.setS_Score(rs.getFloat("s_score"));
				vo.setS_No(rs.getInt("s_no"));
				vo.setOutdate(rs.getString("outdate"));
			}
			
			System.out.println("멤버 정보 조회 결과 vo="+vo);
			return vo;
		} finally {
			pool.dbClose(rs, ps, con);
		}
		
	}
	
	

}

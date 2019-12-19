package com.model.pet.copy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.db.ConnectionPoolMgr;
import com.model.mypage.memberVO;

public class petInfoDAO {
	
	private ConnectionPoolMgr pool;
	
	public petInfoDAO(){
		pool=ConnectionPoolMgr.getInstance();
	}
	
	public int insertPetInfo(petInfoVO vo) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2
			con=pool.getConnection();
			
			//3
			String sql="insert into petinfo" + 
					" values(seq_petinfo.nextval,?,?,?,?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, vo.getPetName());
			ps.setInt(2, vo.getPetType());
			ps.setString(3, vo.getPetAge());
			ps.setString(4, vo.getPetPhoto());
			ps.setInt(5, vo.getPetGender());
			ps.setInt(6, vo.getPetWeight());
			ps.setString(7, vo.getPetEtc());
			ps.setInt(8, vo.getMemNo());
			
			//4
			int cnt=ps.executeUpdate();
			System.out.println("æ˜µ•¿Ã∆Æ øœ∑· cnt="+cnt+",  vo="+vo);
			
			return cnt;
		}finally {
			pool.dbClose(ps, con);
		}
	}
	
	public List<petInfoVO> selectAll(int memNo) throws SQLException{
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		List<petInfoVO> list=new ArrayList<petInfoVO>();
		try {
			//1,2
			con=pool.getConnection();
			
			//3.
			String sql="select * from petinfo where memno=? order by petno";
			
			ps=con.prepareStatement(sql);
			ps.setInt(1, memNo);
			
			//4
			rs=ps.executeQuery();

			while(rs.next()) {
				int petNo=rs.getInt("petNo");
				String petName=rs.getString("petName");
				int petType=rs.getInt("petType");
				String petAge=rs.getString("petAge");
				String petPhoto=rs.getString("petPhoto");
				int petGender=rs.getInt("petGender");
				int petWeight=rs.getInt("petWeight");
				String petEtc=rs.getString("petEtc");
				
				petInfoVO vo = new petInfoVO(petNo,petName,petType,
						petAge,petPhoto,petGender,
						petWeight,petEtc,memNo);
				
				list.add(vo);
			}
			System.out.println("Í∏??†ÑÏ≤? Ï°∞Ìöå Í≤∞Í≥º list.size="+list.size());
			
			return list;
		}finally {
			pool.dbClose(rs, ps, con);
		}
	}
	
	public petInfoVO selectPet(String petNo) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		petInfoVO petInfoVo=new petInfoVO();
		try {
			con=pool.getConnection();
			
			String sql="select * from petInfo" + 
					" where petNo=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, petNo);
			
			rs=ps.executeQuery();
			
			if(rs.next()) {
				petInfoVo.setPetName(rs.getString("petName"));					
				petInfoVo.setPetType(rs.getInt("petType"));					
				petInfoVo.setPetAge(rs.getString("petAge"));
				petInfoVo.setPetPhoto(rs.getString("petPhoto"));
				petInfoVo.setPetGender(rs.getInt("petGender"));	
				petInfoVo.setPetWeight(rs.getInt("petWeight"));	
				petInfoVo.setPetEtc(rs.getString("petEtc"));
				petInfoVo.setPetNo(rs.getInt("petNo"));
				
			}
			System.out.println("Î∞òÎ†§?èôÎ¨ºÏ†ïÎ≥? Ï°∞Ìöå Í≤∞Í≥º vo="+petInfoVo
					+",Îß§Í∞úÎ≥??àòpetNo="+petNo);
			
			return petInfoVo;
		}finally {
			pool.dbClose(rs, ps, con);
		}
	}
	
	public int updatePet(petInfoVO vo) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2
			con=pool.getConnection();
			
			//3
			String sql="update petinfo"
					+ " set petType=?, petAge=?, petPhoto=?, petWeight=?, petEtc=?"
					+ " where petNo=?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, vo.getPetType());
			ps.setString(2, vo.getPetAge());
			ps.setString(3, vo.getPetPhoto());
			ps.setInt(4, vo.getPetWeight());
			ps.setString(5, vo.getPetEtc());
			ps.setInt(6, vo.getPetNo());
			
			//4
			int cnt=ps.executeUpdate();
			System.out.println("Î∞òÎ†§?èôÎ¨ºÏ†ïÎ≥? ?àò?†ï Í≤∞Í≥º cnt="+cnt+", Îß§Í∞úÎ≥??àò vo="+vo);
			
			return cnt;
		}finally {
			pool.dbClose(ps, con);
		}
	}
}

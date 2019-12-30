package com.ez.herb.member.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOMybatis implements MemberDAO{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private String namespace="config.mybatis.mapper.oracle.member.";
	
	public int insertMember(MemberVO vo) {
		int cnt=sqlSession.insert(namespace+"insertMember", vo);
		return cnt;
	}
	
	public int duplicateUserid(String userid){
		return sqlSession.selectOne(namespace+"selectDup", userid);
	}
	
	public String selectPwd(String userid){
		return sqlSession.selectOne(namespace+"selectPwd", userid);
	}
	
	/*
	public MemberVO selectMember(String userid) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		MemberVO memberVo=new MemberVO();
		try {
			con=pool.getConnection();
			
			String sql="select * from member" + 
					" where userid=? and outdate is null";
			ps=con.prepareStatement(sql);
			ps.setString(1, userid);
			
			rs=ps.executeQuery();
			if(rs.next()) {
				memberVo.setAddress(rs.getString("address"));
				memberVo.setAddressDetail(rs.getString("addressDetail"));
				memberVo.setEmail(rs.getString("email"));
				memberVo.setHp(rs.getString("hp"));
				memberVo.setMileage(rs.getInt("mileage"));
				memberVo.setNo(rs.getInt("no"));
				memberVo.setName(rs.getString("name"));
				memberVo.setPwd(rs.getString("pwd"));
				memberVo.setZipcode(rs.getString("zipcode"));
				memberVo.setUserid(userid);
				memberVo.setOutdate(rs.getTimestamp("outdate"));
				memberVo.setRegdate(rs.getTimestamp("regdate"));					
			}
			System.out.println("회원정보 조회 결과 vo="+memberVo
					+",매개변수 userid="+userid);
			
			return memberVo;
		}finally {
			pool.dbClose(rs, ps, con);
		}
		
	}
	
	public int updateMember(MemberVO vo) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2
			con=pool.getConnection();
			
			//3
			String sql="update member"
					+ " set email=?, hp=?, zipcode=?, address=?,"
					+ " addressDetail=?" + 
					" where userid=?";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, vo.getEmail());
			ps.setString(2, vo.getHp());
			ps.setString(3, vo.getZipcode());
			ps.setString(4, vo.getAddress());
			ps.setString(5, vo.getAddressDetail());
			ps.setString(6, vo.getUserid());
			
			//4
			int cnt=ps.executeUpdate();
			System.out.println("회원정보 수정 결과 cnt="+cnt+", 매개변수 vo="+vo);
			
			return cnt;
		}finally {
			pool.dbClose(ps, con);
		}
	}
	
	public int withdrawMember(String userid) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2
			con=pool.getConnection();
			
			//3
			String sql="update member"
					+ " set outdate=sysdate" + 
					" where userid=?";
			ps=con.prepareStatement(sql);
						
			ps.setString(1, userid);
			
			//4
			int cnt=ps.executeUpdate();
			System.out.println("회원탈퇴 결과 cnt="+cnt+", 매개변수 userid="
					+userid);
			
			return cnt;
		}finally {
			pool.dbClose(ps, con);
		}
	}
	*/
	
	
}





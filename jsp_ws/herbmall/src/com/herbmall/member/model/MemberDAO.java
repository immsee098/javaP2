package com.herbmall.member.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.herbmall.db.ConnectionPoolMgr;

public class MemberDAO {
	private ConnectionPoolMgr pool;
	
	public MemberDAO(){
		pool=new ConnectionPoolMgr();
	}
	
	public int insertMember(MemberVO vo) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2
			con=pool.getConnection();
			
			//3
			String sql="insert into member(no, userid, name, pwd, "
					+ "email, hp, zipcode, address,addressDetail )" + 
					" values(member_seq.nextval, ?,?,?,?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, vo.getUserid());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getPwd());
			ps.setString(4, vo.getEmail());
			ps.setString(5, vo.getHp());
			ps.setString(6, vo.getZipcode());
			ps.setString(7, vo.getAddress());
			ps.setString(8, vo.getAddressDetail());
			
			//4
			int cnt=ps.executeUpdate();
			System.out.println("회원가입 결과 cnt="+cnt+", 매개변수 vo="+vo);
			
			return cnt;
		}finally {
			pool.dbClose(ps, con);
		}
	}
	
	/**
	 * 아이디 중복확인
	 * @param userid
	 * @return
	 * @throws SQLException 
	 */
	public int duplicateUserid(String userid) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
				
		try {
			con=pool.getConnection();
		
			String sql="select count(*) from member" + 
					" where userid=?";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, userid);
			
			rs=ps.executeQuery();
			
			int result=0;
			if(rs.next()) {
				int count=rs.getInt(1);
				System.out.println(count);
				if(count>0) {  //해당 아이디 이미 존재
					result=MemberService.EXIST_ID;
				}else { //사용가능
					result=MemberService.USEFUL_ID;
				}
			}
			System.out.println("아이디 중복확인 결과 result="+result);
			
			return result;
		}finally {
			pool.dbClose(rs, ps, con);
		}
	}
	
}





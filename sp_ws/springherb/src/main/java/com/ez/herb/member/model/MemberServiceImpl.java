package com.ez.herb.member.model;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberDAO memberDao;
			
	public int insertMember(MemberVO vo) {
		int cnt=memberDao.insertMember(vo);
		return cnt;
	}
	
	/*
	public int duplicateUserid(String userid) throws SQLException {
		return memberDao.duplicateUserid(userid);
	}
	
	public int loginCheck(String userid, String pwd) throws SQLException {
		return memberDao.loginCheck(userid, pwd);
	}
		
	public MemberVO selectMember(String userid) throws SQLException {
		return memberDao.selectMember(userid);
	}
		
	public int updateMember(MemberVO vo) throws SQLException {
		return memberDao.updateMember(vo);
	}
		
	public int withdrawMember(String userid) throws SQLException {
		return memberDao.withdrawMember(userid);
	}
		*/
}










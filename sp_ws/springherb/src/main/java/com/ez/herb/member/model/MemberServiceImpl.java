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
	
	
	public int duplicateUserid(String userid) {
		int result=0;
		
		int count=memberDao.duplicateUserid(userid);
		if(count>0) {
			result=EXIST_ID; //해당 아이디 이미 존재
		}else {
			result=USEFUL_ID; //사용가능
		}
		
		return result;
	}
	
	public int loginCheck(String userid, String pwd){
		String dbPwd = memberDao.selectPwd(userid);
		
		int result=0;
		String dbPwd2 = memberDao.selectPwd(userid);
		if(dbPwd2==null || dbPwd2.isEmpty()) {
			result=ID_NONE;
		} 
		
		return result;
	}
	
	/*
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










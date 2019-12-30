package com.ez.herb.member.model;

public interface MemberDAO {
	public int insertMember(MemberVO vo);
	public int duplicateUserid(String userid);
	public String selectPwd(String userid);
	
}

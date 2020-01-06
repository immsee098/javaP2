package com.ez.herb.admin.manager.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ez.herb.member.model.MemberService;

@Service
public class ManagerServiceImpl implements ManagerService{
	@Autowired
	private ManagerDAO managerDao;
	
	@Override
	public List<Map<String, Object>> selectAuth() {
		return managerDao.selectAuth();
	}

	@Override
	public int selectDup(String userid) {		
		int count=managerDao.selectDup(userid);
		
		if(count>0) { //이미 존재
			return MemberService.EXIST_ID;
		}else { //사용 가능
			return MemberService.USEFUL_ID;
		}
	}

	@Override
	public int insertManager(ManagerVO vo) {
		return managerDao.insertManager(vo);
	}

	@Override
	public int loginCheck(String userid, String pwd) {
		String dbPwd=managerDao.selectPwd(userid);
		
		int result=0;
		if(dbPwd==null || dbPwd.isEmpty()) {
			result=MemberService.NONE_USERID;
		}else {
			if(dbPwd.equals(pwd)) {
				result=MemberService.LOGIN_OK;
			}else {
				result=MemberService.DISAGREE_PWD;
			}
		}
		
		return result;
	}

	
}

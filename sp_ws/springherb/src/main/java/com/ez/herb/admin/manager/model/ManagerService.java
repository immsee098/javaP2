package com.ez.herb.admin.manager.model;

import java.util.List;
import java.util.Map;

public interface ManagerService {
	List<Map<String, Object>> selectAuth();
	int selectDup(String userid);
	int insertManager(ManagerVO vo);
	int loginCheck(String userid, String pwd);
	
}

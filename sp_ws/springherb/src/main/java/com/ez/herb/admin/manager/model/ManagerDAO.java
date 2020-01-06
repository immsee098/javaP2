package com.ez.herb.admin.manager.model;

import java.util.List;
import java.util.Map;

public interface ManagerDAO {
	List<Map<String, Object>> selectAuth();
	int selectDup(String userid);
	int insertManager(ManagerVO vo);
	String selectPwd(String userid);
	
}

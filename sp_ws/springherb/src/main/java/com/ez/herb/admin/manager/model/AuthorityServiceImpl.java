package com.ez.herb.admin.manager.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityServiceImpl implements AuthorityService {
	
	@Autowired
	private AuthorityDAO authorityDao;

	public List<AuthorityVO> selectAuth() {
		List<AuthorityVO> list = authorityDao.selectAuth();
		return list;
	}

}

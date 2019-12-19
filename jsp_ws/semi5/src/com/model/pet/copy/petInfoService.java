package com.model.pet.copy;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class petInfoService {
	petInfoDAO petInfoDao=new petInfoDAO();
	
	public int insertPetInfo(petInfoVO vo) throws SQLException {
		int cnt=petInfoDao.insertPetInfo(vo);
		return cnt;
	}
	
	public List<petInfoVO> selectAll(int memNo) throws SQLException{
		List<petInfoVO> list=petInfoDao.selectAll(memNo);
		return list;
	}
	
	public petInfoVO selectPet(String petNo) throws SQLException {
		return petInfoDao.selectPet(petNo);
	}
	
	public int updatePet(petInfoVO vo) throws SQLException {
		int cnt=petInfoDao.updatePet(vo);
		return cnt;
	}
}

package com.ez.herb.zipcode.model;

import java.sql.SQLException;
import java.util.List;

public class ZipcodeServiceImpl {
	private ZipcodeDAO zipcodeDao;
	
	public ZipcodeService() {
		zipcodeDao=new ZipcodeDAO();
	}
	
	public List<ZipcodeVO> selectZipcode(String dong) throws SQLException{
		return zipcodeDao.selectZipcode(dong);
	}
		
	
}




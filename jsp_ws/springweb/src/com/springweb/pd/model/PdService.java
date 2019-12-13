package com.springweb.pd.model;

import java.sql.SQLException;
import java.util.List;

public class PdService {
	private PdDAO pdDao;
	
	public PdService() {
		System.out.println("PdService 생성자 호출");
	}
	
	//DI - setter에 의한 종속객체 주입
	public void setPdDao(PdDAO pdDao) {
		this.pdDao = pdDao;
		
		System.out.println("PdService-setPdDao() 호출!");
	}

	public int insertPd(PdDTO dto) throws SQLException {
		return pdDao.insertPd(dto);
	}
	
	/**
	 * 상품 전체 조회 메서드
	 * @return
	 * @throws SQLException
	 */
	public List<PdDTO> selectAll() throws SQLException{
		return pdDao.selectAll();
	}

	/**
	 * 상품 상세보기 조회 메서드
	 * @param no
	 * @return
	 * @throws SQLException
	 */
	public PdDTO selectByNo(int no) throws SQLException {
		return pdDao.selectByNo(no);
	}
	
	/**
	 * 상품 수정 메서드
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	public int updatePd(PdDTO dto) throws SQLException {
		return pdDao.updatePd(dto);
	}
	
	public int deletePd(int no) throws SQLException {
		return pdDao.deletePd(no);
	}
	
}

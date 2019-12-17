package com.my.pd.model;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PdDAOImpl implements PdDAO{
	private String namespace="com.mybatis.mapper.pd.";
	
	@Autowired
	private SqlSessionTemplate sqlSession;
		
	public int insertPd(PdDTO dto){
		System.out.println("insertPd() dto="+dto);
				
		int cnt=sqlSession.insert(namespace+"insertPd", dto);
		System.out.println("insert후 파라미터 dto="+dto);
		
		return cnt;		
	}
	
	
	public List<PdDTO> selectAll(Map<String, String> map){
		List<PdDTO> list
			=sqlSession.selectList(namespace+"selectAll", map);
		
		return list;		
	}

	
	public PdDTO selectByNo(int no){
		PdDTO pdDto
			=sqlSession.selectOne(namespace+"selectByNo", no);
		return pdDto;	
	}
	
	
	public int updatePd(PdDTO dto) {
		int cnt=sqlSession.update(namespace+"updatePd", dto);
		
		return cnt;		
	}
	
	public int deletePd(int no) {
		int cnt=sqlSession.delete(namespace+"deletePd", no);
		return cnt;	
	}
	
	
	
	
}








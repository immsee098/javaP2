package com.mybatisweb.pd.model;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.AbstractRepository;
import com.mybatisweb.cmt.model.CommentVO;

public class PdDAOImpl extends AbstractRepository implements PdDAO{
	private String namespace="com.mybatis.mapper.pd.";
	private SqlSession sqlSession;
	
	public PdDAOImpl(){
		System.out.println("PdDAO 생성자 호출");
	}	

	public int insertPd(PdDTO dto){
		System.out.println("insertPd() dto="+dto);
		
		sqlSession=getSqlSessionFactory().openSession();
		
		try {
			int cnt=sqlSession.insert(namespace+"insertPd", dto);
			System.out.println("insert후 파라미터 dto="+dto);
			
			if(cnt>0) {
				sqlSession.commit();
			}
			
			return cnt;
		}finally {
			sqlSession.close();
		}
	}
	
	
	public List<PdDTO> selectAll(Map<String, String> map){
		sqlSession=getSqlSessionFactory().openSession();
		
		try {
			List<PdDTO> list
				=sqlSession.selectList(namespace+"selectAll", map);
			
			return list;
		}finally {
			sqlSession.close();
		}
	}

	
	public PdDTO selectByNo(int no){
		sqlSession=getSqlSessionFactory().openSession();
		
		try {
			PdDTO pdDto
				=sqlSession.selectOne(namespace+"selectByNo", no);
			return pdDto;
		}finally {
			sqlSession.close();
		}
	}
	
	
	public int updatePd(PdDTO dto) {
		sqlSession=getSqlSessionFactory().openSession();
		
		try {
			int cnt=sqlSession.update(namespace+"updatePd", dto);
			if(cnt>0) {
				sqlSession.commit();
			}
			
			return cnt;
		}finally {
			sqlSession.close();
		}
	}
	
	public int deletePd(int no) {
		sqlSession=getSqlSessionFactory().openSession();
		
		try {
			int cnt=sqlSession.delete(namespace+"deletePd", no);
			if(cnt>0) {
				sqlSession.commit();
			}
			
			return cnt;
		}finally {
			sqlSession.close();
		}
	}
	
	
	public List<CommentVO> selectCmtAll(){
		sqlSession=getSqlSessionFactory().openSession();
		
		try {
			List<CommentVO> list=sqlSession.selectList("selectCmtAll3");
	
			return list;
		}finally {
			sqlSession.close();
		}
	}
	
	
}








package com.ez.herb.board.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ez.herb.common.SearchVO;

@Repository
public class BoardDAOMybatis implements BoardDAO{
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private String namespace="config.mybatis.mapper.oracle.board.";
	
	public int insertBoard(BoardVO vo) {
		int cnt=sqlSession.insert(namespace+"insertBoard", vo);
		return cnt;
	}
	
	public List<BoardVO> selectAll(SearchVO searchVo){
		List<BoardVO> list
			=sqlSession.selectList(namespace+"selectAll", searchVo);
		
		return list;
	}
	
	public int updateReadCount(int no){
		int cnt=sqlSession.update(namespace+"updateReadCount", no);
		return cnt;
	}
	
	public BoardVO selectByNo(int no){
		BoardVO vo=sqlSession.selectOne(namespace+"selectByNo", no);
		return vo;
	}
	
	public int updateBoard(BoardVO vo){
		int cnt=sqlSession.update(namespace+"updateBoard", vo);
		return cnt;
	}

	@Override
	public String selectPwd(int no) {
		String pwd=sqlSession.selectOne(namespace+"selectPwd", no);
		return pwd;
	}
	
	public int deleteBoard(int no) {
		return sqlSession.delete(namespace+"deleteBoard", no);
	}

	@Override
	public int selectTotalRecord(SearchVO searchVo) {
		return sqlSession.selectOne(namespace+"selectTotalRecord",
				searchVo);
	}
	
	
	
/*
	public List<BoardVO> selectMainNotice() throws SQLException{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		List<BoardVO> list=new ArrayList<BoardVO>();		
		try {
			con=pool.getConnection();
			
			String sql="select *" + 
					" from" + 
					" (" + 
					"    select * from board order by no desc" + 
					" )" + 
					" where rownum<=6";
			ps=con.prepareStatement(sql);
			
			rs=ps.executeQuery();
			while(rs.next()) {
				int no=rs.getInt("no");
				int readcount=rs.getInt("readcount");
				String name=rs.getString("name");
				String title=rs.getString("title");
				String pwd=rs.getString("pwd");
				String email=rs.getString("email");
				String content=rs.getString("content");
				Timestamp regdate=rs.getTimestamp("regdate");
				
				BoardVO vo = new BoardVO(no, name, pwd, title, email, 
						regdate, readcount, content);
				
				list.add(vo);
			}
			System.out.println("최근 공지사항 조회 결과 list.size="
					+list.size());
			
			return list;
		}finally {
			pool.dbClose(rs, ps, con);
		}
	}
	
	*/
}









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
	
	/*
	public int updateBoard(BoardVO vo) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2
			con=pool.getConnection();
			
			String sql="update board"
					+ " set name=?, title=?, email=?,content=?"
					+ " where no=? and pwd=?";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getTitle());
			ps.setString(3, vo.getEmail());
			ps.setString(4, vo.getContent());
			ps.setInt(5, vo.getNo());
			ps.setString(6, vo.getPwd());
			
			int cnt=ps.executeUpdate();
			System.out.println("글 수정  결과 cnt="+cnt+", 매개변수 vo="+vo);
			
			return cnt;
		}finally {
			pool.dbClose(ps, con);
		}
	}
	
	public int deleteBoard(int no, String pwd) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2
			con=pool.getConnection();
			
			String sql="delete from board"
					+ " where no=? and pwd=?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, no);
			ps.setString(2, pwd);
			
			int cnt=ps.executeUpdate();
			System.out.println("글 삭제  결과 cnt="+cnt+", 매개변수 no="+no
					+",pwd="+pwd);
			
			return cnt;
		}finally {
			pool.dbClose(ps, con);
		}
	}
	
	
	

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









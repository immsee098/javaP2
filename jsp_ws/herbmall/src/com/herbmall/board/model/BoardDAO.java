package com.herbmall.board.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.herbmall.db.ConnectionPoolMgr;

public class BoardDAO {
	private ConnectionPoolMgr pool;
	
	public BoardDAO(){
		pool=new ConnectionPoolMgr();
	}
	
	/**
	 * 게시판 글쓰기 메서드
	 * @param vo
	 * @return
	 * @throws SQLException
	 */
	public int insertBoard(BoardVO vo) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2
			con=pool.getConnection();
			
			//3
			String sql="insert into board(no, name,pwd, title, email,"
					+ " content)" + 
					" values(board_seq.nextval, ?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getPwd());
			ps.setString(3, vo.getTitle());
			ps.setString(4, vo.getEmail());
			ps.setString(5, vo.getContent());
			
			//4
			int cnt=ps.executeUpdate();
			System.out.println("글등록 결과 cnt="+cnt+", 매개변수 vo="+vo);
			
			return cnt;
		}finally {
			pool.dbClose(ps, con);
		}
	}
	
	
	public List<BoardVO> selectAll(String condition, String keyword) 
			throws SQLException{
		/*select * from board
		where title like '%제목%';

		select * from board
		where content like '%내용%';

		select * from board
		where name like '%길동%';
		*/
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		List<BoardVO> list=new ArrayList<BoardVO>();
		try {
			//1,2
			con=pool.getConnection();
			
			//3.
			String sql="select * from board ";
			if(keyword!=null && !keyword.isEmpty()) {
				sql+= " where "+condition+" like '%' || ? || '%'";
			}
			sql+= " order by no desc";
			
			ps=con.prepareStatement(sql);
			
			if(keyword!=null && !keyword.isEmpty()) {
				ps.setString(1, keyword);
			}
			
			//4
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
			System.out.println("글전체 조회 결과 list.size="+list.size()
				+", 매개변수 condition="+condition+", keyword="+keyword);
			
			return list;
		}finally {
			pool.dbClose(rs, ps, con);
		}
	}
	
	public BoardVO selectByNo(int no) throws SQLException{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		BoardVO vo=new BoardVO();
		try {
			//1,2
			con=pool.getConnection();
			
			//3.
			String sql="select * from board where no=?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			//4
			rs=ps.executeQuery();
			while(rs.next()) {
				vo.setNo(rs.getInt("no"));
				vo.setReadcount(rs.getInt("readcount"));
				vo.setName(rs.getString("name"));
				vo.setTitle(rs.getString("title"));
				vo.setPwd(rs.getString("pwd"));
				vo.setEmail(rs.getString("email"));
				vo.setContent(rs.getString("content"));
				vo.setRegdate(rs.getTimestamp("regdate"));				
			}
			System.out.println("글 조회 결과 vo="+ vo+", 매개변수 no="+ no);
			
			return vo;
		}finally {
			pool.dbClose(rs, ps, con);
		}
	}
	
	
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
	
	public int updateReadCount(int no) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			con=pool.getConnection();
			
			String sql="update board" + 
					" set readcount=readcount+1" + 
					" where no=?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			int cnt=ps.executeUpdate();
			System.out.println("조회수 증가 결과 cnt="+cnt+", 매개변수 no="+no);
			
			return cnt;
		}finally {
			pool.dbClose(ps, con);
		}
	}
	
	/**
	 * 최근글 6개 조회 - 공지사항
	 * @return
	 * @throws SQLException 
	 */
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
	
	
}









package com.herbmall.board.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.herbmall.db.ConnectionPoolMgr;
import com.herbmall.db.ConnectionPoolMgr1;

public class ReBoardDAO {
	private ConnectionPoolMgr1 pool;
	
	public ReBoardDAO(){
		pool=ConnectionPoolMgr1.getInstance();
	}
	
	/**
	 * 게시판 글쓰기 메서드
	 * @param vo
	 * @return
	 * @throws SQLException
	 */
	public int insertReBoard(ReBoardVO vo) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2
			con=pool.getConnection();
			
			//3
			String sql="insert into reBoard(no, name,pwd, title, email,"
					+ " content, groupno,filename, originalfilename,"
					+ "filesize)" + 
					" values(reBoard_seq.nextval, ?,?,?,?,?,"
					+ "reBoard_seq.nextval, ?,?,?)";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getPwd());
			ps.setString(3, vo.getTitle());
			ps.setString(4, vo.getEmail());
			ps.setString(5, vo.getContent());
			ps.setString(6, vo.getFileName());
			ps.setString(7, vo.getOriginalFileName());
			ps.setLong(8, vo.getFileSize());
			
			//4
			int cnt=ps.executeUpdate();
			System.out.println("글등록 결과 cnt="+cnt+", 매개변수 vo="+vo);
			
			return cnt;
		}finally {
			pool.dbClose(ps, con);
		}
	}
	
	
	public List<ReBoardVO> selectAll(String condition, String keyword) 
			throws SQLException{
		/*select * from reBoard
		where title like '%제목%';

		select * from reBoard
		where content like '%내용%';

		select * from reBoard
		where name like '%길동%';
		*/
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		List<ReBoardVO> list=new ArrayList<ReBoardVO>();
		try {
			//1,2
			con=pool.getConnection();
			
			//3.
			String sql="select * from reBoard ";
			if(keyword!=null && !keyword.isEmpty()) {
				sql+= " where "+condition+" like '%' || ? || '%'";
			}
			sql+= " order by groupno desc, sortno";
			
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
				
				//답변형 추가
				int groupNo=rs.getInt("groupno");
				int step=rs.getInt("step");
				int sortNo=rs.getInt("sortno");
				String delflag=rs.getString("delflag");

				//자료실 추가
				int downcount=rs.getInt("downcount");
				long filesize=rs.getInt("filesize");
				String filename=rs.getString("filename");
				String originFilename=rs.getString("originalfilename");
				
				ReBoardVO vo = new ReBoardVO(no, name, pwd, title, email, 
					regdate, readcount, content, groupNo, step, sortNo,
					delflag, filename, filesize, downcount, 
					originFilename);
				
				list.add(vo);
			}
			System.out.println("글전체 조회 결과 list.size="+list.size()
				+", 매개변수 condition="+condition+", keyword="+keyword);
			
			return list;
		}finally {
			pool.dbClose(rs, ps, con);
		}
	}
	
	public ReBoardVO selectByNo(int no) throws SQLException{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		ReBoardVO vo=new ReBoardVO();
		try {
			//1,2
			con=pool.getConnection();
			
			//3.
			String sql="select * from reBoard where no=?";
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
				
				vo.setGroupNo(rs.getInt("groupNo"));
				vo.setStep(rs.getInt("step"));
				vo.setSortNo(rs.getInt("sortNo"));
				vo.setDelFlag(rs.getString("delFlag"));
				
				vo.setFileSize(rs.getLong("fileSize"));
				vo.setDownCount(rs.getInt("downCount"));
				vo.setFileName(rs.getString("fileName"));
				vo.setOriginalFileName(rs.getString("originalFileName"));
								
			}
			System.out.println("글 조회 결과 vo="+ vo+", 매개변수 no="+ no);
			
			return vo;
		}finally {
			pool.dbClose(rs, ps, con);
		}
	}
	
	
	public int updateReBoard(ReBoardVO vo) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2
			con=pool.getConnection();
			
			String sql="update reBoard";
			sql+= " set name=?, title=?, email=?,content=?";
			if(vo.getFileName()!=null && !vo.getFileName().isEmpty()) {
				sql+=", filename=?, originalFilename=?, filesize=?";
			}
					
			sql+= " where no=?";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getTitle());
			ps.setString(3, vo.getEmail());
			ps.setString(4, vo.getContent());
			if(vo.getFileName()!=null && !vo.getFileName().isEmpty()) {
				ps.setString(5, vo.getFileName());
				ps.setString(6, vo.getOriginalFileName());
				ps.setLong(7, vo.getFileSize());
				ps.setInt(8, vo.getNo());
			}else {
				ps.setInt(5, vo.getNo());
			}
			
			int cnt=ps.executeUpdate();
			System.out.println("글 수정  결과 cnt="+cnt+", 매개변수 vo="+vo);
			
			return cnt;
		}finally {
			pool.dbClose(ps, con);
		}
	}
	
	public void deleteReBoard(ReBoardVO vo) throws SQLException {
		Connection con=null;
		CallableStatement ps=null;
		
		try {
			//1,2
			con=pool.getConnection();
			
			String sql="call delete_reboard(?,?,?)";
			ps=con.prepareCall(sql);
			
			ps.setInt(1, vo.getNo());
			ps.setInt(2, vo.getGroupNo());
			ps.setInt(3, vo.getStep());
			
			boolean bool=ps.execute();
			System.out.println("글 삭제  결과 bool="+bool+", 매개변수 vo="+vo);
		}finally {
			pool.dbClose(ps, con);
		}
	}
	
	public boolean checkPwd(int no, String pwd) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		boolean bool=false;		
		try {
			//1,2
			con=pool.getConnection();
			
			//3
			String sql="select pwd from reboard" + 
					"	where no=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, no);
			
			rs=ps.executeQuery();
			if(rs.next()) {
				String dbPwd=rs.getString(1);
				if(dbPwd.equals(pwd)){
					bool=true;  //비밀번호 일치
				}
			}
			System.out.println("비밀번호 체크 결과 bool="+bool+",매개변수 no="
					+no+", pwd="+pwd);
			
			return bool;
		}finally {
			pool.dbClose(rs, ps, con);
		}
	}
	
	public int updateReadCount(int no) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			con=pool.getConnection();
			
			String sql="update reBoard" + 
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
	
	public int reply(ReBoardVO vo) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		int cnt=0;
		try {
			//1,2
			con=pool.getConnection();
			
			//----트랜잭션 시작
			con.setAutoCommit(false); //jsp는 자동커밋되나 트랜잭션 처리를 위해
			//자동커밋이 안되도록 막는다
			
			//3. [update]
			String sql="update reboard" + 
					" set sortno=sortno+1" + 
					" where groupno = ? and sortno>?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, vo.getGroupNo());
			ps.setInt(2, vo.getSortNo());
			
			//4.
			cnt=ps.executeUpdate();
			
			//3. [insert]
			sql="insert into reboard(no, name, pwd, title, email, "
				+ "content, groupno, step, sortno,filename, "
				+ "originalfilename,filesize)" + 
				" values(reboard_seq.nextval,?,?,?,?,?,?,?,?,?,?,?)"; 
				
			ps=con.prepareStatement(sql);
			
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getPwd());
			ps.setString(3, vo.getTitle());
			ps.setString(4, vo.getEmail());
			ps.setString(5, vo.getContent());
			ps.setInt(6, vo.getGroupNo());
			ps.setInt(7, vo.getStep()+1);
			ps.setInt(8, vo.getSortNo()+1);
			ps.setString(9, vo.getFileName());
			ps.setString(10, vo.getOriginalFileName());
			ps.setLong(11, vo.getFileSize());
			
			//4.
			cnt=ps.executeUpdate();
			System.out.println("답변달기 결과, cnt="+cnt+", 매개변수 vo="+vo);
			
			//커밋
			con.commit();
		}catch(SQLException e) {
			e.printStackTrace();
			
			//롤백
			con.rollback();
		}finally {
			con.setAutoCommit(true);
			
			pool.dbClose(ps, con);
		}
		
		return cnt;
	}
	
	public int updateDownCount(int no) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			con=pool.getConnection();
			
			String sql="update reboard" + 
					" set downcount=downcount+1" + 
					" where no = ?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, no);
			
			int cnt=ps.executeUpdate();
			System.out.println("다운로드수 증가 결과 cnt="+cnt
					+", 매개변수 no="+no);
			
			return cnt;
		}finally {
			pool.dbClose(ps, con);
		}		
	}
	
	
}








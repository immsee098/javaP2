package com.mybatisweb.pd.model;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.AbstractRepository;

public class PdDAOImpl extends AbstractRepository implements PdDAO{
	private String namespace="com.mybatis.mapper.pd.";
	private SqlSession sqlSession=getSqlSessionFactory().openSession();
	
	public PdDAOImpl(){
		System.out.println("PdDAO 생성자 호출");
	}	

	public int insertPd(PdDTO dto) throws SQLException {
		try {
			int cnt=sqlSession.insert(namespace+"insertPd", dto);
			
			if(cnt>0) {
				sqlSession.commit();
			}
			
			return cnt;
		}finally {
			sqlSession.close();
		}
	}
	
	/*
	public List<PdDTO> selectAll() throws SQLException{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		List<PdDTO> list = new ArrayList<PdDTO>();
		
		try {
			//1,2
			con=pool.getConnection();
			
			//3
			String sql="select * from pd order by no desc";
			ps=con.prepareStatement(sql);
			
			//4
			rs=ps.executeQuery();
			while(rs.next()) {
				int no=rs.getInt("no");
				String pdName=rs.getString("pdname");
				int price=rs.getInt("price");
				Timestamp regdate=rs.getTimestamp("regdate");
				
				PdDTO dto = new PdDTO(no, pdName, price, regdate);
				list.add(dto);
			}
			System.out.println("전체조회 결과 list.size="+list.size());
			
			return list;
		}finally {
			pool.dbClose(rs, ps, con);
		}
	}

	
	public PdDTO selectByNo(int no) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		PdDTO dto = new PdDTO();
		try {
			//1,2
			con=pool.getConnection();
			
			//3.
			String sql="select * from pd where no=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, no);
			
			//4
			rs=ps.executeQuery();
			if(rs.next()) {
				int price=rs.getInt("price");
				String pdName=rs.getString("pdname");
				Timestamp regdate=rs.getTimestamp("regdate");
				
				dto.setNo(no);
				dto.setPdName(pdName);
				dto.setPrice(price);
				dto.setRegdate(regdate);
			}
			System.out.println("상세보기결과 dto="+dto+",매개변수 no="+no);
			
			return dto;
		}finally {
			pool.dbClose(rs, ps, con);
		}
	}
	
	
	public int updatePd(PdDTO dto) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2 
			con=pool.getConnection();
			
			//3.
			String sql="update pd set pdname=?, price=?" + 
					" where no=?";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, dto.getPdName());
			ps.setInt(2, dto.getPrice());
			ps.setInt(3, dto.getNo());
			
			//4.
			int cnt=ps.executeUpdate();
			System.out.println("상품수정 결과 cnt="+cnt+", 매개변수 dto="+dto);
			
			return cnt;
		}finally {
			pool.dbClose(ps, con);
		}
	}
	
	public int deletePd(int no) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2 
			con=pool.getConnection();
			
			//3.
			String sql="delete from pd" + 
					" where no=?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			//4.
			int cnt=ps.executeUpdate();
			System.out.println("상품삭제 결과 cnt="+cnt+", 매개변수 no"+no);
			
			return cnt;
		}finally {
			pool.dbClose(ps, con);
		}
	}
	
	*/
}








package com.myStudy.pd.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.myStudy.db.ConnectionPoolMgr;

public class PdDAO {
	private ConnectionPoolMgr pool;
	
	public PdDAO(){
		pool=new ConnectionPoolMgr();
	}
	
	/**
	 * ��ǰ ��� �޼���
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	public int insertPd(PdDTO dto) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2 
			con=pool.getConnection();
			
			//3.
			String sql="insert into pd(no, pdname, price)" + 
					" values(pd_seq.nextval, ?,?)";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, dto.getPdName());
			ps.setInt(2, dto.getPrice());
			
			//4.
			int cnt=ps.executeUpdate();
			System.out.println("��ǰ��� ��� cnt="+cnt+", �Ű����� dto="+dto);
			
			return cnt;
		}finally {
			pool.dbClose(ps, con);
		}
	}
	
	/**
	 * ��ǰ ��ü ��ȸ �޼���
	 * @return
	 * @throws SQLException
	 */
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
			System.out.println("��ü��ȸ ��� list.size="+list.size());
			
			return list;
		}finally {
			pool.dbClose(rs, ps, con);
		}
	}

	/**
	 * ��ǰ �󼼺��� ��ȸ �޼���
	 * @param no
	 * @return
	 * @throws SQLException
	 */
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
			System.out.println("�󼼺����� dto="+dto+",�Ű����� no="+no);
			
			return dto;
		}finally {
			pool.dbClose(rs, ps, con);
		}
	}
	
	/**
	 * 
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
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
			System.out.println("��ǰ���� ��� cnt="+cnt+", �Ű����� dto="+dto);
			
			return cnt;
		}finally {
			pool.dbClose(ps, con);
		}
	}
	
	public int deletePd(int no) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = pool.getConnection();
			
			String sql = "delete from pd where no=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			
			int cnt = ps.executeUpdate();
			System.out.println("���� ���:"+cnt);
			
			return cnt;
		} finally {
			pool.dbClose(ps, con);
		}
	}
	
}








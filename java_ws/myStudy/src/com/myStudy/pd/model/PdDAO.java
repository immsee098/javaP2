package com.myStudy.pd.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
	
	
}








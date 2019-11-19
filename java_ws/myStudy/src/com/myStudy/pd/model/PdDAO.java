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
	 * 상품 등록 메서드
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
			System.out.println("상품등록 결과 cnt="+cnt+", 매개변수 dto="+dto);
			
			return cnt;
		}finally {
			pool.dbClose(ps, con);
		}
	}
	
	
}








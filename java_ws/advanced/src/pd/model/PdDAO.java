package pd.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import db.DBUtil;

//DAO(Data Access Object) - 데이터베이스 작업을 전담하는 객체
//CRUD 작업을 전담함
/*
 	C : Create => Insert
 	R : Read => Select
 	U : Update
 	D : Delete
*/
//DB작업 이외의 비즈니스 로직은 올 수 없음

public class PdDAO {
	
	public int  insertPd(PdDTO dto) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;	
		
		Arr
		try {		
			//1.
			//2. con
			con=DBUtil.getConnection();
			
			//3. ps
			String sql="insert into pd(no, pdname, price)" + 
					"values(pd_seq.nextval, ?,?)";
			ps=con.prepareStatement(sql);
			
			//
			ps.setString(1, dto.getPdName());
			ps.setInt(2, dto.getPrice());
			
			//4. exec
			int cnt=ps.executeUpdate();
			System.out.println("입력된 행의 개수:"+ cnt);
			
			return cnt;
		}finally {
			DBUtil.dbClose(ps, con);
		}
	}
	
	public PdDTO selectByNo(int no) throws SQLException {
		//번호로 조회
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		//결과 레코드를 DTO로 묶어서 리턴할 용도
		PdDTO dto = new PdDTO();
		try {
			//1.			
			//2. con
			con=DBUtil.getConnection();
			
			//3. ps
			String sql="select * from pd where no=?";
			ps=con.prepareStatement(sql);
			
			//
			ps.setInt(1, no);
			
			//4. exec
			rs=ps.executeQuery();
			if(rs.next()) {
				int price=rs.getInt("price");
				String pdName=rs.getString("pdname");
				Timestamp regdate=rs.getTimestamp("regdate");
				
				//한 개의 레코드를 먼저 하나의 DTO로 묶는다
				PdDTO dto = new PdDTO(no, pdName, price, regdate)
				//각각의 DTO를 ArrayList로 다시 묶는다
				
				//레코드 하나는 하나의 DTO
				//결과 레코드 하나를 DTO로 묶어 준다
//				dto.setNo(no);
//				dto.setPdName(pdName);
//				dto.setPrice(price);
//				dto.setRegdate(regdate);
			}
//			System.out.println("번호로 상품 조회 결과 dto="+dto);
//			
//			return dto;
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}
		
	}
	
	/*
	public  selectAll() {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			//1.
			//2.
			con=DBUtil.getConnection();
			
			//3
			String sql="select * from pd order by no desc";
			ps=con.prepareStatement(sql);
			
			//4.
			rs=ps.executeQuery();
			while(rs.next()) {
				int no=rs.getInt("no");
				String pdName=rs.getString("pdName");
				int price=rs.getInt("price");
				Timestamp regdate=rs.getTimestamp("regdate");
				
				System.out.println(no+"\t"+pdName+"\t"+price+"\t"+regdate);
			}
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}
	}
	*/
	
	
}















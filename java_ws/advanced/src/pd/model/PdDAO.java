package pd.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

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
	//입력 수정을 위한 첫번쨰 유형/insert/update(매개변수 -> dto)
	public int  insertPd(PdDTO dto) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;	
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
	
	//두번째 유형/select1/한개인거->(반환타입이 dto)
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
				
				//레코드 하나는 하나의 DTO
				//결과 레코드 하나를 DTO로 묶어 준다
				dto.setNo(no);
				dto.setPdName(pdName);
				dto.setPrice(price);
				dto.setRegdate(regdate);
			}
			System.out.println("번호로 상품 조회 결과 dto="+dto);
			
			return dto;
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}
		
	}
	
	//세번째 유형/다중레코드/(반환타입이 arraylist)
	public ArrayList<PdDTO> selectAll() throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		ArrayList<PdDTO> alist = new ArrayList<PdDTO>();
		//List<PdDTO> list = new ArrayList<PdDTO>();
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
			
				//한 개의 레코드를 먼저 하나의 DTO로 묶는다 
				PdDTO dto = new PdDTO(no, pdName, price, regdate);
				
				//각각의 DTO를 ArrayList로 다시 묶는다
				alist.add(dto);
			}
			
			System.out.println("전체 조회 결과 alist.size="+alist.size());
			
			return alist;
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}
	}
	
	
	public int updatePd(PdDTO dto) throws SQLException {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			//1.
			//2.con
			con = DBUtil.getConnection();
			//3.ps
			String sql = "update pd\r\n" + 
					"set pdname=?, price=?\r\n" + 
					"where no =?";
			ps = con.prepareStatement(sql);
			
			//in parameter setting
			ps.setString(1, dto.getPdName());
			ps.setInt(2, dto.getPrice());
			ps.setInt(3, dto.getNo());
			
			//4.exec
			int cnt = ps.executeUpdate();
			System.out.println("상품 수정 결과 cnt="+cnt);
			
			return cnt;
			
		} finally {
			DBUtil.dbClose(ps, con);
		}
	}
	
	
	public int deletePd(PdDTO dto) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DBUtil.getConnection();
			
			String sql = "delete from pd\r\n" + 
					"where no = ?";
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, dto.getNo());
			
			int cnt = ps.executeUpdate();
			System.out.println("상품 삭제 결과="+cnt);
			
			return cnt;
			
		} finally {
			DBUtil.dbClose(ps, con);
		}
	}

	public ArrayList<PdDTO> selectByPdName(String pdName) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		ArrayList<PdDTO> alist = new ArrayList<PdDTO>();
		try {
			//1.
			//2.
			con=DBUtil.getConnection();
			
			//3
			String sql="select * from pd where pdname=? "
					+ " order by no desc";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, pdName);
			
			//4.
			rs=ps.executeQuery();
			while(rs.next()) {
				int no=rs.getInt("no");
				int price=rs.getInt("price");
				Timestamp regdate=rs.getTimestamp("regdate");
			
				//한 개의 레코드를 먼저 하나의 DTO로 묶는다 
				PdDTO dto = new PdDTO(no, pdName, price, regdate);
				
				//각각의 DTO를 ArrayList로 다시 묶는다
				alist.add(dto);
			}
			
			System.out.println("상품명으로 조회 결과 alist.size="+alist.size());
			
			return alist;
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}
	}
	
}















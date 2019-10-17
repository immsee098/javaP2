package pd.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import db.DBUtil;

//DAO(Data Access Object) - �����ͺ��̽� �۾��� �����ϴ� ��ü
//CRUD �۾��� ������
/*
 	C : Create => Insert
 	R : Read => Select
 	U : Update
 	D : Delete
*/
//DB�۾� �̿��� ����Ͻ� ������ �� �� ����

public class PdDAO {
	//�Է� ������ ���� ù���� ����/insert/update(�Ű����� -> dto)
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
			System.out.println("�Էµ� ���� ����:"+ cnt);
			
			return cnt;
		}finally {
			DBUtil.dbClose(ps, con);
		}
	}
	
	//�ι�° ����/select1/�Ѱ��ΰ�->(��ȯŸ���� dto)
	public PdDTO selectByNo(int no) throws SQLException {
		//��ȣ�� ��ȸ
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		//��� ���ڵ带 DTO�� ��� ������ �뵵
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
				
				//���ڵ� �ϳ��� �ϳ��� DTO
				//��� ���ڵ� �ϳ��� DTO�� ���� �ش�
				dto.setNo(no);
				dto.setPdName(pdName);
				dto.setPrice(price);
				dto.setRegdate(regdate);
			}
			System.out.println("��ȣ�� ��ǰ ��ȸ ��� dto="+dto);
			
			return dto;
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}
		
	}
	
	//����° ����/���߷��ڵ�/(��ȯŸ���� arraylist)
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
			
				//�� ���� ���ڵ带 ���� �ϳ��� DTO�� ���´� 
				PdDTO dto = new PdDTO(no, pdName, price, regdate);
				
				//������ DTO�� ArrayList�� �ٽ� ���´�
				alist.add(dto);
			}
			
			System.out.println("��ü ��ȸ ��� alist.size="+alist.size());
			
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
			System.out.println("��ǰ ���� ��� cnt="+cnt);
			
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
			System.out.println("��ǰ ���� ���="+cnt);
			
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
			
				//�� ���� ���ڵ带 ���� �ϳ��� DTO�� ���´� 
				PdDTO dto = new PdDTO(no, pdName, price, regdate);
				
				//������ DTO�� ArrayList�� �ٽ� ���´�
				alist.add(dto);
			}
			
			System.out.println("��ǰ������ ��ȸ ��� alist.size="+alist.size());
			
			return alist;
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}
	}
	
}















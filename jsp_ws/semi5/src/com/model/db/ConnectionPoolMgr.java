package com.model.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;

public class ConnectionPoolMgr {
	private String url,user,pwd;
	private HashMap<Connection, Boolean> hmap;
	private int increment; //����ġ
	
	//static����
	private static ConnectionPoolMgr instance;
	
	//������
	public ConnectionPoolMgr(){
		increment=5;//5��ŭ�� ����
		hmap=new HashMap<Connection,Boolean>(10);	
		Connection con=null;	
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����!");
			url="jdbc:oracle:thin:@DESKTOP-IA9SFNU:1521:xe";	
			user="testuser"; 	
			pwd="testuser123";
			
			//Ŀ�ؼ� ��ü�� �̸� ������ ���� - 10��
			for(int i=0;i<10;i++){	
				con=DriverManager.getConnection(url,user,pwd);		
				//�ؽø��� key�� Ŀ�ؼ� ����
				
				hmap.put(con, Boolean.FALSE);		
				//�ؽø��� value�� true, false ����, false - ���� Ŀ�ؼ��̶�� ǥ��	
			}//for
			
			System.out.println("ConnectionPool ����!");
		}catch (ClassNotFoundException e) {			
			e.printStackTrace();
			System.out.println("Class Not Found!"); 
		}catch (SQLException e) {			
			e.printStackTrace();
			System.out.println("sql ���ܹ߻�!"); 
		}
	}//������
	
	public static ConnectionPoolMgr getInstance() {
		if(instance==null) {
			instance=new ConnectionPoolMgr();
		}
		
		return instance;
	}
		
	public synchronized Connection getConnection() //jsp - ��û�� Thread�� ó��
			throws SQLException{
		Iterator<Connection> iterKeys=hmap.keySet().iterator();	
		Connection con=null;	
		while(iterKeys.hasNext() ){ //hmap�� key�� �ִ� ���� �ݺ�	
			con=iterKeys.next();//key��	
			Boolean b=hmap.get(con);//value��	
			//���� �����ִ� ���ؼ��̶�� ���ϴ� ���ؼ����� ǥ�����ְ� ��ȯ�Ѵ�.	
			if(b==Boolean.FALSE){	
				hmap.put(con, Boolean.TRUE);//���Ѵٰ� ǥ��		
				return con; //���Ϸ� ����	
			}//if	
		}//while
		
		//���� �ִ� ���ؼ��� ������ ���� Connection�� 5�� ������Ų��	
		for(int i=0;i<increment;i++){	
			Connection con2=DriverManager.getConnection(url,user,pwd);	
			hmap.put(con2, Boolean.FALSE);	
		}//for
		
		return getConnection();//���ȣ��
	}
	
	//Ŀ�ؼ��� ����ϰ� �� �� �ٽ� �ǵ����ִ� �޼ҵ�	
	public void returnConnection(Connection returnCon){
		Iterator<Connection> iterKeys=hmap.keySet().iterator();	
		Connection con=null;	
		while(iterKeys.hasNext() ){	
			con=iterKeys.next();		
			if(con==returnCon){	//con�� �ּҰ��� ��ġ�ϸ�
				hmap.put(con, Boolean.FALSE);  //���� Ŀ�ؼ����� ǥ��	
				break;
			}//if
		}//while
		
		try{	
			removeConnection(); //�����ִ� Ŀ�ؼ� 10���� �������ִ� �޼ҵ�	
		}catch(SQLException e){	
			e.printStackTrace();	
			System.out.println("sqlerror:" + e.getMessage());
		}
	}
	
	//Connection 10���� �������ִ� �޼���
	public void removeConnection() throws SQLException{
		Connection con=null;
		Iterator<Connection> iterKeys=hmap.keySet().iterator();
		int count=0;//false�� Ŀ�ؼ� ����
		while(iterKeys.hasNext() ){ 	
			con=iterKeys.next();	
			Boolean b=hmap.get(con);
			boolean b_pre=b.booleanValue();
			if(!b_pre){//�����ִ� Ŀ�ؼ� ���� ���� - false�� ���
				count++;
				if(count>10){ //���� �ִ� Ŀ�ؼ��� 10���� �Ѿ��
					//�ؽøʿ��� ����
					hmap.remove(con);
					con.close();
				}
			}//if
		}//while
	}
	
	//��� Ŀ�ؼ� close�ϴ� �޼���
	public void closeAll() throws SQLException{
		Iterator<Connection> iterKeys=hmap.keySet().iterator();	
		Connection con=null;	
		while(iterKeys.hasNext() ){ 	
			con=iterKeys.next();	
			con.close();
		}//while
	}
	
	
	//�ڿ������ϴ� �޼���
	public void dbClose(PreparedStatement ps,  Connection con) throws SQLException{
		if(ps!=null) ps.close();
		if(con!=null)returnConnection(con);
	}
	
	public void dbClose(ResultSet rs,  PreparedStatement ps,  
			Connection con) throws SQLException{
		if(rs!=null)rs.close();
		if(ps!=null) ps.close();
		if(con!=null)returnConnection(con);				
	}
	
	public void dbClose(CallableStatement cs,  Connection con) throws SQLException{
		if(cs!=null) cs.close();
		if(con!=null)returnConnection(con);			
	}
}//class

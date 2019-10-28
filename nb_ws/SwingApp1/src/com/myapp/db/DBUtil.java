/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.myapp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author EZEN
 */
public class DBUtil {
    static {
        //드라이버 로딩
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 로딩 성공!");
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로딩 실패!");
            e.printStackTrace();
        }
    }
    
    public static Connection getConnection() throws SQLException {
        //db서버와 연결하기 위한 Connection객체 생성
        String url="jdbc:oracle:thin:@DESKTOP-IA9SFNU:1521:xe";
        String user="testuser", upwd="testuser123";
        Connection con=getConnection(url, user, upwd);
        
        return con;
    }
    
    public static Connection getConnection(String url, String user,
            String upwd) throws SQLException {
        Connection con=DriverManager.getConnection(url, user, upwd);
        System.out.println("db연결, con="+con);
        
        return con;
    }
    
    public static Connection getConnection(String user,
            String upwd) throws SQLException {
        String url="jdbc:oracle:thin:@DESKTOP-BFLLBCO:1521:xe";
        Connection con=getConnection(url, user, upwd);
        
        return con;
    }
    
    public static void dbClose(ResultSet rs, PreparedStatement ps,
            Connection con) throws SQLException {
        if(rs!=null) rs.close();
        if(ps!=null) ps.close();
        if(con!=null) con.close();
    }
    
    public static void dbClose(PreparedStatement ps,
            Connection con) throws SQLException {
        if(ps!=null) ps.close();
        if(con!=null) con.close();
    }
}

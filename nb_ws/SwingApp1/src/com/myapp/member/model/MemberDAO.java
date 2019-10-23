/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.member.model;

import com.myapp.db.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author EZEN
 */
public class MemberDAO {
    //로그인 처리
    public int login(String userid, String pwd) throws SQLException{
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        int result=0;
        try{
            //1,2
            con=DBUtil.getConnection();
            
            //3
            String sql="select pwd from member where userid=?";
            ps=con.prepareStatement(sql);
            ps.setString(1, userid);
            
            //4.
            rs=ps.executeQuery();
                
            if(rs.next()){
                String dbPwd=rs.getString(1);
                if(dbPwd.equals(pwd)){
                    result=MemberService.LOGIN_OK;
                }else{
                    result=MemberService.PWD_DISAGREE;                    
                }
            }else{
                result=MemberService.ID_NONE;
            }
            System.out.println("로그인 처리 결과 result="+result);
            
            return result;
        }finally{
            DBUtil.dbClose(rs, ps, con);
        }
        
    }
    
}

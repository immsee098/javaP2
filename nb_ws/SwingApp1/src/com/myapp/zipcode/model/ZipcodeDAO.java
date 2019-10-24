/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.zipcode.model;

import com.myapp.db.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author EZEN
 */
public class ZipcodeDAO {
    
    public ArrayList<ZipcodeDTO> selectZipcode(String dong) throws SQLException{
        //select * from zipcode
        //where dong like '%서초%'

        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        ArrayList<ZipcodeDTO> list=new ArrayList<>();
        
        try{
            //1
            //2
            con=DBUtil.getConnection();
            
            //3
            String sql="select * from zipcode" +
                    " where dong like '%' || ? || '%'";
            ps=con.prepareStatement(sql);
            ps.setString(1, dong);
            
            return list;
            
            //4
        }finally{
            DBUtil.dbClose(rs, ps, con);
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.product.model;

import com.myapp.db.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author EZEN
 */
public class ProductDAO {
    
    public int insertProduct(ProductDTO dto) throws SQLException{
        Connection con=null;
        PreparedStatement ps=null;
        
        try{
            //1. 
            //2.
            con=DBUtil.getConnection();
            
            //3.
            String sql="insert into product(no, productname, price, description)\n" +
                        "values(product_seq.nextval, ?, ?, ?)";
            ps=con.prepareStatement(sql);
            
            ps.setString(1, dto.getProductName());
            ps.setInt(2, dto.getPrice());
            ps.setString(3, dto.getDescription());
            
            //4. 
            int cnt = ps.executeUpdate();
            System.out.println("입력된 행의 개수:"+cnt);
            return cnt;
            
        }finally{
            //5. 
            DBUtil.dbClose(ps,con);
        }
        
    }
    
    public ArrayList<ProductDTO> selectAll() throws SQLException{
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        ArrayList<ProductDTO> list = new ArrayList<>();
        
        try{
            con = DBUtil.getConnection();
            
            String sql="select * from product";
            ps=con.prepareStatement(sql);
            rs= ps.executeQuery();
            while(rs.next()){
                int no = rs.getInt("no");
                String pdName = rs.getString("productName");
                String desc = rs.getString("description");
                int price = rs.getInt("price");
                Timestamp regdate = rs.getTimestamp("regdate");
                
                ProductDTO dto = new ProductDTO(no, pdName, price, desc, regdate);
                list.add(dto);
            }
            
            System.out.println("전체 조회 결과 list.size="+list.size());
            
            return list;
        } finally{
            DBUtil.dbClose(rs,ps, con);
        }
    }
    
    
}

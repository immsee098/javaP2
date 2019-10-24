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
import java.sql.Timestamp;

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
    
    public int insertMember(MemberDTO dto) throws SQLException{
        Connection con=null;
        PreparedStatement ps=null;
        
        try{
            //1,2
            con=DBUtil.getConnection();
            
            //3
            String sql="insert into member(no, userid, name, pwd, email,"
                    + " hp, zipcode,address1, address2)" 
                    + " values(member_seq.nextval, ?,?,?,?,?,?,?,?)";
            ps=con.prepareStatement(sql);
            
            ps.setString(1, dto.getUserid());
            ps.setString(2, dto.getName());
            ps.setString(3, dto.getPwd());
            ps.setString(4, dto.getEmail());
            ps.setString(5, dto.getHp());
            ps.setString(6, dto.getZipcode());
            ps.setString(7, dto.getAddress1());
            ps.setString(8, dto.getAddress2());
            
            //4
            int cnt=ps.executeUpdate();
            System.out.println("회원가입 결과, cnt="+cnt);
            
            return cnt;
        }finally{
            DBUtil.dbClose(ps, con);
        }
    }
    
    public MemberDTO selectMember(String userid) throws SQLException{
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        MemberDTO dto=new MemberDTO();
        try{
            //1,2
            con=DBUtil.getConnection();
            
            //3
            String sql="select * from member where userid=?";
            ps=con.prepareStatement(sql);
            ps.setString(1, userid);
            
            //4.
            rs=ps.executeQuery();
                
            if(rs.next()){
                String name=rs.getString("name");
                String pwd=rs.getString("pwd");
                String email=rs.getString("email");
                String hp=rs.getString("hp");
                String zipcode=rs.getString("zipcode");
                String address1=rs.getString("address1");
                String address2=rs.getString("address2");
                int no=rs.getInt("no");
                Timestamp regdate=rs.getTimestamp("regdate");
                        
                dto.setAddress1(address1);
                dto.setAddress2(address2);
                dto.setEmail(email);
                dto.setHp(hp);
                dto.setName(name);
                dto.setNo(no);
                dto.setRegDate(regdate);
                dto.setUserid(userid);
                dto.setPwd(pwd);
                dto.setZipcode(zipcode);
            }
            System.out.println("회원정보 조회 결과 dto="+dto);
            
            return dto;
        }finally{
            DBUtil.dbClose(rs, ps, con);
        }
        
    }

    public int updateMember(MemberDTO dto) throws SQLException {
        Connection con=null;
        PreparedStatement ps=null;
        
        try{
            //1,2
            con=DBUtil.getConnection();
            
            //3
            String sql="update member set email=?,"
                    + " hp=?, zipcode=?,address1=?, address2=?" 
                    + " where userid=? and pwd=?";
            ps=con.prepareStatement(sql);
                        
            ps.setString(1, dto.getEmail());
            ps.setString(2, dto.getHp());
            ps.setString(3, dto.getZipcode());
            ps.setString(4, dto.getAddress1());
            ps.setString(5, dto.getAddress2());
            ps.setString(6, dto.getUserid());
            ps.setString(7, dto.getPwd());
            
            //4
            int cnt=ps.executeUpdate();
            System.out.println("회원정보 수정 결과, cnt="+cnt);
            
            return cnt;
        }finally{
            DBUtil.dbClose(ps, con);
        }
    }
    
    public int duplicateUserid(String userid) throws SQLException{
        //아이디 중복확인
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        int result=0;
        try{
            //1,2
            con=DBUtil.getConnection();
            
            //3
            String sql="select count(*) from member" +
                " where userid=?";
            ps=con.prepareStatement(sql);
            ps.setString(1, userid);
            
            //4
            rs=ps.executeQuery();
            if(rs.next()){
                int count=rs.getInt(1);
                if(count>0){ //이미 해당 아이디가 존재=> 사용불가
                    result=MemberService.UNUSABLE_ID;
                }else{ //사용가능
                    result=MemberService.USABLE_ID;                    
                }
            }            
            System.out.println("아이디 중복확인 결과, result="+result);
            
            return result;
        }finally{
            DBUtil.dbClose(rs, ps, con);
        }
        
    }
    
}


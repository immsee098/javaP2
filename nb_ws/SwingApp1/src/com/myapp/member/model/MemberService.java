/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.member.model;

/**
 *
 * @author EZEN
 */
public class MemberService {
    //로그인 처리 관련 상수
    public static final int LOGIN_OK=1;  //로그인 성공
    public static final int ID_NONE=2;    //아이디 존재하지 않음
    public static final int PWD_DISAGREE=3; //비밀번호 불일치
    
    private static String userid;

    public static String getUserid() {
        return userid;
    }

    public static void setUserid(String userid) {
        MemberService.userid = userid;
    }
    
    
}

package com.model.mypage;

import java.sql.Timestamp;

public class sDiaryVO {
	
	private int d_No; /*일지 번호*/
	private int s_No; /*시터번호*/
	private String petName; /* 반려동물 이름 */
	private String d_content;/* 일지내용 */
	private String d_photo; /* 일지사진 */
	private Timestamp d_date; /* 일지날짜 */
	private int memNo; /* 회원번호 */
	private int petNo; /* 동물번호 */
	
	
	public sDiaryVO() {
		super();
	}


	public sDiaryVO(int d_No, int s_No, String petName, String d_content, String d_photo, Timestamp d_date, int memNo,
			int petNo) {
		super();
		this.d_No = d_No;
		this.s_No = s_No;
		this.petName = petName;
		this.d_content = d_content;
		this.d_photo = d_photo;
		this.d_date = d_date;
		this.memNo = memNo;
		this.petNo = petNo;
	}


	public int getD_No() {
		return d_No;
	}


	public void setD_No(int d_No) {
		this.d_No = d_No;
	}


	public int getS_No() {
		return s_No;
	}


	public void setS_No(int s_No) {
		this.s_No = s_No;
	}


	public String getPetName() {
		return petName;
	}


	public void setPetName(String petName) {
		this.petName = petName;
	}


	public String getD_content() {
		return d_content;
	}


	public void setD_content(String d_content) {
		this.d_content = d_content;
	}


	public String getD_photo() {
		return d_photo;
	}


	public void setD_photo(String d_photo) {
		this.d_photo = d_photo;
	}


	public Timestamp getD_date() {
		return d_date;
	}


	public void setD_date(Timestamp d_date) {
		this.d_date = d_date;
	}


	public int getMemNo() {
		return memNo;
	}


	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}


	public int getPetNo() {
		return petNo;
	}


	public void setPetNo(int petNo) {
		this.petNo = petNo;
	}
	
	
	
	

}

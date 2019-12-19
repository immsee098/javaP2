package com.model.reservation;

public class resContentVO {
	private int resNo;
	private int s_no;
	private int memno;   
	private int petno;
	private char confirm;
	
	public resContentVO() {
		super();
	}

	public resContentVO(int resNo, int s_no, int memno, int petno, char confirm) {
		super();
		this.resNo = resNo;
		this.s_no = s_no;
		this.memno = memno;
		this.petno = petno;
		this.confirm = confirm;
	}

	public int getResNo() {
		return resNo;
	}

	public void setResNo(int resNo) {
		this.resNo = resNo;
	}

	public int getS_no() {
		return s_no;
	}

	public void setS_no(int s_no) {
		this.s_no = s_no;
	}

	public int getMemno() {
		return memno;
	}

	public void setMemno(int memno) {
		this.memno = memno;
	}

	public int getPetno() {
		return petno;
	}

	public void setPetno(int petno) {
		this.petno = petno;
	}

	public char getConfirm() {
		return confirm;
	}

	public void setConfirm(char confirm) {
		this.confirm = confirm;
	}
	
	
}

package com.herbmall.comments.model;

public class commentVO {
	private int no;
	private String name;
	private String pwd;
	private String regdate;
	private String content;
	private int bdno;
	
	public commentVO() {
		super();
	}
	
	public commentVO(int no, String name, String pwd, String regdate, String content, int bdno) {
		super();
		this.no = no;
		this.name = name;
		this.pwd = pwd;
		this.regdate = regdate;
		this.content = content;
		this.bdno = bdno;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getBdno() {
		return bdno;
	}
	public void setBdno(int bdno) {
		this.bdno = bdno;
	}
	
	
	

}

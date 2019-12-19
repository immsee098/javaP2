package com.model.sitterPre;

import java.sql.Timestamp;

public class sBoardVO {
	private int boardno;
	private String boardtitle;
	private String photo;
	private String area;
	private String address;
	private int pettype;
	private int price;
	private String boardetc;
	private int memno;
	private Timestamp regdate;
	
	
	public sBoardVO() {
		super();
	}

	public sBoardVO(int boardno, String boardtitle, String photo, String area, String address, int pettype, int price,
			String boardetc, int memno, Timestamp regdate) {
		super();
		this.boardno = boardno;
		this.boardtitle = boardtitle;
		this.photo = photo;
		this.area = area;
		this.address = address;
		this.pettype = pettype;
		this.price = price;
		this.boardetc = boardetc;
		this.memno = memno;
		this.regdate = regdate;
	}

	public int getBoardno() {
		return boardno;
	}

	public void setBoardno(int boardno) {
		this.boardno = boardno;
	}

	public String getBoardtitle() {
		return boardtitle;
	}

	public void setBoardtitle(String boardtitle) {
		this.boardtitle = boardtitle;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPettype() {
		return pettype;
	}

	public void setPettype(int pettype) {
		this.pettype = pettype;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBoardetc() {
		return boardetc;
	}

	public void setBoardetc(String boardetc) {
		this.boardetc = boardetc;
	}

	public int getMemno() {
		return memno;
	}

	public void setMemno(int memno) {
		this.memno = memno;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	

}

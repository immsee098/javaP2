package com.model.reservation;

public class petInfoVO {
	
	private int petno;
	private String petname;  
	private int pettype;
	private String petage;
	private String petphoto;
	private int petgender;
	private int petweight;
	private String petetc;
	private int memno;
	
	public petInfoVO() {
		super();
	}

	public petInfoVO(int petno, String petname, int pettype, String petage, String petphoto, int petgender,
			int petweight, String petetc, int memno) {
		super();
		this.petno = petno;
		this.petname = petname;
		this.pettype = pettype;
		this.petage = petage;
		this.petphoto = petphoto;
		this.petgender = petgender;
		this.petweight = petweight;
		this.petetc = petetc;
		this.memno = memno;
	}

	public int getPetno() {
		return petno;
	}

	public void setPetno(int petno) {
		this.petno = petno;
	}

	public String getPetname() {
		return petname;
	}

	public void setPetname(String petname) {
		this.petname = petname;
	}

	public int getPettype() {
		return pettype;
	}

	public void setPettype(int pettype) {
		this.pettype = pettype;
	}

	public String getPetage() {
		return petage;
	}

	public void setPetage(String petage) {
		this.petage = petage;
	}

	public String getPetphoto() {
		return petphoto;
	}

	public void setPetphoto(String petphoto) {
		this.petphoto = petphoto;
	}

	public int getPetgender() {
		return petgender;
	}

	public void setPetgender(int petgender) {
		this.petgender = petgender;
	}

	public int getPetweight() {
		return petweight;
	}

	public void setPetweight(int petweight) {
		this.petweight = petweight;
	}

	public String getPetetc() {
		return petetc;
	}

	public void setPetetc(String petetc) {
		this.petetc = petetc;
	}

	public int getMemno() {
		return memno;
	}

	public void setMemno(int memno) {
		this.memno = memno;
	}
	
	

}

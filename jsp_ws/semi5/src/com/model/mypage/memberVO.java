package com.model.mypage;

public class memberVO {
	private int memNo;
	private String id;
	private String pwd;
	private String memName;
	private String phoneNum;
	private String email;
	private String zipcode;
	private String address;
	private String addressDetail;
	private int career;
	private int s_PetType;
	private int s_CatCount;
	private int s_DogCount;
	private float s_Score;
	private int s_No;
	private String outdate;
	
	
	public memberVO() {
		super();
	}


	public memberVO(int memNo, String id, String pwd, String memName, String phoneNum, String email, String zipcode,
			String address, String addressDetail, int career, int s_PetType, int s_CatCount, int s_DogCount,
			float s_Score, int s_No, String outdate) {
		super();
		this.memNo = memNo;
		this.id = id;
		this.pwd = pwd;
		this.memName = memName;
		this.phoneNum = phoneNum;
		this.email = email;
		this.zipcode = zipcode;
		this.address = address;
		this.addressDetail = addressDetail;
		this.career = career;
		this.s_PetType = s_PetType;
		this.s_CatCount = s_CatCount;
		this.s_DogCount = s_DogCount;
		this.s_Score = s_Score;
		this.s_No = s_No;
		this.outdate = outdate;
	}


	public int getMemNo() {
		return memNo;
	}


	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getMemName() {
		return memName;
	}


	public void setMemName(String memName) {
		this.memName = memName;
	}


	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getAddressDetail() {
		return addressDetail;
	}


	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}


	public int getCareer() {
		return career;
	}


	public void setCareer(int career) {
		this.career = career;
	}


	public int getS_PetType() {
		return s_PetType;
	}


	public void setS_PetType(int s_PetType) {
		this.s_PetType = s_PetType;
	}


	public int getS_CatCount() {
		return s_CatCount;
	}


	public void setS_CatCount(int s_CatCount) {
		this.s_CatCount = s_CatCount;
	}


	public int getS_DogCount() {
		return s_DogCount;
	}


	public void setS_DogCount(int s_DogCount) {
		this.s_DogCount = s_DogCount;
	}


	public float getS_Score() {
		return s_Score;
	}


	public void setS_Score(float s_Score) {
		this.s_Score = s_Score;
	}


	public int getS_No() {
		return s_No;
	}


	public void setS_No(int s_No) {
		this.s_No = s_No;
	}


	public String getOutdate() {
		return outdate;
	}


	public void setOutdate(String outdate) {
		this.outdate = outdate;
	}
	
	
	
	
}

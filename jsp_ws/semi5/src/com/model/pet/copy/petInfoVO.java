package com.model.pet.copy;

public class petInfoVO {
	private int petNo;
	private String petName;
	private int petType;
	private String petAge;
	private String petPhoto;
	private int petGender;
	private int petWeight;
	private String petEtc;
	private int memNo;
	
	public petInfoVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public petInfoVO(int petNo, String petName, int petType, String petAge, String petPhoto, int petGender,
			int petWeight, String petEtc, int memNo) {
		super();
		this.petNo = petNo;
		this.petName = petName;
		this.petType = petType;
		this.petAge = petAge;
		this.petPhoto = petPhoto;
		this.petGender = petGender;
		this.petWeight = petWeight;
		this.petEtc = petEtc;
		this.memNo = memNo;
	}

	public int getPetNo() {
		return petNo;
	}

	public void setPetNo(int petNo) {
		this.petNo = petNo;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public int getPetType() {
		return petType;
	}

	public void setPetType(int petType) {
		this.petType = petType;
	}

	public String getPetAge() {
		return petAge;
	}

	public void setPetAge(String petAge) {
		this.petAge = petAge;
	}

	public String getPetPhoto() {
		return petPhoto;
	}

	public void setPetPhoto(String petPhoto) {
		this.petPhoto = petPhoto;
	}

	public int getPetGender() {
		return petGender;
	}

	public void setPetGender(int petGender) {
		this.petGender = petGender;
	}

	public int getPetWeight() {
		return petWeight;
	}

	public void setPetWeight(int petWeight) {
		this.petWeight = petWeight;
	}

	public String getPetEtc() {
		return petEtc;
	}

	public void setPetEtc(String petEtc) {
		this.petEtc = petEtc;
	}

	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}

	@Override
	public String toString() {
		return "petInfoVO [petNo=" + petNo + ", petName=" + petName + ", petType=" + petType + ", petAge=" + petAge
				+ ", petPhoto=" + petPhoto + ", petGender=" + petGender + ", petWeight=" + petWeight + ", petEtc="
				+ petEtc + ", memNo=" + memNo + "]";
	}

}

package com.day14;
import com.day14.Human;
public class Programmer extends Human {
	public String career;
	
	public void setCareer(String career) {
		this.career = career;
	}
	
	public String getCareer() {
		return career;
	}
	
	public void develop() {
		System.out.println("프로그래밍한다.");
	}
}

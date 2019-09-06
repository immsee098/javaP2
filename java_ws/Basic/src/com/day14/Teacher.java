package com.day14;

import com.day14.Human;

public class Teacher extends Human {
	public String major;
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void teacherWork() {
		System.out.println(major + "을 가리킨다");
	}
}

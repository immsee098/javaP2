package com.day12;

class Student {
	private String name;
	private int idNo;
	
	public void setname(String p_name) {
		name = p_name;
	}
	
	public String getname() {
		return name;
	}
	
	public void setidNo(int p_idNo) {
		idNo = p_idNo;
	}
	
	public int getidNo() {
		return idNo;
	}
	
}

public class StudentTest {

	public static void main(String[] args) {
		String a = "°¡³ª´Ù";
		int b = 35523;
		
		Student s = new Student();
		
		s.setname(a);
		s.setidNo(b);
		
		System.out.println(s.getname());
		System.out.println(s.getidNo());

	}

}

package com.java0919;

import java.util.ArrayList;
import java.util.Scanner;

class Emp {
	private int staffNum;
	private String staffName;
	private int salary;
	
	Emp(int staffNum, String staffName, int salary){
		this.staffNum = staffNum;
		this.staffName = staffName;
		this.salary = salary;
	}
	
	int getNum() {
		return staffNum;
	}
	
	String getName() {
		return staffName;
	}
	
	int getSalary() {
		return salary;
	}
	
	void setNum(int staffNum) {
		this.staffNum = staffNum;
	}
	
	void setName(String staffName){
		this.staffName = staffName;
	}
	
	void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return ("����̸�:"+staffName+", �繺��ȣ:"+staffNum+", �޿�:"+salary);
	}
	
}

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Emp> arr = new ArrayList<Emp>(3);
		
		for(int i=0; i<3; i++) {
			System.out.println("�����ȣ, ����̸�, �޿� �Է�");
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			int c = sc.nextInt();
			arr.add(new Emp(a, b, c));
		}
		
		for(Emp n: arr) {
			System.out.println(n.toString());
		}

	}

}

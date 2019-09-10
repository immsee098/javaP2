package com.java0909;

import java.util.Scanner;

class Employee{
	protected String name;
	
	public void setName(String name) {
		this.name =name;
	}
	
	public String getName() {
		return name;
	}
	
	public int findPay() {
		return 0;
	}
}

class Permanent extends Employee{
	private int salary;
	private int bonus;
	
	public void setsalary (int salary) {
		this.salary =salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setbonus (int bonus) {
		this.bonus =bonus;
	}
	
	public int getbonus() {
		return bonus;
	}
	
	public int findPay() {
		return salary+bonus;
	}
		
}

class Temporary extends Employee{
	private int time;
	private int pay;
	
	public void setTime (int time) {
		this.time = time;
	}
	
	public int getTime() {
		return time;
	}
	
	public void setPay (int pay) {
		this.pay = pay;
	}
	
	public int getPay() {
		return pay;
	}
	
	public int findPay() {
		return time*pay;
	}

}

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("고용형태-고용직<P>, 임시직<T>입력");
		
		String hire = sc.nextLine();
		
		switch(hire) {
			case "P":
				Permanent per = new Permanent();
				System.out.println("이름, 기본급여, 보너스 입력");
				String name = sc.nextLine();
				int salary = sc.nextInt();
				int bonus = sc.nextInt();
				per.setName(name); per.setbonus(bonus); per.setsalary(salary);
				System.out.println("고용형태 : 고용직" );
				System.out.println("이름:" + per.getName());
				System.out.println("급여:"+per.findPay());
				
			case "T":
				break;
				
			default:
				System.out.println("잘못입력");
				
		}
	}

}

package com.day12;

import java.util.Scanner;

class Temporary{
	private String name;
	private int time;
	private int pay;
	
	
	Temporary(String name, int time, int pay) {
		this.name = name;
		this.time = time;
		this.pay = pay;
	}
	
	public void getname(String p_name) {
		name = p_name;
	}
	
	public String setname() {
		return name;
	}
	
	public void gettime(int p_time) {
		time = p_time;
	}
	
	public int settime() {
		return time;
	}
	public void getpay(int p_pay) {
		pay = p_pay;
	}
	
	public int setpay() {
		return pay;
	}
	
	public int money() {
		return time*pay;
	}
	
}


public class TemporaryTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 일한 시간, 시간당 급여를 입력하세요");
		String name = sc.nextLine();
		int time = sc.nextInt();
		int pay = sc.nextInt();
		
		Temporary temp = new Temporary(name, time, pay);
		
		System.out.println(temp.money());

	}

}

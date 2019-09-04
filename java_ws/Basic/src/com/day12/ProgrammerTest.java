package com.day12;

import java.util.Scanner;

class Programmer {
	private String name;
	private String language;
	private int career;
	
	
	Programmer(String name, String lang, int career){
		this.name = name;
		this.language = lang;
		this.career = career;
	}
	
	public void getname(String p_name) {
		name = p_name;
	}
	
	public String setname() {
		return name;
	}
	
	public void getlanguage(String p_lang) {
		language = p_lang;
	}
	
	public String setlanguage() {
		return language;
	}
	
	public void getcareer(int p_career) {
		career = p_career;
	}
	
	public int setcareer() {
		return career;
	}
	
	public void work() {
		System.out.println("프로그래밍을 합니다.");
	}
	
	
}

public class ProgrammerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 개별언어, 개발경력 입력");
		String a = sc.nextLine();
		String b = sc.nextLine();
		int c = sc.nextInt();
		
		Programmer po = new Programmer(a, b, c);
//		po.getname(a);
//		po.getlanguage(b);
//		po.getcareer(c);
//		
		System.out.println(po.setname());
		System.out.println(po.setlanguage());
		System.out.println(po.setcareer());
		po.work();
	}

}

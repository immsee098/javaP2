package com.day14;

import java.util.Scanner;

public class HumanTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String major = sc.nextLine();
		
		Teacher te = new Teacher();
		
		te.setAge(age);
		te.setMajor(major);
		te.setName(name);
		
		System.out.println("�̸�:"+te.getName());
		System.out.println("����:" +te.getAge());
		te.teacherWork();

	}

}

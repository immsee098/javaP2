package com.java0924;

import java.util.Calendar;
import java.util.Scanner;

public class DateTest2 {

	public static void main(String[] args) {
		final String[] WEEK = {"", "��", "��", "ȭ", "��","��","��","��"};
		Calendar date1 = Calendar.getInstance(); 
		Calendar date2 = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int date = sc.nextInt(); 
		date1.set(year, month-1, date);
		long difference =(date2.getTimeInMillis() - date1.getTimeInMillis())/1000; 
		System.out.println("���� :  "+ difference/(24*60*60) +"��"); 
		
		StringBuilder str = new StringBuilder().append("������").append(333).append('f').append(true).append(3.14f);
		System.out.println(str);
		str.insert(3, "hello");
		System.out.println(str);

	}

}

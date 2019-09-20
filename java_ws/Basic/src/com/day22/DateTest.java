package com.day22;

import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date d = new Date();
		
		System.out.println("d="+d);
		System.out.println(d.toLocaleString());
		
		int year = d.getYear();
		int month = d.getMonth();
		int date = d.getDate();
		int day = d.getDay();
		
		System.out.println((year+1900)+"��, "+ (month+1)+"��, "+date+"��, "+day+"����");
		
		System.out.println(d.getHours()+"�� " +d.getMinutes()+"��"+d.getSeconds()+"��");
		 
		long gap = d.getTime(); //1970-01-01 00:00:00���� ����� �ð��� �и��ʷ� ȯ��
		System.out.println(gap+"�и���");		//1��=1000�и���
		
		gap = gap/1000; //��
		gap = gap/(60*60*24);
		System.out.println(gap+"��");
		
		int a = Calendar.YEAR;
		System.out.println(a);
	}

}

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
		
		System.out.println((year+1900)+"년, "+ (month+1)+"월, "+date+"일, "+day+"요일");
		
		System.out.println(d.getHours()+"시 " +d.getMinutes()+"분"+d.getSeconds()+"초");
		 
		long gap = d.getTime(); //1970-01-01 00:00:00이후 경과된 시간을 밀리초로 환산
		System.out.println(gap+"밀리초");		//1초=1000밀리초
		
		gap = gap/1000; //초
		gap = gap/(60*60*24);
		System.out.println(gap+"일");
		
		int a = Calendar.YEAR;
		System.out.println(a);
	}

}

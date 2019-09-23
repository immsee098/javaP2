package com.java0923;

import java.util.Date;

public class DateTest1 {

	public static void main(String[] args) {
		//Date date = new Date();  //현재 날짜
//		System.out.println("현재 날짜:"+date); 
//		System.out.println("현재 날짜:" +date.toLocaleString() );
//		int year = date.getYear(); 
//		int month = date.getMonth(); //0~11 
//		int day = date.getDate(); 
//		int hours = date.getHours(); 
//		int minutes = date.getMinutes(); 
//		int seconds = date.getSeconds(); 
//		System.out.println("year : " + (year+1900)); 
//		System.out.println("month : " + (month+1));  // month+1 해야 함 
//		System.out.println("day : " + day); 
//		System.out.println("hours : " + hours); 
//		System.out.println("minutes : " + minutes); 
//		System.out.println("seconds : " + seconds); 
//		System.out.println("요일 : " + date.getDay()); //0:일요일
		//현재의 시간을 1970년 1월1일 0시 0분 0초를 기준으로 밀리초 단위로 환산 
		Date date = new Date();
		date.setYear(2017-1900);
		date.setMonth(9);
		date.setDate(19);
		date.setHours(14);
		date.setMinutes(26);
		date.setSeconds(17);
		long diff = date.getTime()/1000; 
		diff = diff/(24*60*60);  
		System.out.println("1970-01-01부터 오늘까지 경과된 일 수 : " + diff +"일");
		
		

	}

}

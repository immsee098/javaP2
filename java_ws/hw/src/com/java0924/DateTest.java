package com.java0924;

import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
//		Date date = new Date();  
//		int year = date.getYear(); 
//		int month = date.getMonth(); 
//		int day = date.getDate(); 
//		int hours = date.getHours(); 
//		int minutes = date.getMinutes(); 
//		int seconds = date.getSeconds(); 
//
//	
//	
//		long diff = date.getTime()/1000; 
//		diff = diff/(24*60*60);  
//		System.out.println("���ñ��� ����� �� �� : " + diff +"��");
		
		
		Calendar cal = Calendar.getInstance();
		
		long diff2 = cal.getTimeInMillis()/1000;
		diff2 = diff2/(24*60*60); 
		System.out.println(diff2);
		

	}

}

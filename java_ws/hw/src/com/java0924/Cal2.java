package com.java0924;

import java.util.Calendar;

public class Cal2 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();  
		System.out.println(showDate(date)); 
		System.out.println("==========7개월 후========="); 
		date.add(Calendar.MONTH, 7); 
		System.out.println(showDate(date));

	}
	public static String showDate(Calendar date) { 
		return date.get(Calendar.YEAR)+"년 " + (date.get(Calendar.MONTH)+1) + "월 " + date.get(Calendar.DATE) + "일"; 
		} 

}

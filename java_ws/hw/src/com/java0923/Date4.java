package com.java0923;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date4 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2017, 8, 19);
		
		long diff = cal.getTimeInMillis()/1000;
		diff = diff/(24*60*60); 
		System.out.println(diff);

	}

}

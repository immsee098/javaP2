package com.day22;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		GregorianCalendar gcal = new GregorianCalendar();
		Calendar cal2 = new GregorianCalendar(2019, 3, 15);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		int date2 = cal.get(Calendar.DAY_OF_MONTH);

	}

}

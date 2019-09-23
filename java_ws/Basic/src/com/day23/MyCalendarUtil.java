package com.day23;

import java.util.Calendar;

public class MyCalendarUtil {
	
	public static String findDate(Calendar cal) {
		return cal.get(Calendar.YEAR) + "-"
				+ (cal.get(Calendar.MONTH)+1)
				+ "-" + cal.get(Calendar.DAY_OF_MONTH);
	}

}

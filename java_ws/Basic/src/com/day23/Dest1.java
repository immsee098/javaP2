package com.day23;

import java.util.Calendar;

public class Dest1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2019,4,22);
		
		long gap=cal.getTimeInMillis()-cal2.getTimeInMillis();
		gap=gap/(24*60*60);
		System.out.println(gap);
	}

}

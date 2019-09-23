package com.day23;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateConvert {

	public static void main(String[] args) {
		// Calendar�� Date�� ��ȯ
		Calendar cal = new GregorianCalendar(2019, 9, 1);
		Date d = cal.getTime();
		System.out.println(d.toLocaleString());
		
		//�Ǵ�
		Date d2 = new Date(cal.getTimeInMillis());
		System.out.println(d2.toLocaleString());
		
		//Date�� Calendar�� ��ȯ
		Date date = new Date(2019-1900, 5, 13); //2019-06-13
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date);
		System.out.println(MyCalendarUtil.findDate(cal2));
	}

}

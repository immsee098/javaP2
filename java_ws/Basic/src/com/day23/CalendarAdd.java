package com.day23;

import java.util.Calendar;

public class CalendarAdd {

	public static void main(String[] args) {
		// 100일 후, 6개월 전
		
		Calendar cal = Calendar.getInstance();
		System.out.println("현재일자:"+MyCalendarUtil.findDate(cal));

		//100일 후
		cal.add(Calendar.DAY_OF_MONTH, 100);
		System.out.println("100일 후:"+MyCalendarUtil.findDate(cal));
		
		//6개월 전
		cal.add(Calendar.MONTH, -6);
		System.out.println("변경된 일자 기준 6개월 전:"+MyCalendarUtil.findDate(cal));
		
		//7년 전
		cal.add(Calendar.YEAR, -7);
		System.out.println("변경된 일자 기준 7년전:"+MyCalendarUtil.findDate(cal));
		
	}
	
//	public static String findDate(Calendar cal) {
//		return cal.get(Calendar.YEAR) + "-"
//				+ (cal.get(Calendar.MONTH)+1)
//				+ "-" + cal.get(Calendar.DAY_OF_MONTH);
//	}

}

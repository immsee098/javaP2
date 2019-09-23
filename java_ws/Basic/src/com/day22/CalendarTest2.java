package com.day22;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {
		String[] week = {"", "일", "월", "화", "수", "목","금","토"};
		Calendar cal = Calendar.getInstance();
		int idx = cal.DAY_OF_WEEK;
		System.out.println("요일:"+ week[idx]);
		
		//두 날짜 사이의 간격 구하기
		//개강일로부터 얼마나 지났는지
		Calendar startDay = Calendar.getInstance();
		startDay.set(2019, 7, 20);
		
		long gap = (cal.getTimeInMillis()-startDay.getTimeInMillis()/1000);
		gap = gap/(24*60*60);
		System.out.println("개강일로부터 "+gap+"경과됨");

	}

}

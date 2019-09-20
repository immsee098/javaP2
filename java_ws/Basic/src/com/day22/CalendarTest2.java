package com.day22;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {
		String[] week = {"", "일", "월", "화", "수", "목","금","토"};
		Calendar cal = Calendar.getInstance();
		int day = cal.DAY_OF_WEEK;
		System.out.println("요일:"+ week[day-1]);
		
		//두 날짜 사이의 간격 구하기
		//개강일로부터 얼마나 지났는지

	}

}

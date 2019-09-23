package com.day23;

import java.util.Date;

public class DateDiff {

	public static void main(String[] args) {
		//2019-12-31까지 며칠 남았는지
		Date today = new Date();
		Date baseDay = new Date(2019-1900,11,31);
		
		long gap = (baseDay.getTime() - today.getTime())/1000;
		gap = gap/(24*60*60);
		
		System.out.println("올해 마지막 날까지 "+gap+"일 남앆다");

	}

}

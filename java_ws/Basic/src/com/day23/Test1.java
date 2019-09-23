package com.day23;

import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		Date today = new Date();
		Date baseDay = new Date(2019-1999,8,24);
		
		long gap=(baseDay.getTime()-today.getTime())/1000;
		gap = gap/(24*60*60);
		
		System.out.println("올해 마지막 날까지 "+gap);
	}

}

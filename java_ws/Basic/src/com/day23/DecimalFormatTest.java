package com.day23;

import java.text.DecimalFormat;

public class DecimalFormatTest {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		double num = 1234567.89512;
		
		
		String str = df.format(num);
		System.out.println("num="+num);
		System.out.println("#,###.##=>" + str);
		
		//
		DecimalFormat df2 = new DecimalFormat("#,###.00");
		str = df2.format(num);
		System.out.println("#,###.00=>"+str);
		
		DecimalFormat df3 = new DecimalFormat("#,###");
		
		str= df3.format(num);
		System.out.println("#,###=>"+str);
		
	}
}
	

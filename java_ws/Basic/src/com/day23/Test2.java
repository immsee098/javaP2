package com.day23;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n��¥�� �Է��ϼ���: ");
		String dd = sc.nextLine();
		
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date date = df.parse(dd);
			System.out.println((date.getYear()+1900)+"�� "+(date.getMonth()+1)+"�� "+date.getDate()+"��");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		
	}

}

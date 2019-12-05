package com.tips.model;

public class TravelExpert {
	public String getTip(String city) {
		String result="";
		
		switch(city) {
			case "강릉":
				result="정동진";
				break;
			case "강화":
				result="석모도";
				break;
			case "해남":
				result="땅끝마을";
				break;
			case "거제":
				result="외도";
				break;				
		}
		return result;
	}
}

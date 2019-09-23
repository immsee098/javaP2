package com.day23;

class Time{
	private int[] hours;
	
	Time(int[] hours){
		this.hours = hours;
	}
	
	void setHour(int hour) {
		hours[0] = hour;
	}
	
	void setMin(int min) {
		hours[1] = min;
	}
	
	void setSec(int sec) {
		hours[2] = sec;
	}
	
	int getHour() {
		return hours[0];
	}
	
	int getMin() {
		return hours[1];
	}
	
	int getSec() {
		return hours[2];
	}
	
	void incrementHour() {
		hours[0]++;
		hours[1]++;
		hours[2]++;
	}
	
}

public class TimeTest {

	public static void main(String[] args) {
		int[] hours = {12, 30, 45};
		Time ti = new Time(hours);
		
		ti.incrementHour();
		
		System.out.println("------1시간 1분 1초 후 -------");
		System.out.println(ti.getHour()+" : "+ti.getMin()+" : "+ti.getSec());

	}

}

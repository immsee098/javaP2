package com.day12;

class Time {
	private int hour;
	private int min;
	private int sec;
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int h) {
		if(h<0 || h>23) {
			System.out.println("잘못된 시간입니다");
			return;
		} else {
			hour=h;
		}
	}
	
	public int getMin() {
		return min;
	}
	
	
	public void setMin(int m) {
		if(m<0 || m>59) {
			System.out.println("잘못된 분입니다");
		} else {
			min = m;
		}
	}
	
	public void setSec(int s) {
		if(s<0 || s>59) {
			System.out.println("잘못된 초입니다");
		} else {
			sec = s;
		}
	}
	
	public int getSec() {
		return sec;
	}
}

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(12);
		t.setMin(47);
		t.setSec(50);
		
		System.out.println(t.getHour()+"시 "+t.getMin()+"분 "+t.getSec()+"초");
		
	}

}

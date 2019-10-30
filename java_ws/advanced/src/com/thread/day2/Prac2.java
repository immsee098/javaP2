package com.thread.day2;

import javax.swing.JOptionPane;

public class Prac2 {

	public static void main(String[] args) {
		PThread1 th1 = new PThread1();
		PThread2 th2 = new PThread2("http://www.naver.com");
		th1.start();
		th2.start();

	}

}

class PThread1 extends Thread{

	@Override
	public void run() {
		String jumin = JOptionPane.showInputDialog("주민등록번호를 입력하세요");
		int age = 1900+Integer.parseInt(jumin.substring(0,2));
		String month = jumin.substring(2,4);
		String day = jumin.substring(4,6);
		int gender = Integer.parseInt(jumin.substring(7,8));
		String g = "";
	
		if(gender==1) {
			g="남";
		} else if(gender==2) {
			g="여";
		}
		System.out.println(age+"-"+month+"-"+day);
		System.out.println("성별:"+g);
	}
}

class PThread2 extends Thread{
	String site;
	public PThread2(String site) {
		this.site=site;
	}
	
	@Override
	public void run() {
		for(int i=0; i<101; i+=10) {
			System.out.println(site+"에서 "+ i+"% 다운로드 중...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}

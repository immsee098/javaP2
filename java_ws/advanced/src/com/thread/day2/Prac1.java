package com.thread.day2;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Prac1 {

	public static void main(String[] args) {
		
		PracThread1 th1 = new PracThread1();
		PracThread2 th2 = new PracThread2();
		th1.start();
		th2.start();
	}

}

class PracThread1 extends Thread {
	public void run() {
		String inputnum = JOptionPane.showInputDialog("입력하세요");
		int sum = 0;
		for(int i=1; i<Integer.parseInt(inputnum); i++) {
			sum += i;
		}
		System.out.println("값은... "+sum);
	}
}

class PracThread2 extends Thread {
	public void run() {
		for(int i=0;i<5; i++) {
			long time = System.currentTimeMillis(); 
			SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
			String str = dayTime.format(new Date(time));

			System.out.println("현재시간:"+str);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

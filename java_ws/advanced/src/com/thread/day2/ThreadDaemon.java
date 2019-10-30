package com.thread.day2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ThreadDaemon {

	public static void main(String[] args) {
		System.out.println("main 시작");
		
		MyThread2 th1=new MyThread2();
		th1.setDaemon(true);//일반 쓰레드가 모두 종료되면 th1은 강제적으로 자동 종료
		//<= Daemon쓰레드
		
		th1.start();
		
		MyRunnable2 r=new MyRunnable2();
		Thread th2=new Thread(r);
		th2.start();
		
		for(int i=0;i<100;i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("main 쓰레드 종료!");
	}

}

class MyThread2 extends Thread{
	@Override
	public void run() {
		SimpleDateFormat sdf 
			= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		while(true) {
			Date d = new Date();
			
			System.out.println("[현재시간] " + sdf.format(d));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
	}
}

class MyRunnable2 implements Runnable{

	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자 입력!");
		int n=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		
		System.out.println("\n\n1~"+n+"까지의 합:"+ sum);
	}
	
}

package com.thread.day2;

public class ThreadPriority {
	static long startTime;
	
	public static void main(String[] args) {
		startTime=System.currentTimeMillis();
		System.out.println("startTime="+ startTime);
		
		MyThread1 th1=new MyThread1();
		th1.setPriority(Thread.MAX_PRIORITY); //10
		
		MyRunnable1 r=new MyRunnable1();
		Thread th2 = new Thread(r); //5
		
		System.out.println("MyThread1의 우선순위:"+ th1.getPriority());
		System.out.println("MyRunnable1의 우선순위:"+ th2.getPriority());
		
		th1.start();
		th2.start();
		
		System.out.println("main 쓰레드 종료!");
	}

}

class MyThread1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10000;i++) {
			System.out.print("-");
		}
		
		System.out.println("\n\nMyThread1 소요시간 : " 
			+( System.currentTimeMillis()- ThreadPriority.startTime));
	}
}

class MyRunnable1 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10000;i++) {
			System.out.print("2");
		}
		
		System.out.println("\n\nMyRunnable1 소요시간 : " 
			+( System.currentTimeMillis()- ThreadPriority.startTime));
	}
	
}

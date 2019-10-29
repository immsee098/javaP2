package com.thread.day1;

public class ThreadTest2 {

	public static void main(String[] args) {
		System.out.println("main�޼����Դϴ�.");
		
		MyThread1 th=new MyThread1();
		th.setName("MyThread1");
		th.start();
		
		MyRunnable r = new MyRunnable();
		Thread th2 = new Thread(r);
		th2.start();
		
		System.out.println("main�޼��� ����!");
	}

	
}

class MyThread1 extends Thread{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("i="+i+", "+getName());
		}
	}	
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}


package com.thread.day1;

import javax.swing.JOptionPane;

public class ThreadTest5 {
	static boolean inputCheck=false;
	
	public static void main(String[] args) {
		MyThread3 th=new MyThread3();
		th.start();
		
		MyRunnable3 r = new MyRunnable3();
		Thread th2=  new Thread(r);
		th2.start();
	}

}

class MyThread3 extends Thread{
	@Override
	public void run() {
		System.out.println("10초동안 값을 입력하세요");
		String s=JOptionPane.showInputDialog("입력!!!");
		ThreadTest5.inputCheck=true;
		
		System.out.println("입력값="+ s);
	}
}

class MyRunnable3 implements Runnable{

	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			if(ThreadTest5.inputCheck) return;
			
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("10초동안 값을 입력하지 않아 종료합니다.");
		System.exit(0);
	}
	
}
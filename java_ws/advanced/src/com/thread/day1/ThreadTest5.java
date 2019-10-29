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
		System.out.println("10�ʵ��� ���� �Է��ϼ���");
		String s=JOptionPane.showInputDialog("�Է�!!!");
		ThreadTest5.inputCheck=true;
		
		System.out.println("�Է°�="+ s);
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
		
		System.out.println("10�ʵ��� ���� �Է����� �ʾ� �����մϴ�.");
		System.exit(0);
	}
	
}
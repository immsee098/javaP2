package com.thread.day1;

import javax.swing.JOptionPane;

public class ThreadTest4 {

	public static void main(String[] args) {
		MyThread2 th = new MyThread2();
		th.start();
		
		String val=JOptionPane.showInputDialog("ÀÔ·Â!");
		System.out.println("°ª:"+val);		
	}

}

class MyThread2 extends Thread{

	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println("i="+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

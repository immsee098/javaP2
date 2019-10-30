package com.thread.day2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ThreadDaemon {

	public static void main(String[] args) {
		System.out.println("main ����");
		
		MyThread2 th1=new MyThread2();
		th1.setDaemon(true);//�Ϲ� �����尡 ��� ����Ǹ� th1�� ���������� �ڵ� ����
		//<= Daemon������
		
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
		
		System.out.println("main ������ ����!");
	}

}

class MyThread2 extends Thread{
	@Override
	public void run() {
		SimpleDateFormat sdf 
			= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		while(true) {
			Date d = new Date();
			
			System.out.println("[����ð�] " + sdf.format(d));
			
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
		System.out.println("���� �Է�!");
		int n=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		
		System.out.println("\n\n1~"+n+"������ ��:"+ sum);
	}
	
}

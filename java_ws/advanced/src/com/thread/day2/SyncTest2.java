package com.thread.day2;

public class SyncTest2 {

	public static void main(String[] args) {
		Circle c = new Circle();
		MyThread th1=new MyThread(c);
		th1.start();
		
		MyThread th2=new MyThread(c);
		th2.start();
		
	}

}

class Circle{
	int radius;
}

class MyThread extends Thread{
	Circle c;
	
	MyThread(Circle c){
		this.c=c;
	}
	
	@Override
	public void run() {
		int localVal=0;
		String name=Thread.currentThread().getName();
		
		for(int i=0;i<4;i++) {
			System.out.println(name+" : localVal=" + ++localVal);
			System.out.println(name+" : c.radius=======>"+ ++c.radius);
		}
	}
	
}

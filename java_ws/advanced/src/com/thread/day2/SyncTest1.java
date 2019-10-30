package com.thread.day2;

public class SyncTest1 {

	public static void main(String[] args) {
		MyRunnable3 r=new MyRunnable3();
		Thread th1=new Thread(r);
		th1.start();
		
		Thread th2=new Thread(r);
		th2.start();
		
	}

}

class MyRunnable3 implements Runnable{
	int insVar;
	
	@Override
	public void run() {
		int localVar=0;
		
		String thName=Thread.currentThread().getName();
		
		for(int i=0;i<3;i++) {
			System.out.println("["+thName+"] localVar="+ ++localVar);
			System.out.println("["+thName+"] insVar=======>"
					+ ++insVar+"\n");			
		}		
	}
	
}
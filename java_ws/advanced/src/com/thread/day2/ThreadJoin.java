package com.thread.day2;

public class ThreadJoin {

	public static void main(String[] args) {
		System.out.println("main 시작");
		
		MyThread2 th1=new MyThread2();
		th1.setDaemon(true);//일반 쓰레드가 모두 종료되면 th1은 강제적으로 자동 종료
		//<= Daemon쓰레드			
		
		MyRunnable2 r=new MyRunnable2();
		Thread th2=new Thread(r);
		th2.start();
		
		try {
			th2.join();//1~n까지의 합=>main 쓰레드는 th2의 작업이 끝날 때까지 기다린다. 

			/*
			  지정된 시간동안 스레드가 실행되도록 한다 
			  지정된 시간이 지나거나 작업이 종료되면 join()을 호출한 스레드로 
			  다시 돌아와 실행을 계속한다
			 */
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}	
		
		th1.start(); //현재시간 출력
		
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


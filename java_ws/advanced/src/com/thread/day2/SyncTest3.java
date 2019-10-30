package com.thread.day2;

public class SyncTest3 {

	public static void main(String[] args) {
		MyRunnable4 r = new MyRunnable4();
		Thread th1=new Thread(r);
		Thread th2=new Thread(r);

		th1.start();
		th2.start();
	}

}

class Account{
	int balance=1000;
	/*
	public synchronized void  withdraw(int money) {
		if(balance>=money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			balance-=money;
		}
	}*/

	public void withdraw(int money) {
		synchronized (this) {
			if(balance>=money) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				balance-=money;
			}
		}
	}


}

class MyRunnable4 implements Runnable{
	Account acc=new Account();

	@Override
	public void run() {
		while(acc.balance>0) {
			int money=(int)(Math.random()*3+1)*100; //100,200,300
			acc.withdraw(money);

			System.out.println(Thread.currentThread().getName()+
					" : money="+money+", Ãâ±İÈÄ acc.balance="+acc.balance);
		}
	}

}
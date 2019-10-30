package com.thread.day2;

public class ThreadJoin {

	public static void main(String[] args) {
		System.out.println("main ����");
		
		MyThread2 th1=new MyThread2();
		th1.setDaemon(true);//�Ϲ� �����尡 ��� ����Ǹ� th1�� ���������� �ڵ� ����
		//<= Daemon������			
		
		MyRunnable2 r=new MyRunnable2();
		Thread th2=new Thread(r);
		th2.start();
		
		try {
			th2.join();//1~n������ ��=>main ������� th2�� �۾��� ���� ������ ��ٸ���. 

			/*
			  ������ �ð����� �����尡 ����ǵ��� �Ѵ� 
			  ������ �ð��� �����ų� �۾��� ����Ǹ� join()�� ȣ���� ������� 
			  �ٽ� ���ƿ� ������ ����Ѵ�
			 */
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}	
		
		th1.start(); //����ð� ���
		
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


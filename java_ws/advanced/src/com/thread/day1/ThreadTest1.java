package com.thread.day1;

public class ThreadTest1 {

	public static void main(String[] args) {
		System.out.println("main �޼����Դϴ�.");
		
		Thread curThread=Thread.currentThread();
		System.out.println("���� �������� ������ �̸�:"+curThread.getName());
		
		System.out.println("���� �������� ������ ����:"
				+Thread.activeCount());
		
		Thread.currentThread().setName("Prime"); //������ �̸� ����
		System.out.println("����� ������ �̸�:"
				+ Thread.currentThread().getName());
		
	}

}

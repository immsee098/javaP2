package com.thread.day1;

import javax.swing.JOptionPane;

public class ThreadTest3 {

	public static void main(String[] args) {
		String n=JOptionPane.showInputDialog("���� �Է��ϼ���");
		
		System.out.println("�Է°� ="+ n);
		
		for(int i=10;i>0;i--) {
			System.out.println(i);
			
			try {
				Thread.sleep(500); //0.5�� ���� �Ͻ�����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}

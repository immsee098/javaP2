package com.thread.day1;

import javax.swing.JOptionPane;

public class ThreadTest3 {

	public static void main(String[] args) {
		String n=JOptionPane.showInputDialog("값을 입력하세요");
		
		System.out.println("입력값 ="+ n);
		
		for(int i=10;i>0;i--) {
			System.out.println(i);
			
			try {
				Thread.sleep(500); //0.5초 동안 일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}

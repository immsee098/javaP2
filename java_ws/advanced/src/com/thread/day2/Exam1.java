package com.thread.day2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Exam1 {
	public static void main(String[] args){		
		MyTh th1=new MyTh("http://www.nate.com");
		th1.start();
		
		MyRun r = new MyRun();
		Thread th2 = new Thread(r);
		th2.start();
	}
}

class MyTh extends Thread{
	String site;

	public MyTh(String site) {
		this.site=site; 
	}

	public void run(){
		for (int i=0;i<=100 ;i+=10 ){		
			System.out.println(site + "���� " + i +"% �ٿ�ε� ��..");
			
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}//for
	}
}//class


class MyRun implements Runnable{

	@Override
	public void run() {
		String idNo 
			= JOptionPane.showInputDialog("�ֹε�Ϲ�ȣ�� �Է��ϼ���!(��:920125-1112222)");
		String year = idNo.substring(0,2);
		String month = idNo.substring(2,4);
		String day = idNo.substring(4,6);
		String g = idNo.substring(7,8);
		String gender="";
		if (g.equals("1") || g.equals("3"))	{
			gender = "��";
		}else{
			gender = "��";		
		}

		if (g.equals("1") || g.equals("2")){
			year = "19" + year;
		}else{
			year = "20" + year;
		}
		System.out.println("�ֹι�ȣ : " + idNo);
		System.out.println("���� : " + year + "-" + month + "-" + day);
		System.out.println("���� : " +gender);

		//------------------------------
		DateFormat df = new SimpleDateFormat("yyMMdd");
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");

		try {
			//990105
			Date date = df.parse(idNo.substring(0, 6));
			System.out.println("���� : "+df2.format(date));
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}


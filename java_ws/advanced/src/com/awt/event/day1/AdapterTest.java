package com.awt.event.day1;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdapterTest extends Frame{

	public AdapterTest(){
		super("Adpater연습");
		
		//이벤트 연결
		//1. 익명 클래스 이용
		/*this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				//e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
			
		});
		//=> 이벤트 리스너를 직접 구현하는 대신에 Adapter 클래스를 상속받아서 
		//원하는 메서드만 오버라이딩하면 됨
		 */
		
		//2. 내부 클래스 이용
		this.addWindowListener(new EventHandler());
		
		this.setSize(400, 300);
		this.setVisible(true);		
	}
	
	//내부 클래스
	class EventHandler extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			//e.getWindow().setVisible(false);
			e.getWindow().dispose();
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		AdapterTest f = new AdapterTest();
		
	}

}

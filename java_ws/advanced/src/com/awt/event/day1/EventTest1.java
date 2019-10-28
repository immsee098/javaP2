package com.awt.event.day1;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventTest1 extends Frame{
	
	public EventTest1(){
		super("Event연습1");
		
		//Frame의 닫기 버튼을 눌렀을 때 Frame이 닫히도록 하기
		//이벤트 소스 : Frame
		//이벤트 리스너 : WindowListener
		
		//이벤트 소스에 이벤트 리스너로 이벤트 핸들러를 연결한다 
		//이벤트 연결하기
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public static void main(String[] args) {
		EventTest1 f = new EventTest1();
		f.setSize(400, 300);
		f.setVisible(true);
		
	}

}

package com.awt.event.day1;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventTest1 extends Frame{
	
	public EventTest1(){
		super("Event����1");
		
		//Frame�� �ݱ� ��ư�� ������ �� Frame�� �������� �ϱ�
		//�̺�Ʈ �ҽ� : Frame
		//�̺�Ʈ ������ : WindowListener
		
		//�̺�Ʈ �ҽ��� �̺�Ʈ �����ʷ� �̺�Ʈ �ڵ鷯�� �����Ѵ� 
		//�̺�Ʈ �����ϱ�
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

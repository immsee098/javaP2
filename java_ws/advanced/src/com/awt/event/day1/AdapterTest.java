package com.awt.event.day1;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdapterTest extends Frame{

	public AdapterTest(){
		super("Adpater����");
		
		//�̺�Ʈ ����
		//1. �͸� Ŭ���� �̿�
		/*this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				//e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
			
		});
		//=> �̺�Ʈ �����ʸ� ���� �����ϴ� ��ſ� Adapter Ŭ������ ��ӹ޾Ƽ� 
		//���ϴ� �޼��常 �������̵��ϸ� ��
		 */
		
		//2. ���� Ŭ���� �̿�
		this.addWindowListener(new EventHandler());
		
		this.setSize(400, 300);
		this.setVisible(true);		
	}
	
	//���� Ŭ����
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

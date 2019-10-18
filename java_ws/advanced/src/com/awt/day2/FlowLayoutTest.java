package com.awt.day2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutTest {

	public static void main(String[] args) {
		// FlowLayout - ������Ʈ���� �߰��Ǵ� ������ ���� ���ʿ��� ���������� �̾���������,
		//				������ �����ϸ� �Ʒ��ٿ� �߰���
		//				������Ʈ�� �����ӻ� ���ʴ�� ��ġ
		
		Frame f = new Frame("FlowLayout ����");
		
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		f.add(new Button("ù����"));
		f.add(new Button("�ι���"));
		f.add(new Button("������"));
		f.add(new Button("�׹���"));
		f.add(new Button("�ټ�����"));
		f.setSize(250, 200);
		f.setVisible(true);
	}

}

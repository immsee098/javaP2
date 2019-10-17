package com.awt.day1;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;

public class CheckBoxTest {

	public static void main(String[] args) {
		Frame f = new Frame("Checkbox ����");
		f.setLayout(new FlowLayout());
		
		//üũ�ڽ� - ���� ���� ����
		Checkbox ck = new Checkbox("���");
		Checkbox ck2 = new Checkbox("��");
		Checkbox ck3 = new Checkbox("��", true);
		
		//���� ��ư - �ϳ��� ����
		CheckboxGroup group = new CheckboxGroup();
		Checkbox ckM=new Checkbox("����", group, true);
		Checkbox ckF=new Checkbox("����", group, false);
		/*public Checkbox(String label,
                CheckboxGroup group, boolean state)*/
		
		
		f.add(ck);
		f.add(ck2);
		f.add(ck3);
		f.add(ckM);
		f.add(ckF);
		
		f.setSize(400, 300);
		f.setVisible(true);
	}

}

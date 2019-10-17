package com.awt.day1;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;

public class CheckBoxTest {

	public static void main(String[] args) {
		Frame f = new Frame("Checkbox 연습");
		f.setLayout(new FlowLayout());
		
		//체크박스 - 다중 선택 가능
		Checkbox ck = new Checkbox("사과");
		Checkbox ck2 = new Checkbox("배");
		Checkbox ck3 = new Checkbox("귤", true);
		
		//라디오 버튼 - 하나만 선택
		CheckboxGroup group = new CheckboxGroup();
		Checkbox ckM=new Checkbox("남자", group, true);
		Checkbox ckF=new Checkbox("여자", group, false);
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

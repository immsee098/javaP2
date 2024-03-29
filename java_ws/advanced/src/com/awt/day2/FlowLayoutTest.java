package com.awt.day2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutTest {

	public static void main(String[] args) {
		//FlowLayout - 컴포넌트들이 추가되는순서에 따라 왼쪽에서 오른쪽으로 
		//				이어져나가며, 공간이 부족하면 아랫줄에 추가됨
		//				컴포넌트를 프레임상에 원래의 크기대로 차례차례 배치
		Frame f = new Frame("FlowLayout 연습");
		
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		f.add(new Button("첫번째"));
		f.add(new Button("두번째"));
		f.add(new Button("세번째"));
		f.add(new Button("네번째"));
		f.add(new Button("다섯번째"));
		
		f.setSize(250, 200);
		f.setVisible(true);
		
	}

}

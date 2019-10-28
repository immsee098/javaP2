package com.awt.day2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutTest {

	public static void main(String[] args) {
		/*
		 BorderLayout - 컨테이너를 North, South, East, West, Center 
		 	모두 5개의 영역으로 나누고, 각 영역에 하나의 컴포넌트만을 배치할 수 있도록 함
			-한 영역에 여러 개의 컴포넌트를 배치하면, 마지막에 추가한 컴포넌트만 보이게 됨
			-한 영역에 하나 이상의 컴포넌트를 넣기 위해 Panel을 이용해야 함
		  */

		Frame f= new Frame("BorderLayout연습");
		
		//f.setLayout(new BorderLayout()); //생략 가능
		//=> Frame은 기본레이아웃이 BorderLayout이므로
		
		Button btN = new Button("북");
		Button btS = new Button("남");
		Button btE = new Button("동");
		Button btW = new Button("서");
		Button btC = new Button("가운데");
		
		f.add(btC,"Center");
		f.add(btE,"East");
		f.add("West", btW);
		f.add("South", btS);
		f.add(btN,BorderLayout.NORTH);
		
		f.setSize(400, 300);
		f.setVisible(true);		
		
	}

}

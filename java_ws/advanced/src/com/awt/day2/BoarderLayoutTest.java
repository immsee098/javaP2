package com.awt.day2;

import java.awt.Button;
import java.awt.Frame;

public class BoarderLayoutTest {
	public static void main(String[] args) {
		Frame f = new Frame("BoarderLayout 연습");
		//f.setLayout(new BoarderLayout()); 프레임은 기본레이아웃이 보더라 생략가능
		
		Button btN = new Button("북");
		Button btS = new Button("남");
		Button btE = new Button("동");
		Button btW = new Button("서");
		Button btC = new Button("가운데");
		
		f.add(btC, "Center");
		f.add(btS, "South");
		f.add(btE, "East");
		f.add(btW, "West");
		f.add(btN, "North");
		
		f.setSize(400, 300);
		f.setVisible(true);
		
	}
}

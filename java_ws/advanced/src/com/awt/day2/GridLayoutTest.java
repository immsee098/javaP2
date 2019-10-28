package com.awt.day2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayoutTest {

	public static void main(String[] args) {
		//GridLayout - 컨테이너를 테이블처럼 행과 열로 나누어 컴포넌트를 배치
		//여기에 추가되는 컴포넌트들은 모두 같은 크기로 나누어짐 

		Frame f = new Frame("GridLayout연습");
		
		f.setLayout(new GridLayout(3, 2)); //3행 2열
		
		f.add(new Button("1"));
		f.add(new Button("2"));
		f.add(new Button("3"));
		f.add(new Button("4"));
		f.add(new Button("5"));
		f.add(new Button("6"));
		
		f.setSize(400, 300);
		f.setVisible(true);
		
	}

}

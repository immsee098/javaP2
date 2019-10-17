package com.awt.day1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class CanvasTest {

	public static void main(String[] args) {
		Frame f = new Frame("Canvas 연습");
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.green);
		canvas.setSize(200, 150);
		
		f.setLayout(new FlowLayout());
		
		f.add(canvas);
		f.setSize(400, 300);
		f.setVisible(true);
		
		/*Canvas - 빈 평면 공간을 제공하는 컴포넌트
		여기에 그림을 그릴수도 있고, 글자를 적을 수도 있음
		주로 그림을 그리거나 이미지를 위한 공간으로 사용*/
		
	}

}





package com.awt.day1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;

public class Scrollapne {

	public static void main(String[] args) {
		/*ScrollPane - 컨테이너이므로 다른 컴포넌트를 포함시킬 수 있으나, 
		  다른 컨테이너들과는 달리 단 하나의 컴포넌트만을 포함시킬 수 있음
		 */
		Frame f = new Frame("ScrollPane 연습");
		
		Panel p = new Panel();
		p.setBackground(Color.orange);
		
		p.add(new Button("첫번째"));
		p.add(new Button("두번째"));
		p.add(new Button("세번째"));
		p.add(new Button("네번째"));
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.add(p);
		
		f.add(scrollPane);
		
		f.setSize(400, 300);
		f.setVisible(true);
		
	}

}

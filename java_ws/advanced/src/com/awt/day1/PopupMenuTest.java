package com.awt.day1;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PopupMenuTest {

	public static void main(String[] args) {
		Frame f = new Frame("Popup 메뉴 연습");
		
		PopupMenu pMenu = new PopupMenu("Edit");
		MenuItem miCopy = new MenuItem("Copy");
		MenuItem miCut = new MenuItem("Cut");
		MenuItem miPaste = new MenuItem("Paste");
		
		pMenu.add(miCut);
		pMenu.add(miCopy);
		pMenu.add(miPaste);

		f.add(pMenu);
		
		f.addMouseListener(new MouseAdapter() {		
			@Override
			public void mousePressed(MouseEvent e) {
				if(e.getModifiers()==e.BUTTON3_MASK) {
					pMenu.show(f, e.getX(), e.getY());
					//public void show(Component origin,int x,int y)
				}
			}
		});
		
		f.setSize(400, 500);
		f.setVisible(true);
	}

}

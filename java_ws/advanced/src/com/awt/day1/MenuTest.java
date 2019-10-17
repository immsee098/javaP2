package com.awt.day1;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuTest {

	public static void main(String[] args) {
		Frame f = new Frame("Menu연습");
		
		MenuBar menuBar = new MenuBar();
		
		Menu mFile=new Menu("File");
		Menu mEdit=new Menu("Edit");
		Menu mView=new Menu("View");
		Menu mHelp=new Menu("Help");
		
		MenuItem miNew = new MenuItem("New");
		MenuItem miOpen = new MenuItem("Open");
		MenuItem miExit = new MenuItem("Exit");
		Menu mOthers = new Menu("Others");
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(mOthers);
		mFile.addSeparator(); //메뉴 분리선
		mFile.add(miExit);
		
		MenuItem miPrint = new MenuItem("Print");
		MenuItem miPrintSet = new MenuItem("Print SetUp...");
		
		mOthers.add(miPrint);
		mOthers.add(miPrintSet);
		
		CheckboxMenuItem ckmiStatus = new CheckboxMenuItem("Status Bar");
		mView.add(ckmiStatus);
		
		menuBar.add(mFile);
		menuBar.add(mEdit);
		menuBar.add(mView);
		//menuBar.add(mHelp);
		menuBar.setHelpMenu(mHelp);
		
		f.setMenuBar(menuBar);
		f.setSize(400, 500);
		f.setVisible(true);
	}

}

package com.day18;

import java.awt.Desktop.Action;

class Robot {
	void action() {
		System.out.println("·Îº¿1¾×¼Ç1");
	}
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("ÃãÀ» Ãä´Ï´Ù.");
	}
	
	void action() {
		System.out.println("´í½º·Îº¿");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("³ë·¡¸¦ ÇÕ´Ï´Ù.");
	}
	
	void action() {
		System.out.println("³ë·¡·¯¹þ");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("±×¸²À» ±×¸³´Ï´Ù.");
	}
	
	void action() {
		System.out.println("±×¸²·Îº¿");
	}
}

public class Poly {

	public static void main(String[] args) {
		Robot[] bot = new Robot[3];
		bot[0] = new DanceRobot();
		bot[1] = new SingRobot();
		bot[2] = new DrawRobot();
		
		for(int i=0; i<bot.length; i++) {
			if(bot[i] instanceof DanceRobot) {
				DanceRobot d = (DanceRobot)bot[i]; 
				d.dance();
			} else if(bot[i] instanceof SingRobot) {
				SingRobot s = (SingRobot)bot[i];
				s.sing();
			} else if(bot[i] instanceof DrawRobot) {
				DrawRobot db = (DrawRobot)bot[i];
				db.draw();
			}
			

//			}
			
		}

	}

}

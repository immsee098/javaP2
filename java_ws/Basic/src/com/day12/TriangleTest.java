package com.day12;

import java.util.Scanner;

class Triangle {
	int w;
	int h;
	
	Triangle() {
	}
	

	Triangle(int p_w, int p_h) {
		w = p_w;
		h = p_h;
	}
	public static double findArea(int w, int h) {
		return w*h/2.0;
	}
	
}

public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		Triangle tr = new Triangle();
		double area = tr.findArea(w, h);

	}

}

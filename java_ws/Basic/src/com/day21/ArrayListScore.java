package com.day21;

import java.util.ArrayList;
import java.util.Scanner;

class Score{
	private int sum;
	private double avg;
	
	public double getAvg() {
		return avg;
	}
	
	public void findSum(ArrayList<Integer> subjectList) {
		sum = 0;
		for(int i=0; i<subjectList.size();i++) {
			int n = subjectList.get(i);
			
			sum+=n;
		}
	}
	
	public void findAvg(ArrayList<Integer> subjectList) {
		
		findSum(subjectList);
		avg = (double)sum/subjectList.size();
	}
}

public class ArrayListScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> subjectList = new ArrayList<Integer>(3);
		
		System.out.println("국어, 영어, 수학 점수 입력");
		
		for(int i=0; i< 3; i++) {
			int a = sc.nextInt();
			subjectList.add(new Integer(a));
		}
		
		Score so = new Score();
		
		so.findSum(subjectList);
		so.findAvg(subjectList);
		double d = so.getAvg();
		System.out.println(d);

	}

}

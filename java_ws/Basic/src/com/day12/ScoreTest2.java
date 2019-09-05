package com.day12;

import java.util.Scanner;

class Score {
	int kor;
	int eng;
	int math;
	
	Score(int p_kor, int p_eng, int p_math) {
		kor = p_kor;
		eng = p_eng;
		math = p_math;
	}
	
	int total() {
		return kor+eng+math;
	}
	
	double average() {
		return total()/3.0;
	}
}

public class ScoreTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 영어 수학 입력");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		Score a = new Score(kor, eng, math);
		System.out.println(a.average());

	}

}

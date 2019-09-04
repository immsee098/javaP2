package com.day12;

import java.util.Scanner;

public class ScoreTest {
	public int kor;
	public int eng;
	public int math;
	
	ScoreTest(int p_kor, int p_eng, int p_math) {
		kor = p_kor;
		eng = p_eng;
		math = p_math;
	}
	
	public double average() {
		return (kor+eng+math)/3.0;
	}
}



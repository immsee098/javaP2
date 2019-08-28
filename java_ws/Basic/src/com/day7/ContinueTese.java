package com.day7;

public class ContinueTese {

	public static void main(String[] args) {
		/*
		 	[1] break
		 		switch나 반복문에서 사용
		 		해당 블럭을 빠져나가라는 것
		 		(switch나 반복문 탈출)
		 	[2] continue
		 		반복문에서만 사용
		 		다음 반복위치로 이동하라는 것
		 		한 번을 건너뛰는 경우 사용
		 	[3] return
		 		메서드의 실행을 종료하고 호출원으로 복귀
		 		(메서드 탈출)
		*/
		
		for(int i=0; i<10; i++) {
			if(i==5) break;
			
			System.out.println(i);
		}
		System.out.println("\n=========continue이용========");
		
		for(int i=0; i<10; i++) {
			if(i==5) continue; //5는 건너뛴다(skip)
			System.out.println("i="+i);
		}
		
		System.out.println("\n=======중첩for - break ==========");
		for(int i=0; i<3; i++) {
			for(int j =0; j<3; j++) {
				if(j==1) break;
				
				System.out.println("i="+i+", j="+j);
			}
		}//for
		
		System.out.println("\n=====중첩 for - continue ======");
		for(int i =0; i<3; i++) {
			for(int j =0; j<3; j++) {
				if(j==1) continue;
				
				System.out.println("i : "+i+", j :"+j);
			}
		}

	}

}

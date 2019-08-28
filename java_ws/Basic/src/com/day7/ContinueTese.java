package com.day7;

public class ContinueTese {

	public static void main(String[] args) {
		/*
		 	[1] break
		 		switch�� �ݺ������� ���
		 		�ش� ���� ����������� ��
		 		(switch�� �ݺ��� Ż��)
		 	[2] continue
		 		�ݺ��������� ���
		 		���� �ݺ���ġ�� �̵��϶�� ��
		 		�� ���� �ǳʶٴ� ��� ���
		 	[3] return
		 		�޼����� ������ �����ϰ� ȣ������� ����
		 		(�޼��� Ż��)
		*/
		
		for(int i=0; i<10; i++) {
			if(i==5) break;
			
			System.out.println(i);
		}
		System.out.println("\n=========continue�̿�========");
		
		for(int i=0; i<10; i++) {
			if(i==5) continue; //5�� �ǳʶڴ�(skip)
			System.out.println("i="+i);
		}
		
		System.out.println("\n=======��øfor - break ==========");
		for(int i=0; i<3; i++) {
			for(int j =0; j<3; j++) {
				if(j==1) break;
				
				System.out.println("i="+i+", j="+j);
			}
		}//for
		
		System.out.println("\n=====��ø for - continue ======");
		for(int i =0; i<3; i++) {
			for(int j =0; j<3; j++) {
				if(j==1) continue;
				
				System.out.println("i : "+i+", j :"+j);
			}
		}

	}

}

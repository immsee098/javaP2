package com.day23;

public class ConcatTest {

	public static void main(String[] args) {
		// StringŬ������ concat()�ż��� - ���ڿ� ����
		
		String str = "java";
		String s = str.concat(" and").concat(" oracle").concat(" aa");
		
		System.out.println("s="+s);
		//s = str+" and"+" oracle"; //string builder�� +������ �ϸ� �ڵ����� ��Ʈ��������
		String s2 = str+ " bbb";
		
		System.out.println("s2="+s2);

	}

}

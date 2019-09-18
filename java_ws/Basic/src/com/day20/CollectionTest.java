package com.day20;

import java.util.ArrayList;

public class CollectionTest {

	public static void main(String[] args) {
		/*
		 �÷��� �����ӿ�ũ - ������ �׷��� �����ϱ� ���� ���ǵ� Ŭ������ ǥ��ȭ�� ����
		 
		 ��ǥ���� �������̽�
		 [1]List - ������ �����ǰ�, �ߺ��� ����
		 [2]Set - ������ �������� �ʰ�, �ߺ��� ������ ����
		 		HashSet
		 [3]Map - key, value ������ �̷���� ������ ����
		 		������ �������� ������, Ű�� �ߺ����x, ���� �ߺ����
		 		HashMap, Hashtable, Properties
		 		
		 �迭�� ���еǴ� Ư¡ - �޸��� ũ�Ⱑ �������� �þ
		 */
		
		ArrayList aList = new ArrayList(4); //��� ���� ""Ŭ���� ����""�� ��´�
		
		//������ �߰�
		aList.add(new Integer(10)); //�÷��ǿ� ���� ������ �� ��ü�� �����ؾ� �ϹǷ� WrapperŬ���� �̿�<=JDK5.0����Ÿ��
		aList.add(new Integer(300));
		aList.add(50); //5.0���ʹ� autoboxing�� �ȴ�
		//=>�⺻�ڷ��� ���� �����Ϸ��� �ڵ����� WrapperŬ������ ��ȯ�Ǿ� �����
		//boxing - �⺻ �ڷ����� ���������� ��ȯ
		//unboxing - �������� �⺻�ڷ�� ��ȯ
		
		System.out.println("ArrayList�� ũ��:"+aList.size());
		
		//������ �о����
		for(int i=0; i<aList.size(); i++) {
			Object obj = aList.get(i);
			Integer n = (Integer)obj;  //�ٿ�ĳ���� �Ѱ� ~>���� �ν��Ͻ��� Integer
			int k = n.intValue(); //Integer�� int�ιٲ���
			System.out.println(k);
		}
		
		aList.add(new Double(3.14));
		aList.add(5.678);
		aList.add(new String("java"));
		aList.add("oracle");
		
		Double d = (Double)aList.get(3);
		System.out.println("index 3�� ���:"+d);
		System.out.println("index 5�� ���:"+(String)aList.get(5));
		
		//����
		aList.remove(3);
		System.out.println("���� �� index 3�� ���:"+(Double)aList.get(3));
	}

}

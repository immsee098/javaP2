package com.day20;

import java.util.ArrayList;

public class CollectionTest {

	public static void main(String[] args) {
		/*
		 컬렉션 프레임워크 - 데이터 그룹을 저장하기 위해 정의된 클래스로 표준화된 설계
		 
		 대표적인 인터페이스
		 [1]List - 순서가 유지되고, 중복이 허용됨
		 [2]Set - 순서가 유지되지 않고, 중복이 허용되지 않음
		 		HashSet
		 [3]Map - key, value 쌍으로 이루어진 데이터 집합
		 		순서가 유지되지 않으며, 키는 중복허용x, 값은 중복허용
		 		HashMap, Hashtable, Properties
		 		
		 배열과 구분되는 특징 - 메모리의 크기가 동적으로 늘어남
		 */
		
		ArrayList aList = new ArrayList(4); //얘는 전부 ""클래스 형태""로 담는다
		
		//데이터 추가
		aList.add(new Integer(10)); //컬렉션에 값을 저장할 때 객체로 저장해야 하므로 Wrapper클래스 이용<=JDK5.0이전타입
		aList.add(new Integer(300));
		aList.add(50); //5.0부터는 autoboxing이 된다
		//=>기본자료형 값이 컴파일러에 자동으로 Wrapper클래스로 변환되어 저장됨
		//boxing - 기본 자료형을 참조형으로 변환
		//unboxing - 참조형을 기본자료로 변환
		
		System.out.println("ArrayList의 크기:"+aList.size());
		
		//데이터 읽어오기
		for(int i=0; i<aList.size(); i++) {
			Object obj = aList.get(i);
			Integer n = (Integer)obj;  //다운캐스팅 한겨 ~>실제 인스턴스는 Integer
			int k = n.intValue(); //Integer을 int로바꿔줌
			System.out.println(k);
		}
		
		aList.add(new Double(3.14));
		aList.add(5.678);
		aList.add(new String("java"));
		aList.add("oracle");
		
		Double d = (Double)aList.get(3);
		System.out.println("index 3의 요소:"+d);
		System.out.println("index 5의 요소:"+(String)aList.get(5));
		
		//제거
		aList.remove(3);
		System.out.println("제거 후 index 3의 요소:"+(Double)aList.get(3));
	}

}

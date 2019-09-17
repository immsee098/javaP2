package com.java0917;

interface IA{
	void sayA();
}
interface IB{
	void sayB();
}
interface IC extends IB{
	void sayC();  
}
interface ID extends IA, IC {   
	void sayD();
}
interface IM{
	void sayM();
}

class Test implements ID, IM {

	@Override
	public void sayA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sayC() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sayB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sayM() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sayD() {
		// TODO Auto-generated method stub
		
	} 

}

class Person{
	public String kind(){
		return "사람";
	}
};
class Student extends Person{
	public String kind(){
		return "학생";
	}
};
class Graduate extends Student{
	public String kind(){
		return "대학원생";
	}
};
class Assistant extends Person{
	public String kind(){
		return "조교";
	}
};
class Professor extends Person{
	public String kind(){
		return "교수";
	}
}//

class Polyargs{

	public static void print(Person pe) {
		if(pe instanceof Student) {
			System.out.println(pe.kind() + " 이/가 등록합니다.");
		} else if(pe instanceof Graduate) {
			System.out.println(pe.kind() + " 이/가 등록합니다.");
		} else if (pe instanceof Assistant) {
			System.out.println(pe.kind() + " 이/가 등록합니다.");
		}
	}
	

	//(1) 위 주석 부분의 코드를 메서드 하나로 처리하시오.
	


	public static void main(String[] args){
		Person son1 = new Student();
		Person son2 = new Graduate();
		Person son3 = new Assistant();
		Person son4 = new Professor();
		
		print(son1);
		print(son2);
		print(son3);
		print(son4);

	}
}//

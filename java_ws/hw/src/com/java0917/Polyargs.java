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
		return "���";
	}
};
class Student extends Person{
	public String kind(){
		return "�л�";
	}
};
class Graduate extends Student{
	public String kind(){
		return "���п���";
	}
};
class Assistant extends Person{
	public String kind(){
		return "����";
	}
};
class Professor extends Person{
	public String kind(){
		return "����";
	}
}//

class Polyargs{

	public static void print(Person pe) {
		if(pe instanceof Student) {
			System.out.println(pe.kind() + " ��/�� ����մϴ�.");
		} else if(pe instanceof Graduate) {
			System.out.println(pe.kind() + " ��/�� ����մϴ�.");
		} else if (pe instanceof Assistant) {
			System.out.println(pe.kind() + " ��/�� ����մϴ�.");
		}
	}
	

	//(1) �� �ּ� �κ��� �ڵ带 �޼��� �ϳ��� ó���Ͻÿ�.
	


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

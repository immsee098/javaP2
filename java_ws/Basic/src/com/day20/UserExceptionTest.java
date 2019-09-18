package com.day20;

class MyException extends Exception{
	private int errorCode=100;
	
	MyException(String msg){
		super(msg); //�θ��� ExceptionŬ������ ������(�Ű������� ���ڿ��� ������)�� ȣ��
	}
	
	//public Exception(String message)
	
	public int getCode() {
		return errorCode;
	}
}

public class UserExceptionTest {

	public static void main(String[] args) {
		try {
			throw new MyException("����� ���� ���� �߻�");
		}catch(MyException e) {
			System.out.println("���� �޽���:"+e.getMessage());
			System.out.println("�����ڵ�:"+e.getCode());
		}
		
		System.out.println("\nnext!!");

	}

}

package com.java0916;

import java.util.Scanner;

class Employee{
    protected String name;

    Employee(String name) {
        this.name = name;
    }

    void setName(String name){
        this.name = name;
    }

    String getName() {
        return name;
    }

    int findPay() {
        return 0;
    }
    
}

class Permanent extends Employee {
    protected int salary;

    Permanent(String name, int salary) {
        super(name);
        this.salary =salary;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    int getSalary() {
        return salary;
    }

    int findPay() {
        return salary;
    }

}

class Temporary extends Employee {
    private int time;
    private int pay;

    Temporary(String name, int time, int pay){
        super(name);
        this.time = time;
        this.pay = pay;
    }

    void setTime(int time) {
        this.time=time;
    }

    void setPay(int pay) {
        this.pay = pay;
    }

    int getTime() {
        return time;
    }

    int getPay() {
        return pay;
    }

    int findPay() {
        return time*pay;
    }

}

class SalesPerson extends Permanent {
    private int earnings;
    final private float RATE = 0.15f; 

    SalesPerson(String name, int salary, int earnings){
        super(name, salary);
        this.earnings = earnings;
    }

    void setEarnings(int earnings) {
        this.earnings = earnings;
    }

    int getEarnings() {
        return earnings;
    }


    int findPay() {
        return salary+(int)(earnings*RATE);
    }

}

class Homework1 {
    public static void main(String[] args) { 
    	Scanner sc = new Scanner(System.in);
    	System.out.println("�������-�����<P>, �ӽ���<T>, �Ǹ���<S>�Է�");
    	String hire = sc.nextLine();
    	String name = "";
    	
    	Employee em = null;
    	switch(hire){
    		case "P":
    		case "p":
    			System.out.println("�̸�, �⺻�޿��� �Է��ϼ���");
    			name = sc.nextLine();
    			int salary = sc.nextInt();
    			em = new Permanent(name, salary);
    			Permanent per = (Permanent)em;
    			System.out.println("�������:�����");
    			System.out.println("�̸�"+per.getName());
    			System.out.println("�޿�:"+per.findPay());
    			
    		case "T":
    		case "t":
    			System.out.println("�̸�, ���ѽð�, �ð��� �޿��� �Է��ϼ���");
    			name = sc.nextLine();
    			int hour = sc.nextInt();
    			int pay = sc.nextInt();
    			em = new Temporary(name, hour, pay);
    			Temporary per1 = (Temporary)em;
    			System.out.println("�������:�ӽ���");
    			System.out.println("�̸�"+per1.getName());
    			System.out.println("�ݿ�"+per1.findPay());
    		case "S":
    		case "s":
    			System.out.println("�̸�, �⺻�޿�, �Ǹż����� �Է��ϼ���");
    			name = sc.nextLine();
    			int fo = sc.nextInt();
    			int earn = sc.nextInt();
    			em = new SalesPerson(name, fo, earn);
    			Temporary per2 = (Temporary)em;
    			System.out.println("�������:�ӽ���");
    			System.out.println("�̸�"+per2.getName());
    			System.out.println("�ݿ�"+per2.findPay());
    		default:
    			System.out.println("�߸� �Է�");
    	}
    }
}











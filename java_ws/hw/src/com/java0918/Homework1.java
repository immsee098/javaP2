package com.java0918;

class Child {
  private int numOfBead;


  Child(int numOfBead){
      this.numOfBead = numOfBead;
  }

  public int loseBead(int loseCount){
      if(numOfBead<loseCount) {
          numOfBead = 0;
      } else {
          numOfBead = numOfBead - loseCount;
      }
      return numOfBead;
  }

  public void obtainBead(Child child, int obtainCount){
      child.numOfBead = child.loseBead(obtainCount);
      numOfBead = this.numOfBead + obtainCount;
  }

  public void showProperty(){
      System.out.println("���� ������ ����: " + numOfBead);
  }

}

public class Homework1{
  public static void main(String[] args){
	  
      Child ch1 = new Child(15);
      Child ch2 = new Child(9);
      
      System.out.println("���� �� ���� ���� ����");
      System.out.println("===���1===");
      ch1.showProperty();
      System.out.println("===���2===");
      ch2.showProperty();
      
      ch1.obtainBead(ch2, 2);
      ch2.obtainBead(ch1, 7);
      
      System.out.println("\n���� �� ���� ���� ����");
      System.out.println("===���1===");
      ch1.showProperty();
      System.out.println("===���2===");
      ch2.showProperty();
      
  }
}

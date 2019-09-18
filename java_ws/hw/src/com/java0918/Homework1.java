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
      System.out.println("보유 구슬의 개수: " + numOfBead);
  }

}

public class Homework1{
  public static void main(String[] args){
	  
      Child ch1 = new Child(15);
      Child ch2 = new Child(9);
      
      System.out.println("게임 전 구슬 보유 개수");
      System.out.println("===어린이1===");
      ch1.showProperty();
      System.out.println("===어린이2===");
      ch2.showProperty();
      
      ch1.obtainBead(ch2, 2);
      ch2.obtainBead(ch1, 7);
      
      System.out.println("\n게임 후 구슬 보유 개수");
      System.out.println("===어린이1===");
      ch1.showProperty();
      System.out.println("===어린이2===");
      ch2.showProperty();
      
  }
}

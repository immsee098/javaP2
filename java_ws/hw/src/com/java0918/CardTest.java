package com.java0918;

class Card{
	private final int KIND;  // 카드 무늬의 수 1~4
	private final int NUMBER;  // 무늬별 카드 수(카드의 숫자) 1~10,  J, Q, K

	private static final int SPADE=1;
	private static final int DIAMOND=2;
	private static final int HEART=3;
	private static final int CLOVER=4;

	public static final int MAX_KIND=4;
	public static final int MAX_NUMBER=13;
	
	Card(int kind, int number){
		this.KIND=kind;
		this.NUMBER=number;
	}
		
	public String findInfo(){
		String kind="", number="";
		switch (KIND){
			case SPADE:
				kind="SPADE";break;
			case DIAMOND:
				kind="DIAMOND";break;
			case HEART:
				kind="HEART";break;
			case CLOVER:
				kind="CLOVER";break;
		}
		switch (NUMBER){
			case 11:
				number="J";break;
			case 12:
				number="Q";break;
			case 13:
				number="K";break;
			default:
				number=NUMBER+"";
		}		
		return "card[kind="+ kind +", number="+ number+"]";	  //SPADE, K
	}
}


//카드 한벌 - 52장의 카드를 갖는 클래스
class Deck{
	private static final int CARD_NUM=52;  //카드의 개수	
	private	Card[] cardList = new Card[CARD_NUM]; //카드 52장을 담는 배열
	private int count;

	Deck(){
		//(1) 카드 52장을 초기화하시오. (cardList 배열에 요소 넣기)
		for (int i=1;i<= Card.MAX_KIND;i++ ){  
			for (int j=1;j<=Card.MAX_NUMBER ; j++){ 
				Card c = new Card(i, j); 
				cardList[count++] = c; 
				} 
			}
	} 
		

	//(2) cardList 멤버변수에 대한 getter를 만드시오.
	public Card[] getCardList(){ 
		return cardList; 
		}


	
	//(3) 임의의 카드 한 장을 뽑는 메서드를 만드시오.  pick()
	public Card pick(int idx){ 
		Card c=null; 
		if (idx<0 || idx>=CARD_NUM){ 
			c=pick(); 
			}else{ 
				c = cardList[idx]; } 
		return c; }
	 public Card pick(){ 
		 int rnd = (int)(Math.random()*52);   
		 Card c = cardList[rnd];   
		 return c; 
		 }
	

	//(4)  카드의 순서를 섞는 메서드를 완성하시오.
	public void shuffle(){
		for (int i=0;i<1000 ;i++ ){
			//카드 한 벌의 첫 번째 장과 임의로 선택한 위치에 있는 카드의 위치를 서로 바꾸는 방식
			int rnd = (int)(Math.random()*52); 
			//0번째 배열의 값과 서로 맞바꾸기
			Card temp = cardList[0]; 
			cardList[0] = cardList[rnd]; 
			cardList[rnd] = temp;
		}//for
	}
}//class

class CardTest {
	public static void main(String[] args) {
		Deck d = new Deck();  //카드 한 벌 만들기
		
		//(5) 카드 한 벌 출력하기
		System.out.println("\n\n----카드 한벌----"); 
		Card[] cardArr = d.getCardList(); 
		for (Card card : cardArr){ 
			System.out.println(card.findInfo()); 
			}


		//카드 섞기
		d.shuffle();

	}
}
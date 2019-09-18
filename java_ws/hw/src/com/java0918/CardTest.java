package com.java0918;

class Card{
	private final int KIND;  // ī�� ������ �� 1~4
	private final int NUMBER;  // ���̺� ī�� ��(ī���� ����) 1~10,  J, Q, K

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


//ī�� �ѹ� - 52���� ī�带 ���� Ŭ����
class Deck{
	private static final int CARD_NUM=52;  //ī���� ����	
	private	Card[] cardList = new Card[CARD_NUM]; //ī�� 52���� ��� �迭
	private int count;

	Deck(){
		//(1) ī�� 52���� �ʱ�ȭ�Ͻÿ�. (cardList �迭�� ��� �ֱ�)
		for (int i=1;i<= Card.MAX_KIND;i++ ){  
			for (int j=1;j<=Card.MAX_NUMBER ; j++){ 
				Card c = new Card(i, j); 
				cardList[count++] = c; 
				} 
			}
	} 
		

	//(2) cardList ��������� ���� getter�� ����ÿ�.
	public Card[] getCardList(){ 
		return cardList; 
		}


	
	//(3) ������ ī�� �� ���� �̴� �޼��带 ����ÿ�.  pick()
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
	

	//(4)  ī���� ������ ���� �޼��带 �ϼ��Ͻÿ�.
	public void shuffle(){
		for (int i=0;i<1000 ;i++ ){
			//ī�� �� ���� ù ��° ��� ���Ƿ� ������ ��ġ�� �ִ� ī���� ��ġ�� ���� �ٲٴ� ���
			int rnd = (int)(Math.random()*52); 
			//0��° �迭�� ���� ���� �¹ٲٱ�
			Card temp = cardList[0]; 
			cardList[0] = cardList[rnd]; 
			cardList[rnd] = temp;
		}//for
	}
}//class

class CardTest {
	public static void main(String[] args) {
		Deck d = new Deck();  //ī�� �� �� �����
		
		//(5) ī�� �� �� ����ϱ�
		System.out.println("\n\n----ī�� �ѹ�----"); 
		Card[] cardArr = d.getCardList(); 
		for (Card card : cardArr){ 
			System.out.println(card.findInfo()); 
			}


		//ī�� ����
		d.shuffle();

	}
}
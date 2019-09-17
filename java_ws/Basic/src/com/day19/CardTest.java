package com.day19;

class Card{
	private final int KIND;
	private final int NUMBER;

	private static final int SPADE = 1;
	private static final int DIAMOND = 2;
	private static final int HEART = 3;
	private static final int CLOVER = 4;

	static final int MAX_KIND = 4;
	static final int MAX_NUMBER = 1;

	Card(int k, int num){
		KIND = k;
		NUMBER = num;
	}

	public String findInfo() {
		String kind="", num="";
		switch(KIND) {
		case SPADE:
			kind="SPADE"; break;
		case DIAMOND:
			kind="DIAMOND"; break;
		case HEART:
			kind="HEART"; break;
		case CLOVER:
			kind="CLOVER"; break;
		}

		switch(NUMBER) {
		case 11:
			num="J"; break;
		case 12:
			num="Q"; break;
		case 13:
			num="K"; break;
		default:
			num=NUMBER+"";
		}

		return "["+kind+","+num+"]";
	}

}


//카드 한 벌 -52자의 카드를 포함하고 있다
class Deck{ 
	private static final int CARD_NUM=52;  
	private Card[] cardList = new Card[CARD_NUM]; 
	private int count; 
	Deck(){ 
		for (int i=1;i<= Card.MAX_KIND;i++ )
		{  
			for (int j=1;j<=Card.MAX_NUMBER ; j++){ 
				Card c = new Card(i, j); 
				cardList[count++] = c; 
			}//안쪽 for 
		}//바깥 for 
	} //getter 
	public Card[] getCardList(){ 
		return cardList; 
	}
	public Card pick(int idx){ 
		Card c=null; 
		if (idx<0 || idx>=CARD_NUM){ 
			c=pick(); 
		}else{ c = cardList[idx]; 
		} 
		return c; 
		}

	public Card pick(){ 
		int rnd = (int)(Math.random()*52);  
		Card c = cardList[rnd]; 
		return c; 
	}
	
	public void shuffle(){ 
		for (int i=0;i<1000 ;i++ ){ 
			int rnd = (int)(Math.random()*52);  
			Card temp = cardList[0]; 
			cardList[0] = cardList[rnd]; 
			cardList[rnd] = temp;
		}
	} 
}

	


public class CardTest {

	public static void main(String[] args) {
		Deck d = new Deck();  
		Card c = d.pick(0);  
		System.out.println(c.findInfo());
		System.out.println("\n\n----카드 한벌----"); 
		Card[] cardArr = d.getCardList(); 
		for (Card card : cardArr){ 
			System.out.println(card.findInfo()); 
		}
		d.shuffle();
		c = d.pick(0); 
		System.out.println("\n카드 섞은 후 결과 : "+c.findInfo()+"\n");

	}

}

package ch3;

public class Ch3_24 {

	public static void main(String[] args) {
		int card = (int)(Math.random() * 52);
		
		int rank = card % 13;
		int suit = card % 4;
		
		String rankStr = "";
		
		switch(rank) {
		
		case 0: {
			rankStr = "Ace";
			break;
		}
		case 1: {
			rankStr = "2";
			break;
		}
		case 2: {
			rankStr = "3";
			break;
		}
		case 3: {
			rankStr = "4";
			break;
		}
		case 4: {
			rankStr = "5";
			break;
		}
		case 5: {
			rankStr = "6";
			break;
		}
		case 6: {
			rankStr = "7";
			break;
		}
		case 7: {
			rankStr = "8";
			break;
		}
		case 8: {
			rankStr = "9";
			break;
		}
		case 9: {
			rankStr = "10";
			break;
		}
		case 10: {
			rankStr = "Jack";
			break;
		}
		case 11: {
			rankStr = "Queen";
			break;
		}
		case 12: {
			rankStr = "King";
			break;
		}
		}
		
		
		String suitStr = "";
		switch(suit) {
		case 0:{
			suitStr = "Clubs";
			break;
		}
		case 1:{
			suitStr = "Diamonds";
			break;
		}
		case 2:{
			suitStr = "Hearts";
			break;
		}
		case 3:{
			suitStr = "Spades";
			break;
		}
		}
		
		System.out.print("The picked card is " + rankStr + " of " + suitStr);
	}

}

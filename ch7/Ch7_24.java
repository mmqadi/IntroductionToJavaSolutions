package ch7;

public class Ch7_24 {

    public static void main(String[] args){
        String[] suits = {"Spade", "Diamonds", "Hearts", "Clubs"};
        int[] pickedCards = new int[4];
        boolean[] pickedSuit = new boolean[suits.length];
        //int[] deck = createShuffledDeck();
        int count = 0;
        int validCount = 0;

        while(!pickedFromEverySuit(pickedSuit)){
          int card = createShuffledDeck()[0];
          count++;
          int suitCode = getSuit(card);
          if(!pickedSuit[suitCode]){
              pickedCards[validCount] = card;
              validCount++;
              pickedSuit[suitCode] = true;
              if(validCount == 4)
                  break;
          }

        }

        for (int card : pickedCards) {
            String cardSuit = suits[getSuit(card)];
            String cardRank = getRank(card);

            System.out.println(cardRank + " of " + cardSuit);
        }

        System.out.println("Number of picks: " + count);

    }
    public static int getSuit(int card){
        return card / 13;
    }
    public static String getRank(int card){
        if(card % 13 == 0)
            return "Ace";
        if(card % 13 == 10)
            return "Jack";
        if(card % 13 == 11)
            return "Queen";
        if(card % 13 == 12)
            return "King";

        return Integer.toString(card % 13);
    }

    public static boolean pickedFromEverySuit(boolean[] pickedSuit){
        for (boolean b : pickedSuit) {
            if (!b)
                return false;
        }

        return true;
    }

    public static int[] createShuffledDeck(){
        int[] deck = new int[52];

        for(int i = 0; i < deck.length; i++){
            deck[i] = i;
        }

        //shuffle
        for(int i = 0; i < deck.length; i++){
            int randomCardPosition = (int)(Math.random() * 52);
            int temp = deck[randomCardPosition];
            deck[randomCardPosition] = deck[i];
            deck[i] = temp;
        }

        return deck;
    }
}

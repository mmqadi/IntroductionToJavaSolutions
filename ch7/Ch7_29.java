package ch7;

public class Ch7_29 {

    public static void main(String[] args){
        int[] pickedCards = new int[4];

        int[] deck = createDeck();
        int noOfPicks = 0;
        int sum;
        do {
            noOfPicks++;
            sum = pickFourCards(deck, pickedCards);
            shuffleDeck(deck);
        }
        while(sum != 24);
        System.out.println("The number of picks of four cards that sum to 24 is " + noOfPicks);

        System.out.println("The cards are listed below: ");
        for (int pickedCard : pickedCards) {
            System.out.println(getRank(pickedCard));
        }

    }

    public static int pickFourCards(int[] deck, int[] pickedCards){

        int sum = 0;

        for(int i = 0; i < 4; i++){
            sum += (deck[i] % 13) + 1;

            pickedCards[i] = deck[i];
        }

        return sum;
    }

    public static int[] createDeck(){
        int[] deck = new int[52];

        for(int i = 0; i < deck.length; i++){
            deck[i] = i;
        }

        shuffleDeck(deck);
        return deck;
    }

    public static String getRank(int card){
        int rank = card % 13;

        if(rank == 0)
            return "Ace";
        if(rank == 10)
            return "Jack";
        if(rank == 11)
            return "Queen";
        if(rank == 12)
            return "King";
        else
            return Integer.toString(rank+1);
    }

    public  static void shuffleDeck(int[] deck){
        // shuffle deck;
        for(int i = 0; i < deck.length; i++){
            int index = (int)(Math.random() * deck.length);
            int temp = deck[index];
            deck[index] = deck[i];
            deck[i] = temp;
        }
    }
}

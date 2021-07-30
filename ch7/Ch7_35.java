package ch7;
import java.util.Arrays;
import java.util.Scanner;
public class Ch7_35 {

    public static void main(String[] args){
        String continueGame;
        Scanner input = new Scanner(System.in);
        do {
            String word = getRandomWord();
            char[] hiddenWord = getHiddenWord(word);
            int noOfMisses = 0;
            do {
                System.out.print("Enter a letter in word " + new String(hiddenWord) + ": ");
                char guess = input.next().charAt(0);
                if(word.contains(Character.toString(guess))){
                    if(isInWord(hiddenWord, guess)){
                        System.out.println(guess + " is already in the word ");
                    }
                    else {
                        updateHiddenWord(hiddenWord, word, guess);
                    }
                }
                else {
                    noOfMisses++;
                }

            }
            while(!isWordComplete(hiddenWord));
            System.out.println("The word is " + word + ". you missed " + noOfMisses + " time.");
            System.out.print("Do you want to guess another word? Enter y or n: ");
            continueGame = input.next();
        }
        while(continueGame.equals("y"));
    }


    public static String getRandomWord(){
        String[] words = {"write", "that", "program", "monkey", "rooster", "dog",
                "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake",
                "horse", "sheep"};

        int randomIndex = (int)(Math.random() * words.length);

        return words[randomIndex];
    }

    public static char[] getHiddenWord(String word){
        char[] chars = new char[word.length()];

        Arrays.fill(chars, '*');
        return chars;
    }

    public static boolean isWordComplete(char[] word){
        for (char c : word) {
            if (c == '*')
                return false;
        }

        return true;
    }

    public static void updateHiddenWord(char[] chars, String word, char character){

        for(int i = 0; i < chars.length; i++){
            if(word.charAt(i) == character)
                chars[i] = character;
        }
    }

    public static boolean isInWord(char[] word, char character){
        for (char c : word)
            if (c == character)
                return true;
            return false;
    }
}

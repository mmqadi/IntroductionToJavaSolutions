package ch3;

import java.util.Scanner;

public class Ch3_15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Generate a lottery number
		int lottery = (int)(Math.random() * 1000);
		int lotterytemp = lottery;
		
		// Prompt the user to enter a guess
		System.out.print("Enter your lotory pick (two digits): " + lottery + " ");
		int guess = in.nextInt();
		in.close();
		
		System.out.println("The lottery number is " + lottery);
		// Get digits from lottery
		

		int digit3 = lottery % 10;
		lottery /= 10;
		
		int digit2 = lottery % 10;
		lottery /= 10;
		
		int digit1 = lottery;
		
		
		// get digits from guess
		int guess3 = guess % 10;
		guess /= 10;
		
		int guess2 = guess % 10;
		guess /= 10;
		
		int guess1 = guess;
		
		
		
		// check guess
		if(guess == lotterytemp)
			System.out.println("Exact match: you win R10,000");
		else if(((guess1 == digit1) &
				(guess2 == digit2 && guess3 == digit3) || ( guess2 == digit3 && guess3 == digit2))
				|| ((guess1 == digit2) &
				(guess2 == digit1 && guess3 == digit3) || (guess2 == digit3 && guess3 == digit1))
				|| ((guess1 == digit3) &&
				(guess2 == digit1 && guess3 == digit2) || (guess2 == digit2 && guess3 == digit1)))
			System.out.println("Match all digits: you win R3,000");
		else if((guess1 == digit1 || guess1 == digit2 || guess1 == digit3)
				|| (guess2 == digit1 || guess2 == digit2 || guess2 == digit3) 
				|| (guess3 == digit1 || guess3 == digit2 || guess3 == digit3))
			System.out.println("Match one digit: you win R1,000");
		
				
	}

}

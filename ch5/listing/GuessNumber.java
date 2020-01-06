package ch5.listing;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Generate a random number to guess
		int number = (int)(Math.random() * 101);
		
		
		System.out.println("Guess a magic number between 0 and 100");
		int guess = -1;
		
		while(guess != number) {
			// Prompt the user to enter a guess
			System.out.print("Enter your guess: ");
			guess = input.nextInt();
			
			if(guess == number)
				System.out.println("Yes, the number is " + number);
			else if(guess > number)
				System.out.println("Your guess is too high");
			else 
				System.out.println("Your guess is too low");
		}
		input.close();
		
	}

}

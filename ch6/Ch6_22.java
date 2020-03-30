package ch6;

import java.util.Scanner;

public class Ch6_22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive number: ");
		long n = input.nextLong();
		
		input.close();
		System.out.println("The square root of the number is " + sqrt(n));

	}
	
	
	/**
	 * returns the approximate square root of a number n.
	 * @param n the number we want the square root of.
	 * @return the approximate square root.
	 */
	public static double sqrt(long n) {
		
		long lastGuess = (long)(Math.random() * n / 2 + 1);
		
		long nextGuess = (lastGuess + n / lastGuess) / 2;
		
		while(Math.abs(lastGuess - nextGuess) >= 0.001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		
		return nextGuess;
	}

}

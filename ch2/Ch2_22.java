package ch2;

import java.util.Scanner;

public class Ch2_22 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an amount, e.g 1156 where the last two digits are cents: ");
		int inputAmount = in.nextInt();
		in.close();
		int remainingAmount = inputAmount;
		
		int noOfDollars = remainingAmount / 100;
		remainingAmount %= 100;
		
		int noOfQuarters = remainingAmount / 25;
		remainingAmount %= 25;
		
		int noOfdimes = remainingAmount / 10;
		remainingAmount %= 10;
		
		int noOfNickels = remainingAmount /5;
		remainingAmount %= 5;
		
		System.out.println("Your amount " + inputAmount + "consist of");
		System.out.println("   " + noOfDollars + " dollars");
		System.out.println("   " + noOfQuarters + " quarters");
		System.out.println("   " + noOfdimes + " dimes");
		System.out.println("   " + noOfNickels + " nickels");
		System.out.println("   " + remainingAmount + " pennies");
		
	}

}

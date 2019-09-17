package ch3;

import java.util.Scanner;

public class Ch3_7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an amount in double, for exmaple  11.56: ");
		double amount = in.nextDouble();
		in.close();
		
		int remainingAmount = (int)( amount * 100);
		
		int numberOfDollars = remainingAmount / 100;
		remainingAmount %= 100;
		
		int numberOfQuaters = remainingAmount / 25;
		remainingAmount %= 25;
		
		int numberOfDimes = remainingAmount / 10;
		remainingAmount %= 10;
		
		int numberNickels = remainingAmount / 5;
		remainingAmount %= 5;
		
		int numberOfPennies = remainingAmount;
		
		System.out.println("Your amount " + amount + " consist of");
		System.out.println("      " + numberOfDollars + ((numberOfDollars == 1)?" dollar":" dollars"));
		System.out.println("      " + numberOfQuaters + ((numberOfQuaters == 1)?" quarter":" quarters"));
		System.out.println("      " + numberOfDimes + ((numberOfDimes == 1)?" dime":" dimes"));
		System.out.println("      " + numberNickels + ((numberNickels == 1)?" nickel":" nickels"));
		System.out.println("      " + numberOfPennies + ((numberOfPennies == 1)?" penny":" pennies"));
	}

}

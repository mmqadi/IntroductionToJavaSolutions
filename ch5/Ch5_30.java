package ch5;

import java.util.Scanner;

public class Ch5_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the month you want to save monthly, eg. 100.50: ");
		double monthlySaving = input.nextDouble();
		
		System.out.print("Enter the annual interest rate, eg. 7.6: ");
		double annualInterestRate = input.nextDouble() / 100.0;
		
		System.out.print("Enter the number of months you want to save for, eg. 6: ");
		int noOfMonths = input.nextInt();
		
		input.close();
		double monthlyInterestRate = annualInterestRate / 12.0;
		
		double savings = 0.0;
		
		for(int month = 1; month <= noOfMonths; month++)
			savings = (monthlySaving + savings) * ( 1 + monthlyInterestRate);
		
		
		System.out.println("The value of the savings account after " + noOfMonths + " is R" + savings + ".");
		

	}

}

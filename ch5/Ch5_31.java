package ch5;

import java.util.Scanner;

public class Ch5_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the initial deposit amount: ");
		double depositAmount = input.nextDouble();
		
		System.out.print("Enter annual percentage yield: ");
		double annualInterestRate = input.nextDouble() / 100.0;
		double monthlyInterestRate = annualInterestRate / 12.0;
		
		System.out.print("Enter maturity period (number of months): ");
		double noOfMonths = input.nextDouble();
		
		input.close();
		
		System.out.println("Month\tCD Value");
		
		double savings = depositAmount;
		for(int month = 1; month <= noOfMonths; month++) {
			savings = savings + savings * monthlyInterestRate;
			
			System.out.printf("%s\t%.2f\n", month, savings);
		}

	}

}

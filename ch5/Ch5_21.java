package ch5;

import java.util.Scanner;

/*
 * Financial application: compare loans with various interest rates) Write a pro-
 * gram that lets the user enter the loan amount and loan period in number of years
 * and displays the monthly and total payments for each interest rate starting from
 * 5% to 8%, with an increment of 1/8. Here is a sample run:
 */

public class Ch5_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Loan amount: ");
		double loanAmount = input.nextDouble();
		
		System.out.print("Number of years: ");
		int noOfYears = input.nextInt();
		
		input.close();
		double startPercent = 5.0;
		double endPercentage = 8.0;
		
		System.out.println("Interest Rate\tMonthly Payment\tTotal Payment");
		System.out.println();
		
		for(double i = startPercent; i <= endPercentage; i+= 1.0/8.0) {
			
			double percentage = i / 1200.0;
			
			double monthlyPayment = loanAmount * percentage / (1 - 1 / Math.pow(1 + percentage, noOfYears * 12));
			
			double totalPayment = monthlyPayment * noOfYears * 12;
			
			
			
			System.out.println(i + "%\t\t" + monthlyPayment + "\t\t" + totalPayment);
		}

	}

}

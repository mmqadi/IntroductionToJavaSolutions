package ch2;

import java.util.Scanner;

public class Ch2_21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter investment amount: ");
		double investmentAmount = in.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = in.nextDouble();
		annualInterestRate = annualInterestRate / 100.0;
		
		System.out.print("Enter number of years: ");
		int noOfYears = in.nextInt();
		in.close();
		double futureInvestmentValue = investmentAmount * Math.pow(1 + annualInterestRate/12.0, noOfYears * 12);
		
		System.out.println("Accumulated value is R" + futureInvestmentValue);
	}

}

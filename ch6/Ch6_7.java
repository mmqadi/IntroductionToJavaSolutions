package ch6;

import java.util.Scanner;

public class Ch6_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("The amount invested: ");
		double capital = input.nextDouble();
		
		System.out.print("Annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		
		input.close();
		
		double monthlyInterestRate = annualInterestRate / 1200.0;
		
		System.out.println("Years\t\tFutureValue");
		for(int i = 1; i <= 30; i++)
			System.out.printf("%s\t\t%.2f\n",i, futureInvestmentValue(capital, monthlyInterestRate, i));
	}
	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		
		return investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
	}

}

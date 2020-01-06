package ch5;

import java.util.Scanner;

public class Ch5_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		
		System.out.print("Number of Years: ");
		int noOfYears = input.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		double annualInterestRate = input.nextDouble();
		
		input.close();
		
		annualInterestRate = annualInterestRate / 100.0;
		
		double monthlyInterestRate = annualInterestRate / 12.0;
		
		// calculate monthly payment
		double monthlyPayment = (monthlyInterestRate * loanAmount) / ( 1 - Math.pow((1 + monthlyInterestRate), -noOfYears * 12));
		
		// calculate total payment.
		double totalPayment = monthlyPayment * noOfYears * 12;
		
		System.out.println("Monthly Payment " + monthlyPayment);
		System.out.println("Total Payment " + totalPayment);
		
		System.out.println();
		System.out.println("Payment#\t\tInterest\t\tPrincipal\t\tBalance");
		for(int i = 1; i <= noOfYears * 12; i++) {
			double interest = monthlyInterestRate * loanAmount;
			double principal = monthlyPayment - interest;
			loanAmount = loanAmount - principal;
			
			System.out.println(i + "\t\t" + interest + "\t\t" + principal + "\t\t" + loanAmount);
		}

	}

}

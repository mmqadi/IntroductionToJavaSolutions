package ch2;

import java.util.Scanner;

public class Ch2_20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the balance and the interest rate (e.g., 3 for 3%): ");
		double balance = in.nextDouble();
		double interestRate = in.nextDouble();
		in.close();
		
		double interest = balance * (interestRate / 1200.0);
		
		System.out.println("The interest is R" + interest);

	}

}

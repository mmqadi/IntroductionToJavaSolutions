package ch2;

/*
 * (Financial application: calculate tips) Write a program that reads the subtotal
 * and the gratuity rate, then computes the gratuity and total. For example, if the
 * user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
 * as gratuity and $11.5 as total. Here is a sample run:
 */

import java.util.Scanner;

public class Ch2_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = in.nextDouble();
		double gratuityRate = in.nextDouble();
		double gratuity = subtotal * (gratuityRate / 100);
		double total = subtotal + gratuity;
		
		System.out.println("The gratuity is  R" + gratuity + " and total is R" + total);
	}

}

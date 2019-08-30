package ch2;
/*
 * (Convert feet into meters) Write a program that reads a number in feet, converts it
 * to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
 */

import java.util.Scanner;

public class Ch2_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a value for feet: ");
		double feet = in.nextDouble();

		double meter = 0.305 * feet;
		
		System.out.println(feet + " feet is " + meter + " meters");
	}

}

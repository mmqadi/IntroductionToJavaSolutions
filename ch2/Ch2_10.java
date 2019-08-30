package ch2;

import java.util.Scanner;

/*
 * (Science: calculating energy) Write a program that calculates the energy needed
 * to heat water from an initial temperature to a final temperature. Your program
 * should prompt the user to enter the amount of water in kilograms and the initial
 * and final temperatures of the water. The formula to compute the energy is
 * Q = M * (finalTemperature – initialTemperature) * 4184
 * where M is the weight of water in kilograms, temperatures are in degrees Celsius,
 * and energy Q is measured in joules.
 */
public class Ch2_10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// prompt the user for input
		System.out.print("Enter the amount of water in kilograms: ");
		double m = in.nextDouble();
		System.out.print("Enter the initial temperature: ");
		// initial temperature as t1
		double t1 = in.nextDouble();
		System.out.print("Enter the final temperature");
		// final temperature as t2
		double t2 = in.nextDouble();
		in.close();
		
		double q = m * (t2 - t1) * 4184;
		
		System.out.println("The energy is " + q);
		

	}

}

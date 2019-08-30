package ch2;

import java.util.Scanner;

/*
 * (Physics: acceleration) Average acceleration is defined as the change of velocity
 * divided by the time taken to make the change, as shown in the following formula:
 * (v 1 - v 0 ) / t
 * Write a program that prompts the user to enter the starting velocity v 0 in meters/
 * second, the ending velocity v 1 in meters/second, and the time span t in seconds,
 * and displays the average acceleration.
 */
public class Ch2_9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// get user input
		System.out.print("Enter v0, v1, and t: ");
		double v0 = in.nextDouble();
		double v1 = in.nextDouble();
		double t = in.nextDouble();
		in.close();
		
		double a = (v1 - v0) / t;
		
		System.out.print("The avarage acceleration is " + a);

	}

}

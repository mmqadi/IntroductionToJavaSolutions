package ch4;

import java.util.Scanner;

public class Ch4_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for input.
		System.out.print("Enter the side:");
		
		// Radius input from the user.
		double s = input.nextDouble();
		
		// close the input stream.
		input.close();
		
		// Compute the area give the side of the pentagon.
		double area = (6 * s * s) / (4 * Math.tan(Math.PI / 6));
		
		// Display the output for the user.
		System.out.printf("The area of the hexagon  is %4.2f", area);
	}

}

package ch4;

import java.util.Scanner;

public class Ch4_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for input.
		System.out.print("Enter the number of sides:");
		int n = input.nextInt();
		
		System.out.print("Enter the side:");
		double s = input.nextDouble();
		
		// close the input stream.
		input.close();
		
		// Compute the area give the side of the pentagon.
		double area = (n * s * s) / (4 * Math.tan(Math.PI / n));
		
		// Display the output for the user.
		System.out.printf("The area of the hexagon  is %4.2f", area);
	}
}

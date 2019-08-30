package ch2;

import java.util.Scanner;

public class Ch2_14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double pounds = in.nextDouble();
		System.out.print("Enter height in inches: ");
		double inches = in.nextDouble();
		// close the input stream.
		in.close();
		
		// convert pounds to KGs.
		double kg = pounds * 0.45359237;
		// convert inches to meters.
		double meters = inches * 0.0254;
		
		double ibm = kg / (meters * meters);
		
		System.out.print("IBM is " + ibm);

	}

}

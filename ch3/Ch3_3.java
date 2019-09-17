package ch3;

import java.util.Scanner;

public class Ch3_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a, b, c, d, e, f: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double d = in.nextDouble();
		double e = in.nextDouble();
		double f = in.nextDouble();
		in.close();
		
		double denominator = a * d - b * c;
		
		if(denominator == 0) {
			System.out.println("The equation has no solution");
			System.exit(1);
		}
		else {
			double x = (e * d - b * f) / denominator;
			double y = (a * f - e * c) / denominator;
			
			System.out.println("x is " + x + " and y is " + y);
		}
	}

}

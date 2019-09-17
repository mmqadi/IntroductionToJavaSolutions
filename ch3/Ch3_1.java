package ch3;

import java.util.Scanner;

public class Ch3_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a, b, c: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		in.close();
		
		double discriminant = b * b - 4 * a * c;
		
		if(discriminant < 0) {
			System.out.println("The equation has no real roots");
			System.exit(1);
		}
		else if(discriminant == 0) {
			double y = -b / (2 * a);
			
			System.out.println("The equation has one root" + y);
			System.exit(1);
		}
		else {
			double y1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double y2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			
			System.out.println("The equation has two roots " + y1 + " and " + y2);
			System.exit(1);
		}

	}

}

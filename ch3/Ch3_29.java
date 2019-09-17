package ch3;

import java.util.Scanner;

public class Ch3_29 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter circle1's center x-, y-coordinates and radius: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double r1 = in.nextDouble();
		
		System.out.print("Enter circle1's center x-, y-coordinates and radius: ");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double r2 = in.nextDouble();
		in.close();
		
		double distanceR = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
		
		if(distanceR <= Math.abs(r1 - r2)) {
			System.out.println("Circle2 is inside circle1");
			System.exit(1);
		}
		else if(distanceR <= r1 + r2) {
			System.out.println("Circle2 overlaps circle1");
			System.exit(1);
		}
		else {
			System.out.println("circle2 does not overlap circle1");
		}

	}

}

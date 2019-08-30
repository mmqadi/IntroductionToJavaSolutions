package ch2;

import java.util.Scanner;

public class Ch2_19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter three points of a traingle: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();

		double x3 = in.nextDouble();
		double y3 = in.nextDouble();
		in.close();
		double side1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		
		double side2 = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		
		double side3 = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		
		double s = (side1 + side2 + side3) / 2;
		
		double area = Math.sqrt(s * (s - side1)* (s - side2) * (s - side3));
		
		System.out.println("The area of the triangle is " + area);
	}

}

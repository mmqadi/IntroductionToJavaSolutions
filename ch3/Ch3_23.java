package ch3;

import java.util.Scanner;

public class Ch3_23 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double areaOfRectangle = 10 * 5;
		
		System.out.print("Enter two coordinates: ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		in.close();
		double x_ = Math.abs(x);
		double y_ = Math.abs(y);
		
		double areaOfPoint = 4 * y_ * x_;
		
		System.out.println("The point (" + x + ", " + y + ") is " +(areaOfPoint > areaOfRectangle?"not ":"") + "in the rectangle");
		
	}

}

package ch3;

import java.util.Scanner;

public class Ch3_22 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		
		double x = in.nextDouble();
		double y = in.nextDouble();
		in.close();
		
		double distance = Math.sqrt(x * x + y * y);
		
		System.out.println("The point (" + x + ", " + y + ") is " +(distance >= 10?"not ":"") + "in the circle");
	}

}

package ch6;

import java.util.Scanner;

public class Ch6_35 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		
		System.out.println("The area of the pentagon is " + area(side));
		input.close();
		

	}
	
	public static double area(double side) {
		return (5 * side * side) / (4 * Math.tan(Math.PI / 5.0));
	}

}

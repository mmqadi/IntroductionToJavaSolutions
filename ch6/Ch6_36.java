package ch6;

import java.util.Scanner;

public class Ch6_36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of sides: ");
		int n = input.nextInt();
		
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		
		System.out.println("The area of the pentagon is " + area(n, side));
		input.close();

	}
	
	public static double area(int n, double side) {
		return (n * side * side) / (4 * Math.tan(Math.PI / n));
	}
}

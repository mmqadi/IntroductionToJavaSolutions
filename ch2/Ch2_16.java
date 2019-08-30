package ch2;

import java.util.Scanner;

public class Ch2_16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the side: ");
		double side = in.nextDouble();
		in.close();
		double area = (3 * Math.sqrt(3))/ 2.0 * side * side;
		
		System.out.println("The area of the hexagon is " + area);

	}

}

package ch2;

import java.util.Scanner;

public class Ch2_12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the speed and acceleration: ");
		double speed = in.nextDouble();
		double acceleration = in.nextDouble();
		in.close();
		
		double length = (speed * speed) / (2 * acceleration);
		System.out.println("The minimum runway length for this airplane is " + length);
		

	}

}

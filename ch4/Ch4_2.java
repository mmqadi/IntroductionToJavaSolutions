package ch4;
import java.util.Scanner;

public class Ch4_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius =  6371;
		// Prompt the user for input.
		System.out.print("Enter a point 1 (latitude and longitude) in degrees: ");
		double lat1 = input.nextDouble();
		double long1 = input.nextDouble();

		System.out.print("Enter a point 1 (latitude and longitude) in degrees: ");
		double lat2 = input.nextDouble();
		double long2 = input.nextDouble();
		
		// Close the scanner.
		input.close();
		
		// Convert input to radians.
		lat1 = Math.toRadians(lat1);
		long1 = Math.toRadians(long1);
		lat2 = Math.toRadians(lat2);
		long2 = Math.toRadians(long2);

		// Compute the arccos parameter.
		double arccosParm =  Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);

		// Compute the distance.
		
		double distance = radius  * Math.acos(arccosParm);
		
		System.out.println("The distance between the two points is " + distance);
	}
}

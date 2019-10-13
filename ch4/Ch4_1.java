package ch4;
import java.util.Scanner;

public class Ch4_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for input.
		System.out.print("Enter the length from the center to the vertex: ");
		
		// Radius input from the user.
		double radius = input.nextDouble();
		
		// close the input stream.
		input.close();
		
		// Compute the side of the pentagon given the radius.
		double  s = 2 * radius * Math.sin(Math.PI / 5);
		
		// Compute the area give the side of the pentagon.
		double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));
		
		// Display the output for the user.
		System.out.printf("The area of the pantagon  is %4.2f", area);
	}

}

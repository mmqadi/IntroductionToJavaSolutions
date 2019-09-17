package ch3;
import java.util.Scanner;

public class Ch3_27 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		in.close();
		
		System.out.print("The point is " + (y <= -0.5 * x + 100?"":"not ") + "in the traingle");

	}

}

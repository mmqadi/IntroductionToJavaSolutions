package ch3;
import java.util.Scanner;
public class Ch3_19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the three edges of a triangle: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		in.close();
		
		if((a + b < c) || (a + c < b) || (b + c < a)) {
			System.out.print("Invalid triange");
			System.exit(1);
		}
		else {
			double perimeter = a + b + c;
			System.out.println("The perimeter of the triangle is" + perimeter);
		}
			
	}

}

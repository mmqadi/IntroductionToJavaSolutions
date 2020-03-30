package ch6;
import java.util.Scanner;
public class Ch6_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three side lengths of a triangle: ");
		
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		input.close();
		
		System.out.println(MyTriangle.isValid(side1, side2, side3)?"The area of the triangle is " + MyTriangle.area(side1, side2, side3):"Invalid triangle");
	}
	
}

class MyTriangle {
	
	public static boolean isValid(double side1, double side2, double side3) {
		return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
	}
	
	public static double area(double side1, double side2, double side3) {
		
		double p = (side1 + side2 + side3) / 2;
		
		return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
	}
}

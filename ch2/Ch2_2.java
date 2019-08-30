package ch2;
/*
 * (Compute the volume of a cylinder) Write a program that reads in the radius
 * and length of a cylinder and computes the area and volume using the following
 * formulas:
 * 		area = radius * radius * pi
 * 		volume = area * length
 */
import java.util.Scanner;

public class Ch2_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = in.nextDouble();
		double length = in.nextDouble();
		
		double area = radius * radius * Math.PI;
		double volume = area * length;
		
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}

}

package ch2;

import java.util.Scanner;

public class Ch2_23 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the driving distance: ");
		double distance = in.nextDouble();
		
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = in.nextDouble();
		
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = in.nextDouble();
		in.close();
		
		double cost = pricePerGallon * distance / milesPerGallon;
		
		System.out.println("The cost of driving is " + cost);
	}

}

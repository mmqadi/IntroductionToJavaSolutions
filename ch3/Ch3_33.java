package ch3;

import java.util.Scanner;

public class Ch3_33 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter weight and price for package 1: ");
		double weight1 = in.nextDouble();
		double price1 = in.nextDouble();
		
		System.out.print("Enter weight and price for package 2: ");
		double weight2 = in.nextDouble();
		double price2 = in.nextDouble();
		
		in.close();
		
		double pricePerWeight1 = price1 / weight1;
		double pricePerWeight2 = price2 / weight2;
		
		if(pricePerWeight1 < pricePerWeight2)
			System.out.println("package 1 has the better price");
		else if(pricePerWeight1 > pricePerWeight2)
			System.out.println("package 2 has the better price");
		else 
			System.out.println("The two packages have the same price");
	}

}

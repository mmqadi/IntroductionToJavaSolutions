package ch3;

import java.util.Scanner;

public class Ch3_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double pounds = in.nextDouble();
		System.out.print("Enter feet: ");
		double feet = in.nextDouble();
		System.out.print("Enter inches: ");
		double inches = in.nextDouble();
		in.close();
		
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METER_PER_INCH = 0.0254;
		final double METERS_PER_FEET = 0.3048;
		
		//compute IBM
		
		double weightInKilograms = pounds * KILOGRAMS_PER_POUND;
		double heightInMeters = feet * METERS_PER_FEET + inches * METER_PER_INCH;
		
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		
		System.out.println("MBI is " + bmi);
		
		if(bmi < 18.5)
			System.out.println("Underweight");
		else if(bmi < 25)
			System.out.println("Normal");
		else if(bmi < 30)
			System.out.println("Overweight");
		else
			System.out.print("Obese");
	}

}

package ch3;

import java.util.Scanner;

public class Ch3_20 {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
		double temperature = in.nextDouble();
		if(temperature < -58 || temperature > 41)
		{
			System.out.println("Invalid input");
			System.exit(1);
		}
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double wind = in.nextDouble();
		if(wind < 2)
		{
			System.out.println("Invalid input");
			System.exit(1);
		}
		in.close();
		
		double chillIndex = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(wind, 0.16) + 0.4275
				* temperature * Math.pow(wind, 0.16);
		
		System.out.print("The chill index is " + chillIndex);

	}

}

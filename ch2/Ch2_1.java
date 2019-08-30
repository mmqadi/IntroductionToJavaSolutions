package ch2;

/*
 * Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in 
 * a double value from the console, then converts it to Fahrenheit and displays the
 * result. The formula for the conversion is as follows:
 * fahrenheit = (9 / 5) * celsius + 32
 */

import java.util.Scanner;

public class Ch2_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a degee in Celsius: ");
		double degree = in.nextDouble();
		
		double fan = (9.0 / 5) * degree + 32;
		
		System.out.println(degree + " Celsius is " + fan + " Fahrenheit");
		
		

	}

}

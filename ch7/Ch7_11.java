package ch7;

import java.util.Scanner;

public class Ch7_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double numbers[] = new double[10];
		
		System.out.print("Enter ten numbers: ");
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();
		
		input.close();
		System.out.println("The mean is: " + mean(numbers));
		System.out.println("The standard deviation is " + deviation(numbers));

	}
	
	public static double mean(double[] x) {
		double sum = 0;
		
		for(int i = 0; i < x.length; i++)
			sum += x[i];
		
		return sum / x.length;
	}
	
	public static double deviation(double[] x) {
		double mean = mean(x);
		
		double numerator = 0;
		
		for(int i = 0; i < x.length; i++) {
			numerator += Math.pow((x[i] - mean), 2);
		}
		
		return Math.sqrt(numerator/(x.length - 1));
		
	}
	
}

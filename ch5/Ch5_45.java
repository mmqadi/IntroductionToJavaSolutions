package ch5;

import java.util.Scanner;

public class Ch5_45 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 10 numbers: ");
		double sum = 0;
		
		int sumDataSq = 0;
		for(int i = 0; i < 10; i++) {
			double num = input.nextDouble();
			
			sum += num;
			sumDataSq += num * num;
		}
		input.close();
		double mean = sum / 10.0;
		
		double deviation = Math.sqrt((sumDataSq - (sum * sum) / 10) / 9);
		System.out.println("The mean is " + mean);
		System.out.printf("The standard deviation is %.5f", deviation);

	}

}

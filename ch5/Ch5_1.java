package ch5;

import java.util.Scanner;

public class Ch5_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer, the input end if it is 0: ");
		
		int value = input.nextInt();
		
		if(value == 0) {
			System.out.println("No numbers were entered except 0");
			System.exit(0);
		}
			
		int noOfPositive = 0;
		int noOfNegative = 0;
		double sum = 0.0;
		
		while(value != 0) {
			
			if(value > 0)
				noOfPositive++;
			else
				noOfNegative++;
			sum += value;
			
			
			value = input.nextInt();
		}
		input.close();
		double avarage = sum / (noOfNegative + noOfPositive);
		
		System.out.println("The number of positives is " + noOfPositive);
		System.out.println("The number of positives is " + noOfNegative);
		System.out.println("The total is "+ sum);
		System.out.println("The avarage is "+ avarage);

	}

}

package ch7;

import java.util.Scanner;

public class Ch7_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];
		System.out.print("Enter 10 integers: ");
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();
		
		selectionSort(numbers);
		
		System.out.println("The numbers in their increasing order are: ");
		for(int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i] + " ");
		
		input.close();
	}
	
	public static void selectionSort(double[] list) {
	/*	for(int i = list.length - 1; i >= 0; i--) {
			
			double currentMax = list[i];
			int currentMaxIndex = i;
			
			for(int j = i - 1; j >= 0; j--) {
				if(currentMax < list[j]) {
					currentMaxIndex = j;
				}
			}
			
			if(currentMaxIndex != i) {
				double temp = list[currentMaxIndex];
				list[currentMaxIndex] = currentMax;
				list[i] = temp;
			}
		} */
	}
}

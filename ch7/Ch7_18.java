package ch7;

import java.util.Scanner;

public class Ch7_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		System.out.print("Enter 10 integers: ");
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextInt();
		
		input.close();
		bubbleSort(numbers);
		System.out.println("The numbers in their increasing order are: ");
		for(int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i] + " ");
		
	}

	
	public static void bubbleSort(int[] numbers) {
		
		for(int i = 0; i < numbers.length - 1; i++)
			for(int j = 0; j < numbers.length - 1 -i; j++)
				if(numbers[j] > numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
	}

}

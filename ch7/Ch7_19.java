package ch7;

import java.util.Scanner;

public class Ch7_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers;
		System.out.print("Enter list:  ");
		int size = input.nextInt();
		numbers = new int[size];
		
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextInt();
		
		input.close();
		System.out.print("The list is " + (isSorted(numbers)?"already ":"not ") + "sorted");

	}
	
	public static boolean isSorted(int[] list) {
		
		
		for(int i = 0; i < list.length-2; i++)
			if(list[i] > list[i+1])
				return false;
		
		return true;
	}
}

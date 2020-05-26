package ch7;

import java.util.Scanner;

public class Ch7_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[10];
		
		System.out.print("Enter 10 numbers: ");
		
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextInt();
		
		input.close();
		int[] unique = eliminateDuplicates(numbers);
		
		for(int i = 0; i < unique.length; i++)
			System.out.print(unique[i] + " ");

	}
	
	public static int[] eliminateDuplicates(int[] list) {
		
		int array[] = new int[list.length];
		
		int counter = 0;
		
		for(int i = 0; i < list.length; i++) {
			boolean unique = true;
			for(int j = 0; j <= counter; j++) {
				if(array[j] == list[i]) {
					unique = false;
					break;
				}
			}
			if(unique) {
				array[counter] = list[i];
				counter++;
			}
		}
		
		int newList[] = new int[counter];
		
		for(int i = 0; i < newList.length; i++)
			newList[i] = array[i];
		
		return newList;
	}

}

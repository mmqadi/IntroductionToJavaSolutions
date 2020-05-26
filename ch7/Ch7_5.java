package ch7;

import java.util.Scanner;

public class Ch7_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[10];
		System.out.print("Enter ten numbers: ");
		
		int count = 0;
		for(int i = 0; i < 10; i++) {
			int num = input.nextInt();
			boolean isDistinct = true;
			
			for(int j = 0; j < numbers.length; j++) {
				if(numbers[j] == num) {
					isDistinct = false;
					break;
				}
				
			}
			if(isDistinct) {
				numbers[count] = num;
				count++;
			}
		}
		
		input.close();
		System.out.println("The number of distinct numbers is " + count);
		System.out.print("The distinct numbers are: ");
		
		for(int i = 0; i < count; i++)
			System.out.print(numbers[i] +" ");
		

	}

}

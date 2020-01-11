package ch5;

import java.util.Scanner;

public class Ch5_41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a series of numbers end your input with 0: ");
		
		int max = Integer.MIN_VALUE;
		int maxCount = 0;
		 int number;
		
		 do {
			 number = input.nextInt();
			 
			 if(number > max) {
				 max = number;
				 maxCount = 1;
			 }
			 else if(number == max)
				 maxCount++;
		 } while(number != 0);
		 
		 input.close();
		 System.out.println("The largest number is " + max);
		 System.out.println("The occurrence count of the largest number is " + maxCount);
	}

}
